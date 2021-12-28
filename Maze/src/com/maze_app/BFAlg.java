package com.maze_app;

import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class BFAlg {

    private static Entrance m_entrance;
    private static Vector<Exit> m_exits;
    private static int rLimit, cLimit;
    private static final int[] rowDirVec = {-1, 0, 1, 0}; // up, right, down, left
    private static final int[] colDirVec = {0, 1, 0, -1};
    private static int move_count = 1;
    private static Vector<Vector<Cell>> list_of_solutions;

    public static void setUp(Entrance en, Vector<Exit> exs, int rows, int cols) {
        m_entrance = en;
        m_exits = exs;
        rLimit = rows;
        cLimit = cols;
    }

    public static boolean start(Cell[][] grid) {

        if (m_entrance == null || m_exits == null) return false;

        LinkedList<Cell> searchQ = new LinkedList<>();
        searchQ.addFirst(m_entrance);

        while (!searchQ.isEmpty()){
            move_count+=1;
            searchQ.getFirst().setVisited(true);
            Vector<Cell> neighbours = getNeighbours(searchQ.getFirst(),grid);
            for (Cell eachNeighbour: neighbours){
                searchQ.addLast(eachNeighbour);
            }
            searchQ.removeFirst();
        }
        return true;
    }

    public static Vector<Cell> getNeighbours(Cell cell,Cell[][] grid) {

        int currentPosX = cell.x;
        int currentPosY = cell.y;
        Vector <Cell> neighbours = new Vector<>();
        //check for valid neighbours
        int clockWiseCount;
        for (clockWiseCount = 0; clockWiseCount < 4; clockWiseCount++) {
            int auxR = currentPosX + rowDirVec[clockWiseCount];
            int auxC = currentPosY + colDirVec[clockWiseCount];
            if (auxR < 0 || auxC < 0) continue;
            if (auxR >= rLimit || auxC >= cLimit) continue;
            if(grid[auxR][auxC].getType() == Cell.CellType.ROAD){
                neighbours.addElement(grid[auxR][auxC]);
                Road a = (Road) neighbours.elementAt(neighbours.size()-1);
                if (a.wasVisited()) {
                    neighbours.removeElementAt(neighbours.size()-1);
                    continue;
                }
                a.setPreviousRoad(cell);
                switch(clockWiseCount){

                    case 0 : // up
                            a.setArrow(Road.Arrows.up);
                            break;
                    case 1 : //right
                            a.setArrow(Road.Arrows.right);
                            break;
                    case 2 : //down
                           a.setArrow(Road.Arrows.down);
                            break;
                    case 3 : //left
                            a.setArrow(Road.Arrows.left);
                            break;
                }
            }
            if(grid[auxR][auxC].getType() == Cell.CellType.EXIT){
                neighbours.addElement(grid[auxR][auxC]);
                Exit a = (Exit) neighbours.elementAt(neighbours.size()-1);
                if (a.wasVisited()) {
                    neighbours.removeElementAt(neighbours.size()-1);
                    continue;
                }
                a.setBackground(Color.pink);
                a.setPreviousRoad(cell);
            };
        }
        return neighbours;
    }
}

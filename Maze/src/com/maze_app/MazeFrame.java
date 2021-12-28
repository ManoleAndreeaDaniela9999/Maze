package com.maze_app;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class MazeFrame extends JFrame {

    private Cell[][] m_maze;
    private Entrance[] m_entrance;
    private Vector<Exit> m_exits;

    public MazeFrame() {
        this.setTitle("Graf menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 500);
        //this.setLayout(new GridLayout(m_maze.length, m_maze.length));
        //STEP 1 :READ MATRIX AND SET UP THE MAZE
        m_exits = new Vector<Exit>();
        m_entrance = new Entrance[1];
        try {
            m_maze = Utils.readMazeMatrix(m_entrance, m_exits);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Caught IO Exception");
            e.printStackTrace();
        }
        this.setLayout(new GridLayout(m_maze.length, m_maze[0].length));
        //TODO: STEP 2 :APPLY bf ALG
        BFAlg.setUp(m_entrance[0], m_exits);
        BFAlg.start(m_maze); //TODO: work here
        //STEP 3 : JUST BUILD MATRIX
        BuildMaze();
        this.setVisible(true);
    }

    private void BuildMaze() {
        for (Cell[] eachRow : m_maze) {
            for (Cell cell : eachRow) {
                this.add(cell);
            }
        }
    }
}

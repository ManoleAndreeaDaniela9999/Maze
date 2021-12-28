package com.maze_app;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MazeFrame extends JFrame {

    Point cellSize;
    private Cell[][] m_maze;

    public MazeFrame(){
        this.setTitle("Graf menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 500);
        //this.setLayout(new GridLayout(m_maze.length, m_maze.length));
        //TODO: STEP 1 :READ MATRIX AND SET UP THE MAZE
        try {
            m_maze = Utils.readMazeMatrix();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Caught IO Exception");
            e.printStackTrace();
        }
        this.setLayout(new GridLayout(m_maze.length, m_maze[0].length));
        //TODO: STEP 2 :APPLY bf ALG

        //TODO: STEP 3 : JUST BUILD MATRIX
        BuildMaze();
        this.setVisible(true);
    }

    private void BuildMaze() {
        for(Cell[] eachRow : m_maze){
            for(Cell cell : eachRow)
            {
                this.add(cell);
            }
        }
    }
}

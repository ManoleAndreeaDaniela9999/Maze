package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class MazeFrame extends JFrame {

    Point cellSize;

    public MazeFrame(){
        this.setTitle("Graf menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}

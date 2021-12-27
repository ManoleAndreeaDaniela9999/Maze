package com.maze_app;


import javax.swing.*;
import java.awt.*;

public class Wall extends JButton implements Cell {

    public Wall() {
        this.setText("w");
        this.setSize(10, 10); // ????
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @Override
    public CellType getType() {
        return CellType.WALL;
    }

    @Override
    public void MarkAsSolution() {

    }

    @Override
    public String toString() {
        return "0";
    }
}

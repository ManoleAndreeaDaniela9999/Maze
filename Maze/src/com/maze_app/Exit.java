package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Exit extends Cell {

    public int x , y;

    public Exit(int x , int y) {
        this.setText("exit");
        this.setSize(10, 10);
        this.setBackground(Color.red);
        this.setForeground(Color.black);
        this.setFocusable(false);
        this.setEnabled(false);
        this.x = x;
        this.y = y;
    }

    @Override
    public CellType getType() {
        return CellType.EXIT;
    }

    @Override
    public String toString() {
        return "3";
    }
}

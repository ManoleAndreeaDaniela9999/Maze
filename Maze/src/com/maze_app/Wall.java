package com.maze_app;


import javax.swing.*;
import java.awt.*;

public class Wall extends Cell {

    public Wall(int x, int y) {
        this.setText("w");
        this.setSize(10, 10); // ????
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
        this.x = x;
        this.y = y;
    }

    @Override
    public CellType getType() {
        return CellType.WALL;
    }

    @Override
    void setPreviousRoad(Cell previousRoad) {

    }

    @Override
    Cell getPreviousRoad() {
        return null;
    }

    @Override
    void setVisited(boolean wasVisited) {
    }

    @Override
    boolean wasVisited() {
        return true;
    }

    @Override
    public String toString() {
        return "0";
    }
}

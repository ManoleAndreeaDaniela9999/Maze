package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Entrance extends Cell {

    public int x , y;

    public Entrance(int x , int y) {
        this.setText("entrance");
        this.setSize(10, 10);
        this.setBackground(Color.blue);
        this.setForeground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
        this.x = x;
        this.y = y;
    }

    public Entrance(Entrance e){
        this.x = e.x;
        this.y = e.y;
    }
    @Override
    public CellType getType() {
        return CellType.ENTRANCE;
    }

    @Override
    public String toString() {
        return "2";
    }
}

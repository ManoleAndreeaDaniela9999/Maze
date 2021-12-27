package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Entrance extends JButton implements Cell {

    public Entrance() {
        this.setText("entrance");
        this.setSize(10, 10);
        this.setBackground(Color.blue);
        this.setForeground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @Override
    public CellType getType() {
        return CellType.ENTRANCE;
    }

    @Override
    public void MarkAsSolution() {
        
    }

    @Override
    public String toString() {
        return "2";
    }
}

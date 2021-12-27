package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Exit extends JButton implements Cell {

    public void Exit() {
        this.setSize(10, 10);
        this.setBackground(Color.red);
        this.setFocusable(false);
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

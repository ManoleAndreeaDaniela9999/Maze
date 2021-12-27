package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Entrance extends JButton implements Cell {

    public void Wall() {
        this.setSize(10, 10);
        this.setBackground(Color.blue);
        this.setFocusable(false);
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

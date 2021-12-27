package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Road extends JButton implements Cell{
    public void Road() {
        this.setSize(10, 10);
        this.setBackground(Color.white);
        this.setFocusable(false);
    }

    @Override
    public CellType getType() {
        return CellType.ROAD;
    }

    @Override
    public String toString() {
        return "1";
    }
}

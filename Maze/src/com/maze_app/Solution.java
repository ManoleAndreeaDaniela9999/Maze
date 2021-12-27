package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Solution extends JButton implements Cell {

    public Solution() {
        this.setText("s");
        this.setSize(10, 10); // ????
        this.setBackground(Color.green);
        this.setForeground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @Override
    public CellType getType() {
        return CellType.SOLUTION;
    }

    @Override
    public String toString() {
        return "4";
    }
}
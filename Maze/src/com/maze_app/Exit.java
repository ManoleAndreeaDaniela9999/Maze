package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Exit extends JButton implements Cell {

    public Exit() {
        this.setText("exit");
        this.setSize(10, 10);
        this.setBackground(Color.red);
        this.setForeground(Color.black);
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @Override
    public CellType getType() {
        return CellType.EXIT;
    }

    @Override
    public void MarkAsSolution() {

    }

    @Override
    public String toString() {
        return "3";
    }
}

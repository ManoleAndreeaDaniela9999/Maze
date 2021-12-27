package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Road extends JButton implements Cell{


    public Road() {
        this.setText("r");
        this.setSize(10, 10);
        this.setBackground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
    }

    @Override
    public CellType getType() {
        return CellType.ROAD;
    }

    @Override
    public String toString() {
        return "1";
    }

    public void MarkAsSolution(){
        this.setBackground(Color.green);
    }
}

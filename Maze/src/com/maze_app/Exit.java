package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Exit extends Cell {

    private boolean m_wasVisited;

    public Exit(int x, int y) {
        this.setText("exit");
        this.setSize(10, 10);
        this.setBackground(Color.red);
        this.setForeground(Color.black);
        this.setFocusable(false);
        this.setEnabled(false);
        this.x = x;
        this.y = y;
        m_wasVisited = false;
    }

    @Override
    public CellType getType() {
        return CellType.EXIT;
    }

    @Override
    void setPreviousRoad(Cell previousRoad) {
        m_prevRoad = previousRoad;
    }

    @Override
    Cell getPreviousRoad() {
        return m_prevRoad;
    }

    @Override
    public String toString() {
        return "3";
    }

    public boolean wasVisited() {
        return m_wasVisited;
    }

    public void setVisited(boolean wasVisited) {
        m_wasVisited = wasVisited;
    }
}

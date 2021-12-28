package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Road extends Cell {

    private Road m_prevRoad;
    private boolean m_wasVisited;
    public int x, y;

    public class Arrows {
        public String up = "↑";
        public String right = "→";
        public String down = "↓";
        public String left = "←";

    }

    public Road(int x, int y) {
        this.setText("r");
        this.setSize(10, 10);
        this.setBackground(Color.white);
        this.setFocusable(false);
        this.setEnabled(false);
        m_wasVisited = false;
        this.x = x;
        this.y = y;
    }

    @Override
    public CellType getType() {
        return CellType.ROAD;
    }

    @Override
    public String toString() {
        return "1";
    }

    public void markAsSolution() {
        this.setBackground(Color.green);
    }

    public void setPreviousRoad(Road previousRoad) {
        m_prevRoad = previousRoad;
    }

    public void setVisited(boolean wasVisited) {
        m_wasVisited = wasVisited;
    }

    public boolean wasVisited() {
        return m_wasVisited;
    }

    public void setArrow(String arrowMember) {
        this.setText(arrowMember);
    }
}

package com.maze_app;

import javax.swing.*;
import java.awt.*;

public class Road extends Cell {

    public static class Arrows {
        public static String up = "↑";
        public static String right = "→";
        public static String down = "↓";
        public static String left = "←";

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
    void setPreviousRoad(Cell previousRoad) {
        m_prevRoad = previousRoad;
    }

    @Override
    Cell getPreviousRoad() {
        return m_prevRoad;
    }

    @Override
    public String toString() {
        return "1";
    }

    //public void markAsSolution() {this.setBackground(Color.green); }

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

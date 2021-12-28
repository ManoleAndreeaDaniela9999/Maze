package com.maze_app;

import javax.swing.*;

public abstract class Cell extends JButton {

    public int x, y;
    protected Cell m_prevRoad;
    protected boolean m_wasVisited;

    enum CellType {
        WALL,
        ROAD,
        ENTRANCE,
        EXIT
    }

    abstract CellType getType();

    abstract void setPreviousRoad(Cell previousRoad);

    abstract Cell getPreviousRoad();

    abstract void setVisited(boolean wasVisited);
    abstract boolean wasVisited();
}

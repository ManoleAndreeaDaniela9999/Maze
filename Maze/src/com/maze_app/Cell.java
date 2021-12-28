package com.maze_app;

import javax.swing.*;

public abstract class Cell extends JButton {

    enum CellType{
        WALL,
        ROAD,
        ENTRANCE,
        EXIT
    }
    abstract CellType getType();
}

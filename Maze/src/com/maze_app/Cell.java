package com.maze_app;

public interface Cell {

    enum CellType{
        WALL,
        ROAD,
        ENTRANCE,
        EXIT,
        SOLUTION
    }
    //void setType(CellType cellType);
    CellType getType();
}

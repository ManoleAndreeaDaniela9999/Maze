package com.maze_app;

public interface Cell {

    enum CellType{
        WALL,
        ROAD,
        ENTRANCE,
        EXIT
    }
    //void setType(CellType cellType);
    CellType getType();
    void setSize(int sizeX, int sizeY);
}

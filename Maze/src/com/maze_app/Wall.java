package com.maze_app;


import javax.swing.*;
import java.awt.*;

public class Wall extends JButton implements Cell {

    int m_sizeX, m_sizeY;

    public void Wall() {
        this.setSize(10, 10); // ????
        this.setBackground(Color.black);
        this.setFocusable(false);
    }

    @Override
    public CellType getType() {
        return CellType.WALL;
    }

    public void setSize(int sizeX, int sizeY) {
        m_sizeX = sizeX;
        m_sizeY = m_sizeY;
        this.setSize(sizeX, sizeY);
    }

    @Override
    public String toString() {
        return "0";
    }
}

package com.maze_app;

import java.util.Vector;

public class BFAlg {

    private static Entrance m_entrance;
    private static Vector<Exit> m_exits;

    public static void setUp(Entrance en, Vector<Exit> exs) {
        m_entrance = en;
        m_exits = exs;
    }

    public static boolean start(Cell[][] grid) {

        if (m_entrance == null) return false;
        if (m_exits == null) return false;
        return true;
    }
}

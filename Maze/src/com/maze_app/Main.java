package com.maze_app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("MazeApp Opened");
        MazeFrame mazeFrame = MazeFactory.initMaze();
        System.out.println("MazeAppClosed");
    }
}

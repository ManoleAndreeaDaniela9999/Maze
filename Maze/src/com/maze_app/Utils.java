package com.maze_app;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Utils {

    static Cell[][] readMazeMatrix(Entrance[] en, Vector<Exit> exs) throws IOException {
        FileReader fileReader = new FileReader("src/com/maze_app/maze.txt");
        Scanner input = new Scanner(fileReader);
        // pre-read in the number of rows/columns
        int rows = 0;
        int columns = 0;
        Vector<String> mazeEncoding = new Vector<>();
        while (input.hasNextLine()) {
            ++rows;
            mazeEncoding.add(input.nextLine());
        }
        if (!mazeEncoding.isEmpty()) {
            columns = mazeEncoding.elementAt(0).length();
        }

        input.close();
        fileReader.close();

        Cell[][] maze = new Cell[rows][columns];


        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                switch (mazeEncoding.elementAt(i).charAt(j)) {
                    default:
                        maze[i][j] = new Wall(i, j);
                        break;
                    case '1':
                        maze[i][j] = new Road(i, j);
                        break;
                    case '2':
                        en[0] = new Entrance(i, j);
                        maze[i][j] = en[0];
                        break;
                    case '3':
                        maze[i][j] = new Exit(i, j);
                        exs.addElement((Exit) maze[i][j]);
                        break;
                }
            }
        }
//        Road a = (Road)maze[1][2];
//        a.markAsSolution();
        return maze;
    }
}

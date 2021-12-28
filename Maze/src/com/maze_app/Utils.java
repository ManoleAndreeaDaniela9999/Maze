package com.maze_app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Utils {

    static Cell[][] readMazeMatrix() throws IOException {
        FileReader fileReader = new FileReader("src/com/maze_app/maze.txt");
        Scanner input = new Scanner(fileReader);
        // pre-read in the number of rows/columns
        int rows = 0;
        int columns = 0;
        Vector<String> mazeEncoding = new Vector<String>();
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
                        maze[i][j] = new Wall();
                        break;
                    case '1':
                        maze[i][j] = new Road();
                        break;
                    case '2':
                        maze[i][j] = new Entrance();
                        break;
                    case '3':
                        maze[i][j] = new Exit();
                        break;
                }
            }
        }
        return maze;
    }
}

package com.gojek.conwaygameoflife;

public class Universe {

    private int[][] grid;
    private int height;
    private int width;

    public Universe(int height, int width) {
        this.height = height;
        this.width = width;
        this.grid = new int[height][width];
    }

    public void printUniverse() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public int countNeighbors(int x, int y) {
        int neighbors = 0;
        int heightDir[] = {0,1,1,1,0,-1,-1,-1};
        int widthDir[]  = {-1,-1,0,1,1,1,0,-1};

        //count neighbor logic
        for (int i = 0; i < heightDir.length; i++){
            int heightCheck = getGrid()[y][x] + heightDir[i];
            int widthCheck = getGrid()[y][x] + widthDir[i];

            if ((heightCheck >= 0 && heightCheck < getHeight()) && (widthCheck >= 0 && widthCheck < getWidth()) && getGrid()[heightCheck][widthCheck] == 1) {
                neighbors++;
            }
        }

        return neighbors;
    }

    public Universe updateUniverse() {
        Universe newUniverse = new Universe(getHeight(), getWidth());
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; y < getWidth(); x++) {
                int neighbors = countNeighbors(x, y);
                if (getGrid()[y][x] == 1) {
                    if (neighbors < 2) {
                        newUniverse.getGrid()[y][x] = 0;
                    } else if (neighbors == 2 || neighbors == 3) {
                        newUniverse.getGrid()[y][x] = 1;
                    } else {
                        newUniverse.getGrid()[y][x] = 0;
                    }
                }
                else {
                    if (neighbors == 3) {
                        newUniverse.getGrid()[y][x] = 1;
                    }
                }
            }
        }
        return newUniverse;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

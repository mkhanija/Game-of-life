package com.gojek.conwaygameoflife;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConwayGameOfLife {
    public static void main(String[] args) {
        Universe universe = new Universe(5, 5);
        initializeUniverse(universe);

        for (int i = 0; i < 10; i++) {
            universe.printUniverse();
            universe.updateUniverse();
        }
    }

    public static void initializeUniverse(Universe universe) {
        Scanner sc = null;

        try {
            sc = new Scanner(new FileInputStream("./src/main/resources/input.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File is not found. Please check your input file.");
        }

        String thisLineString;
        String[] thisLineStringArray;
        int[] thisLineIntArray;
        ArrayList<int[]> initialArrayList = new ArrayList<int[]>();

        while (sc.hasNextLine()) {
            thisLineString = sc.nextLine();
            thisLineStringArray = thisLineString.split(",");
            thisLineIntArray = new int[thisLineStringArray.length];
            for (int i = 0; i < thisLineStringArray.length; i++) {
                thisLineIntArray[i] = Integer.parseInt(thisLineStringArray[i]);
            }
            initialArrayList.add(thisLineIntArray);
        }
        int[][] initialArray = new int[initialArrayList.size()][initialArrayList.get(0).length];

        for (int y = 0; y < initialArrayList.size(); y++) {
            for (int x = 0; x < initialArrayList.get(0).length; x++) {
                initialArray[y][x] = initialArrayList.get(y)[x];
            }
        }

        universe.setGrid(initialArray);
    }

}

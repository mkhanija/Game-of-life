package com.gojek.conwaygameoflife;

import com.gojek.conwaygameoflife.ConwayGameOfLife;
import org.junit.Test;
import static org.junit.Assert.*;

public class UniverseTest {

    @Test
    public void testConstructor() {
        Universe universe = new Universe(15, 15);

        assertEquals(universe.getHeight(), 15);
        assertEquals(universe.getWidth(), 15);

        int[][] answer = new int[15][15];
        assertArrayEquals(universe.getGrid(), answer);
    }

    @Test
    public void testCountNeighbors() {
        Universe universe = new Universe(3, 3);
        int[][] tester = new int[3][3];
        tester[0][0] = 1;
        tester[1][0] = 1;
        tester[2][0] = 1;

        universe.setGrid(tester);

        assertEquals(universe.countNeighbors(1,1), 3);
        assertEquals(universe.countNeighbors(0,0), 1);
        assertEquals(universe.countNeighbors(0, 1), 2);
        assertEquals(universe.countNeighbors(0,2), 1);

        tester[0][1] = 1;
        tester[0][2] = 1;
        tester[1][2] = 1;
        tester[2][1] = 1;
        tester[2][2] = 1;
        assertEquals(universe.countNeighbors(1,2), 4);
        assertEquals(universe.countNeighbors(2,2), 2);
        assertEquals(universe.countNeighbors(2,1), 4);
        assertEquals(universe.countNeighbors(2,0), 2);
    }

    @Test
    public void testProcessUniverse() {
        Universe universe = new Universe(3, 3);
        int[][] initial = new int [3][3];
        initial[1][0] = 1;
        initial[1][1] = 1;
        initial[1][2] = 1;

        universe.setGrid(initial);

        int[][] ans = new int [3][3];
        ans[0][1] = 1;
        ans[1][1] = 1;
        ans[2][1] = 1;

        universe.updateUniverse();
        assertArrayEquals(universe.getGrid(), ans);
    }
}

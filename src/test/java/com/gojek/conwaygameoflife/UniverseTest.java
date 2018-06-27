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
        assertEquals(universe.getGrid(), answer);
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
    }

    @Test
    public void testProcessUniverse() {
    }

    @Test
    public void testUpdateUniverse() {
    }
}

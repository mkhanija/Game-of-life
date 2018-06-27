#Project Name: ConwayGameOfLife
Project Description: 
The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970.

The game is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves, or, for advanced players, by creating patterns with particular properties.

There are 4 main rules:
1. Any live cell with fewer than two live neighbors dies, as if by under population.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

Dev Env Setup: 
java version "1.8.0_171” 

Java(TM) SE Runtime Environment (build 1.8.0_171-b11)

Java HotSpot(TM) 64-Bit Server VM (build 25.171-b11, mixed mode)

Gradle 4.8.1

Build time:   2018-06-21 07:53:06 UTC

Revision:     0abdea078047b12df42e7750ccba34d69b516a22


Groovy:       2.4.12

Ant:          Apache Ant(TM) version 1.9.11 compiled on March 23 2018

JVM:          1.8.0_171 (Oracle Corporation 25.171-b11)

OS:           Mac OS X 10.12.6 x86_64


Build Instructions: 
./gradlew build

Run Instructions: 
./gradlew run

Test Instructions:
gradle clean test
/**
 *
 * @author scox
 */

package com.sjjcox.conwaylife;

public class Cell {
    private boolean isAlive;
    private int xCoordinate, yCoordinate;

    Cell() {

    }
    
    Cell(int x, int y, boolean alive) {
        
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.isAlive = alive;
    }
   
    void setCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.isAlive = false;
    }
}

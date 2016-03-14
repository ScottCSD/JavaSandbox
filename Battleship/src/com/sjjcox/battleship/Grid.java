/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjjcox.battleship;

/**
 *
 * @author scox
 */
public class Grid {
    private int _rows = 10;
    private int _cols = 10;    
    
    public void Grid()
    {
        //Constructor
    }
    
    void CreateGrid()
    {
        for (int rows = 1; rows <= _rows; rows++)
        {
            for (int cols = 1; cols<= _cols; cols++)
            {
                System.out.printf("row = %d, col = %d\n", rows, cols);
            }
        }
    }
}

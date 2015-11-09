/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjjcox.conwaylife;

/**
 *
 * @author scox
 */
public class Life {
    public static void main(String[] args) {

        Cell[][] cells = new Cell[100][100];
        System.out.println("Starting");
        
        for(int x = 0; x < 100; x++) {
            for(int y = 0; y < 100; y++) {
                System.out.println("x = " + x + "; y = " + y);
                cells[x][y] = new Cell(0, 0, false);
            }
        }
    }    
}

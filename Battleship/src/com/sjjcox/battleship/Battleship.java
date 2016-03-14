/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjjcox.battleship;

/**
 * @author scox
 */
public class Battleship {

    /**
     * @param args the command line arguments
     */
    
    public Grid _grid;
    
    public static void main(String[] args) {
        System.out.print("Battleship\n");
        
        new Grid().CreateGrid(); 
    }
}

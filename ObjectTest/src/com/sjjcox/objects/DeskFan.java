/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjjcox.objects;

/**
 *
 * @author scox
 */
public class DeskFan {
    
    private boolean on;
    private int speed;
    private boolean oscillating;
    
    void changeOsillation() {
        
        if (oscillating == true)
            oscillating = false;
        else
            oscillating = true;
    }
    
    void changeSpeed() {
        if (speed == 3)  //highest speed
            speed = 1;
        else
            speed++;
    }
    
    void onoff()
    {
        if (on)
            on = false;
        else
            on = true;
    }
    
    void printStatus() {
        System.out.println("on: " + this.on);
        System.out.println("speed: " + this.speed);
        System.out.println("oscillating: " + this.oscillating);
    }
    
    public static void main (String[] args) {
        DeskFan df = new DeskFan();
        df.onoff();
        df.changeSpeed();
        df.changeOsillation();
        df.printStatus();
        
        df.onoff();
        df.changeSpeed();
        df.changeOsillation();
        df.printStatus();
    }
}

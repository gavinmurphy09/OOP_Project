/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

import java.awt.Color;

/**
 *
 * @author AFF COMPUTERS
 */
public class Player {
    private int x;
    private int y;
    private java.awt.Color Color= new java.awt.Color(100,216,230);
    
    public Player(){
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }
    
}

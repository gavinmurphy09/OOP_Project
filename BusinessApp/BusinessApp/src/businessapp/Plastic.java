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
public class Plastic {
    private int x;
    private int y;
    private int direction =1;
    private int plasticWidth;
    private int plasticHeight;
    private java.awt.Color plasticColor= new java.awt.Color(173,100,100);

    
    public Plastic(){
        
    }

    public Plastic(int x, int y) {
        this.x = x;
        this.y = y;
        plasticSize();
        plasticColor();
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }
    
    public void plasticSize(){
        plasticWidth=(int)(Math.random()*50);
        plasticHeight=(int)(Math.random()*50);
        
        //System.out.println(Y);
       
    }
    public void changeDirection(){
        direction = direction*-1;
    }
    public void plasticColor(){
        java.awt.Color color1= new java.awt.Color(255,0,0);
        java.awt.Color color2= new java.awt.Color(0,255,0);
        java.awt.Color color3= new java.awt.Color(0,0,255);
        int colorChoice=(int)(Math.random()*3);
        if(colorChoice ==1){
            plasticColor=color1;
        }else if(colorChoice==2){
            plasticColor = color2;
        }else{
            plasticColor = color3;
        }
    }

    public int getPlasticWidth() {
        return plasticWidth;
    }

    public int getPlasticHeight() {
        return plasticHeight;
    }
    public void move(){
        x=x+direction;
        y=y+direction;
    }
}

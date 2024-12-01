/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author AFF COMPUTERS
 */
class DrawPane extends JPanel {
       
        private final java.awt.Color Color= new java.awt.Color(173,216,230);
        private  Player temp;
        private ArrayList<Plastic> pList;
        private final int paneWidth = 500;
        private final int paneHeight =750;
        
        @Override
        public void paintComponent(Graphics g) {
            //g.drawLine(x, y, x, y);
            Rectangle r = new Rectangle(0,0,1500,1500);
            //this.setBackground(new java.awt.Color(173, 216, 230));
            this.repaint(r);
            g.setColor(this.Color);
            //g.fillRect(this.x, this.y, 100, 200); // Draw on g here e.g.
            g.drawOval(temp.getX(), temp.getY(), 5, 5);
            for(Plastic p:pList){
                g.drawOval(p.getX(), p.getY(), p.getPlasticWidth(), p.getPlasticHeight());//x,y upper left
            }
            
        }
      

        public void setTemp(Player temp) {
            this.temp = temp;
        }

        public void setPList(ArrayList<Plastic> pList) {
            this.pList = pList;
        }

        public int getPaneWidth() {
            return paneWidth;
        }

        public int getPaneHeight() {
            return paneHeight;
    }
        
   }
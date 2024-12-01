/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package businessapp;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author AFF COMPUTERS
 */
public class gameGUI extends javax.swing.JFrame implements MouseListener {
    private final guiMain main;
    DrawPane panel;
    private int score=0;
    
    Player player1;
    ArrayList<Plastic> pList;
    int count=0;
    /**
     * Creates new form gameGUI
     */
    public gameGUI(guiMain main) {
        this.main = main;
        panel = new DrawPane();
        player1 = new Player();
        pList = new ArrayList<>();
        setContentPane(panel);
        panel.setTemp(player1);
        
        addPlastic();
        panel.setPList(pList);
        addMouseListener(this);
        initComponents();
    }
    public void game(){
        while(true){
            
            
            
            if(count==1000){
                addPlastic();
            }
            
            System.out.println(count);
            if(count==50000){
                count=0;
                break;
            }
            //panel.setPList(pList);
            count++;
            repaint();
        }
        
    }
    
    public java.awt.Point moveAction(){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        
        
        int x = (int) b.getX();
        int y = (int) b.getY();
        //int x = (int) b.getX();
        //int y = (int) b.getY();
        
        System.out.println(x +" "+y);
        player1.setX(x);
        player1.setY(y);

        return b;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getX()+" "+e.getY());
          
            
           
           
                  
 
    }

    @Override
    public void mousePressed(MouseEvent e) {
  
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    public void hitDetect(){
        for(Plastic p: pList){
            if((player1.getX()>p.getX()&&player1.getX()<p.getX()+p.getPlasticWidth()) && (player1.getY()>p.getY()&& player1.getY()<p.getY()+p.getPlasticHeight())){
                System.out.println("hit");

            }
        }
    }
    public void collisionDet(){
        for(Plastic p: pList){
            for(Plastic p1: pList){
                if(p.getX()+p.getPlasticWidth()>p1.getX()){
                    p.changeDirection();
                    p1.changeDirection();
                }
                if(p.getX()<p1.getX()+p1.getPlasticWidth()){
                    p.changeDirection();
                    p1.changeDirection();
                }
                if(p.getY()<p1.getY()+p1.getPlasticHeight()){
                    p1.changeDirection();
                    p.changeDirection();
                }
                if(p.getY()+p.getPlasticHeight()>p1.getY()){
                    p.changeDirection();
                    p1.changeDirection();
                }
            }     
        }
    }
   
    public void wallDetection(){    
        for(Plastic p:pList){
            if(p.getX()+p.getPlasticWidth()>panel.getPaneWidth()){
                p.changeDirection();
            }
            if(p.getX()<0){
                p.changeDirection();
            }
            if(p.getY()<0){
                p.changeDirection();
            }
            if(p.getY()+p.getPlasticHeight()>panel.getPaneHeight()){
                p.changeDirection();
            }
        }
    }
    public void addPlastic(){
        Plastic temp;
        pList.add(temp = new Plastic((int)(Math.random()*panel.getPaneWidth()),(int)(Math.random()*panel.getPaneHeight())));
    }

   // Create a component that you can actually draw on.
   /*class DrawPane extends JPanel {
        private int x,y;
        private int eX,eY;
        private final java.awt.Color Color= new java.awt.Color(173,216,230);
        
        @Override
        public void paintComponent(Graphics g) {
            //g.drawLine(x, y, x, y);
            Rectangle r = new Rectangle(0,0,1500,1500);
            //this.setBackground(new java.awt.Color(173, 216, 230));
            this.repaint(r);
            g.setColor(this.Color);
            //g.fillRect(this.x, this.y, 100, 200); // Draw on g here e.g.
            g.drawLine(100, 400, x, y);
            g.drawOval(eX, eY, 50, 50);//x,y upper left
            
            
        }
        public void setX(int x){
            this.x=x;
        }
        public void setY(int y){
            this.y=y;
        }
        public void seteX(int x){
            this.eX=x;
        }
        public void seteY(int y){
            this.eY=y;
        }
        
   }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBTN = new javax.swing.JButton();
        startBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreLBL = new javax.swing.JLabel();
        roundLBL = new javax.swing.JLabel();
        playerLBL = new javax.swing.JLabel();
        restartLBL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        startBTN.setText("Start Game");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Shoot the Plastic");

        scoreLBL.setText("Score");

        roundLBL.setText("Round");

        playerLBL.setText("Player 1");

        restartLBL.setText("Restart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restartLBL)
                        .addGap(28, 28, 28)
                        .addComponent(exitBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(scoreLBL)
                                    .addComponent(roundLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(playerLBL)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(playerLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startBTN)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scoreLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roundLBL)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(restartLBL))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        main.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
      game();
    }//GEN-LAST:event_startBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel playerLBL;
    private javax.swing.JButton restartLBL;
    private javax.swing.JLabel roundLBL;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JButton startBTN;
    // End of variables declaration//GEN-END:variables
}

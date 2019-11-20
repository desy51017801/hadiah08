/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;


/**
 *
 * @author Sumakmur Goenawan
 */
public class mobil extends Panel {  
    mobil(){
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        
        
        g.setColor(Color.blue);
        g.fillRect(100,200, 400, 200);
        g.setColor(Color.blue);
        g.fillRect(500, 290, 140, 110);
        
        g.setColor(Color.red);
        g.fillRoundRect(200, 360, 100, 100,100,100);
        g.fillRoundRect(400, 360, 100, 100,100,100);
        g.setColor(Color.cyan);
        g.drawRoundRect(200, 360, 100, 100,100,100);
        g.drawRoundRect(400, 360, 100, 100,100,100);
        g.drawRoundRect(199, 359, 102, 102,102,102);
        g.drawRoundRect(399, 359, 102, 102,102,102);
        g.drawRoundRect(198, 358, 104, 104,104,104);
        g.drawRoundRect(398, 358, 104, 104,104,104);
        
        g.setColor(Color.black);
        Font f = new Font("Helvetica", Font.BOLD,30);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);
        
        String S = "ini mobil yang saya gambar dan nama saya des";
        
        g.drawString(S, 110, 500);
        
        
        
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing graphics panel");
        mobil gp = new mobil();
        f.add(gp);
        f.setSize(900,900);
        f.setVisible(true);
    }
}

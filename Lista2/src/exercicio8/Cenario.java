/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author tsuba
 */
public class Cenario{
    
    public void nuvem(Graphics g, int posicaoX){
        g.setColor(Color.white);
        g.fillOval(posicaoX-10, 50, 100, 100);
        g.setColor(Color.white);
        g.fillOval((posicaoX+70)-10, 50, 100, 100);
        g.setColor(Color.white);
        g.fillOval((posicaoX+140)-10, 50, 100, 100);
        g.setColor(Color.white);
        g.fillOval((posicaoX+210)-10, 50, 100, 100);
        
    }
    
    public void ceu(String cor, Graphics g){
        g.setColor(Color.decode(cor));
        g.fillRect(0, 0, 800, 600);
    }
     public void arvoreCopa(String cor, Graphics g){
        g.setColor(Color.decode("#027b12"));
        g.fillOval(535, 250, 150, 150);
    }
      public void arvoreCaule(String cor, Graphics g){
        g.setColor(Color.decode(cor));
        g.fillRect(600, 370, 35, 100);
    }
       public void grama(String cor, Graphics g){
        g.setColor(Color.decode(cor));
        g.fillRect(0,470, 800,600);
    }
       
       public void paredeCasa(String cor, Graphics g){
         g.setColor(Color.decode(cor));
        g.fillRect(180, 320, 200, 150);
    }
        public void telhadoCasa(Graphics g){
        g.setColor(Color.red);
        int[] xValues = { 180, 280, 380};
        int[] yValues = { 320, 180, 320};
        Polygon triangulo = new Polygon( xValues, yValues, 3 );
        g.fillPolygon(triangulo);
    }
         public void janelaCasa(String cor, Graphics g){
        g.setColor(Color.decode(cor));
        g.fillRect(300, 370, 50, 50);
    }
         public void portaCasa(String cor, Graphics g){
        g.setColor(Color.decode(cor));
        g.fillRect(225, 370, 50, 100);
        g.setColor(Color.black);
        g.fillOval(225, 420, 8, 8);
    }
          public void sol(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 110, 110);
    }
}

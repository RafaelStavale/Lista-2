package lista2b;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Thaïs Simões
 * Classe responsável pela criação do cenários. Posicionamento, cores e tamanhos
 */
public class Cenario{
      
    public void nuvem(Graphics g, int posicaoX){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.white);
        g2d.fillOval(posicaoX-10, 50, 100, 100);
        g2d.setColor(Color.white);
        g2d.fillOval((posicaoX+70)-10, 50, 100, 100);
        g2d.setColor(Color.white);
        g2d.fillOval((posicaoX+140)-10, 50, 100, 100);
        g2d.setColor(Color.white);
        g2d.fillOval((posicaoX+210)-10, 50, 100, 100);
        
    }
    
    public void ceu(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(0, 0, 800, 600);
    }
    public void arvoreCopa(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.decode("#027b12"));
        g2d.fillOval(535, 250, 150, 150);
    }
    public void arvoreCaule(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(600, 370, 35, 100);
    }
       public void grama(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(0,470, 800,600);
    }
       
       public void paredeCasa(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(180, 320, 200, 150);
    }
        public void telhadoCasa(Graphics g){
        Graphics2D g2d = (Graphics2D)g;    
        g2d.setColor(Color.red);
        int[] xValues = { 180, 280, 380};
        int[] yValues = { 320, 180, 320};
        Polygon triangulo = new Polygon( xValues, yValues, 3 );
        g2d.fillPolygon(triangulo);
    }
        public void janelaCasa(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;     
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(300, 370, 50, 50);
    }
        public void portaCasa(String cor, Graphics g){
        Graphics2D g2d = (Graphics2D)g;     
        g2d.setColor(Color.decode(cor));
        g2d.fillRect(225, 370, 50, 100);
        g2d.setColor(Color.black);
        g2d.fillOval(225, 420, 8, 8);
    }
        public void sol(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.yellow);
        g2d.fillOval(50, 50, 110, 110);
    }
        
       
}

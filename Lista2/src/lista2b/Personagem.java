/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2b;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

/**
 *
 * @author tsuba
 */
public class Personagem {
    int contTecla =0;
    Image boneco;
    private double personagemX;
    private double personagemY;
    private double frametime = 0;
    private int passos = 0;
    private Image[] personagemSprites = new Image[8];

    public Personagem() {
        personagemX = 50;
        personagemY = 370;
        personagemSprites[0] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_01.png").getImage();
        personagemSprites[1] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_02.png").getImage();
        personagemSprites[2] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_03.png").getImage();
        personagemSprites[3] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_04.png").getImage();
        personagemSprites[4] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_05.png").getImage();
        personagemSprites[5] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_06.png").getImage();
        personagemSprites[6] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_07.png").getImage();
        personagemSprites[7] = new ImageIcon("src/imagens_hero_2d/Hero_Walk_08.png").getImage();
	}
 
    
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(personagemSprites[passos], (int) personagemX, (int) personagemY, null);
    }
    
    public void moveBonecoDireita(int x){
        if((personagemX <700) && (contTecla<2000)){    
            contTecla++;
            personagemX += x;
            if(passos<3){
                passos++;
            }
            else{
                passos=0;
            }
        }
        else if(personagemX<700){
            contTecla =0;
        }
    }
    public void moveBonecoEsquerda(int x){
          if((personagemX >0)&& (contTecla<2000)){
            contTecla++;
            personagemX -= x;
            if((passos<4)||(passos >6)){
                passos=4;
            }        
            else{
                passos++;
            }
        }
          else if(personagemX>0){
            contTecla =0;
        }
    }
    public void setContTecla(int contTecla){
        this.contTecla = contTecla;
    }
}

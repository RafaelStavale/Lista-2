/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Thaïs Simões
 */
public class JDesenho extends JPanel{
    int posicaoX =400;

    @Override
    protected void paintComponent(Graphics g) {
    Cenario cenario = new Cenario();
    cenario.ceu("#98d1fa", g);
    cenario.arvoreCaule("#74614f", g);
    cenario.arvoreCopa("#027b12", g);
    cenario.grama("#027b12", g);
    cenario.sol(g);
    cenario.paredeCasa("#d5cb00", g);
    cenario.telhadoCasa(g);
    cenario.portaCasa("#74614f", g);
    cenario.janelaCasa("#c4fffd", g);
    cenario.nuvem(g, posicaoX);   
    
    while(true){
            if (posicaoX >100){
                cenario.paredeCasa("#d5cb00", g);
                
                cenario.janelaCasa("#c4fffd", g);
                cenario.nuvem(g, posicaoX-10);
                
            }
            else if (posicaoX <100){
                cenario.ceu("#0000CD", g);
               
               
                cenario.paredeCasa("#FAF0E6", g);
                
                
                cenario.janelaCasa("#FFFF00", g);
                cenario.nuvem(g, posicaoX-10);
                          

            }
                         
                     

        }
     }   
    }
  
package lista2b;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Thaïs Simões
 * 
 * A classe JDesenho é responsável pela representação gráfica na tela, sendo assim,
 * todo e qualquer desenho deverá ser implementado aqui, bem como suas funções
 * Ela herda de JPanel e implementa uma classe interface chamada Runnable, necessária
 * para o uso de Threads.
 */
public class Principal extends JPanel implements Runnable{
    double posicaoX =400;
    boolean moverNuvemParaEsquerda = false;
    private boolean[] key_states = new boolean[256];
    boolean andarBonecoEsquerda=false;
    Cenario cenario = new Cenario();
    Image boneco;
    Personagem personagem;    
    /**
    Construtor
    */
    Principal(){
        setDoubleBuffered(true);
        setFocusable(true);
        load();
        new Thread(this).start();
    }
    
    /**
     * Método responsável pela pintura em tela.
     * @param g do tipo Graphics - Classe de formas primitas.
     */
    @Override
    protected void paintComponent(Graphics g) {
    
    
    if (posicaoX < 160) {
        cenario.ceu("#0000", g);
    }
    else {
        cenario.ceu("#98d1fa", g);
    }
    cenario.arvoreCaule("#74614f", g);
    cenario.arvoreCopa("#027b12", g);
    cenario.grama("#027b12", g);
    cenario.sol(g);
    cenario.paredeCasa("#d5cb00", g);
    cenario.telhadoCasa(g);
    cenario.portaCasa("#74614f", g);
    cenario.janelaCasa("#c4fffd", g);
    cenario.nuvem(g, (int)posicaoX);   
    personagem.draw(g);
    
    }
    /**
     *Método responsável pela atualização de tela e sua repintura
     */

    @Override
    public void run() {
        double btime, dtime =0;
        btime = System.currentTimeMillis();
        while(true){
            update(dtime/1000);
            repaint();
            try{
                Thread.sleep(1);
            }
            catch (InterruptedException e){
            }
            dtime = System.currentTimeMillis() - btime;
            btime = System.currentTimeMillis();
            
            }
    }
       /**
     *Método responsável pelo carregamento de funcionalidades, como o 
     * reconhecimento de teclas
     */
    private void load(){
        addKeyListener(new KeyboardAdapter());
        personagem = new Personagem();
        
    }
    /*
    Método responsável pela movimentação da nuvem e do boneco
    @param dt do tipo double - tempo
    */
    public void update(double dt){
        
        if((posicaoX >= 10)&&(moverNuvemParaEsquerda)){
            posicaoX =  posicaoX - (50*dt);
        }
        else if((posicaoX < 500)){       
            moverNuvemParaEsquerda= false;
            
         }
        if ((posicaoX < 500)&&!(moverNuvemParaEsquerda)){
            posicaoX =  posicaoX + (50*dt);
            
        }
        else if (posicaoX > 10){
            moverNuvemParaEsquerda = true;

        }
         if (key_states[KeyEvent.VK_LEFT]){
            personagem.moveBonecoEsquerda(1);
        }
         if (key_states[KeyEvent.VK_RIGHT]){
            personagem.moveBonecoDireita(1);
        }
         if(!(key_states[KeyEvent.VK_RIGHT]) && !(key_states[KeyEvent.VK_LEFT])){
             personagem.setContTecla(0);
         }
    }
    
    
    
       private class KeyboardAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            key_states[e.getKeyCode()] = false;
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            key_states[e.getKeyCode()] = true;
        }
    
   }
        
    }
    
    /*
    Classe responsável pelo reconhecimento das teclas pressionadas
    */
  

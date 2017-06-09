package lista2b;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class JDesenho extends JPanel implements Runnable{
    double posicaoX =400;
    boolean moveEsquerda = false;
    private boolean[] key_states = new boolean[256];
    boolean andarBoneco=false;
    
    /**
    Construtor
    */
    JDesenho(){
        setDoubleBuffered(true);
        setFocusable(true);
        load();
        new Thread(this).start();
    }
    
    /**
     *Método responsável pela pintura em tela.
     * @param g do tipo Graphics - Classe de formas primitas.
     */
    @Override
    protected void paintComponent(Graphics g) {
    Cenario cenario = new Cenario();
    if (posicaoX < 160) {
        cenario.ceu("#0000", g);
    }
    else {
        cenario.ceu("#98d1fa", g);
    }
    if(andarBoneco){
        cenario.boneco(true, g, this);
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
    
    
     }  
    /**
     *Método responsável pela atualização de tela e repitura
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
        
    }
    /*
    Método responsável pela movimentação da nuvem e do boneco
    @param dt do tipo double - tempo
    */
    public void update(double dt){
        
        if((posicaoX >= 10)&&(moveEsquerda)){
            posicaoX =  posicaoX - (50*dt);
        }
        else if((posicaoX < 500)){
                    
            moveEsquerda= false;
            
         }
        if ((posicaoX < 500)&&!(moveEsquerda)){
            posicaoX =  posicaoX + (50*dt);
            
        }
        else if (posicaoX > 10){
            moveEsquerda = true;

        }
        if (key_states[KeyEvent.VK_LEFT]){
            andarBoneco = true;
        }
        
    }
    
    /*
    Classe responsável pelo reconhecimento das teclas pressionadas
    */
    public class KeyboardAdapter extends KeyAdapter{
        public void KeyReleased(KeyEvent e){
            key_states[e.getKeyCode()] = false;
        }
         public void KeyPressed(KeyEvent e){
            key_states[e.getKeyCode()] = true;
        }
    
}
    }
    
  

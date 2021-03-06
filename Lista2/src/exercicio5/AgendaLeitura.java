package exercicio5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thaïs Simões
 * Classe responsável pela leitura da agenda em um arquivo binário.
 */
public class AgendaLeitura {
    public static void main (String[] args) throws IOException, ClassNotFoundException{
        
        try {
            FileInputStream out = new FileInputStream("Agenda.bin");
            ObjectInputStream objIn = new ObjectInputStream(out);
            
            AgendaTelefone lerAgenda = (AgendaTelefone) objIn.readObject();
            objIn.close();
            
            System.out.println(lerAgenda.getApelido() + " - " + lerAgenda.getTelefone());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    }
    
}

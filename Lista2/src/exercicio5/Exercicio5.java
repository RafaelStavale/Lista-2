/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tsuba
 */
public class Exercicio5 {
    public static void main (String[] args) throws IOException{
        AgendaTelefone agenda = new AgendaTelefone();
        agenda.setNome("Thaïs Simões");
        agenda.setApelido("Thay");
        agenda.setTelefone("99999-9999");


        try {
            FileOutputStream out = new FileOutputStream("Agenda.bin");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            
            objOut.writeObject(agenda);
            objOut.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercicio5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    }
    
}

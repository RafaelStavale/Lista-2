/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;



/**
 *
 * @author tsuba
 */
public class TesteReflexao {
    public static void main(String[] args){
        Class ClasseReflexao = Livro.class;
        String nomeClasse = ClasseReflexao.getName();
        
        System.out.println(nomeClasse);
    }
    
}

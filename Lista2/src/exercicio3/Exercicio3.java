/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Thaïs Simões
 */
 
public class Exercicio3 {
    
    public static void main(String[] args){
    
        Livro livro = new Livro();
        livro.setTitulo("novo titulo");
        livro.setAutor("novo autor");
        livro.setEditora("nova editora");
        livro.setPreco(55);
        livro.setCodigo("cod001");
        livro.setQuantidadeEstoque(23);
        
        System.out.println(String.format("%s, %s - Editora %s, Código %s. R$ %d. Cópias em estoque: %d",livro.getTitulo()
                                                                                                       ,livro.getAutor()
                                                                                                       ,livro.getEditora()
                                                                                                       ,livro.getCodigo()
                                                                                                       ,livro.getPreco()
                                                                                                       ,livro.getQuantidadeEstoque()));

                
    
    }
}



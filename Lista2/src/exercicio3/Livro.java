package exercicio3;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Thaïs Simões
 * Classe que implementa métodos get e set de um livro, utilizando lombok
 */
public class Livro {

     @Getter @Setter String titulo, autor, editora, codigo;
     @Getter @Setter int preco;
     @Getter @Setter int quantidadeEstoque;
        
          

}

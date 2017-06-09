package exercicio4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 *
 * @author Thaïs Simões
 * Classe que imprime o nome da classe, seus atributos e métodos através do uso
 * de reflexão
 */

public class TesteReflexao {

	public static void main(String[] args) {
               
		Class<Livro> classe = Livro.class;
                
                System.out.println(classe);
		for (Field atributo : classe.getDeclaredFields())
			System.out.println(atributo.getName());
		for (Method atributo : classe.getDeclaredMethods())
			System.out.println(atributo.getName());
		
	}

}

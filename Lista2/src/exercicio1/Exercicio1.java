package exercicio1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Thaïs Simões
 * Classe que calcula quadrados de numeros em uma lista, utilizando a expressão
 * lambda
 */
public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> listaNumeros= Arrays.asList(1, 5, 6, 10);
        listaNumeros.forEach(numero -> System.out.println(String.format("O quadrado de %d é %d",numero, numero*numero)));
              
    }
    
}

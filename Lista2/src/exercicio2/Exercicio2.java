package exercicio2;

import java.util.List;
import java.util.Arrays;
import java.util.function.IntFunction;

/**
 *
 * @author Thaïs Simões
 * Classe com vários expressões lambda.
 */
public class Exercicio2 {
    public static void main(String[] args){
        
        System.out.println("Cria a lista com os elementos que serão realizadas operações");
        List<Integer> listaNumeros  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Soma 5 a todos os elementos da lista");
        realizaOperacao(listaNumeros, (n)-> n + 5);

        System.out.println("Multiplica cada elemento da lista por 10");
        realizaOperacao(listaNumeros, (n)-> n * 10);
      
        System.out.println("Coloca 0 em todos os elementos da lista:");
        realizaOperacao(listaNumeros, (n)-> 0);

    }
     
    /**
     *
     * @param list
     * @param function
     */
    public static void realizaOperacao(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(n -> {
        	n = function.apply(n);
        	System.out.println(n + " ");
        });
    }
 
}
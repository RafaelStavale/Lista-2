/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Thaïs Simões
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> listaNumeros= Arrays.asList(1, 5, 6, 10);
        listaNumeros.forEach(numero -> System.out.println(String.format("O quadrado de %d é %d",numero, numero*numero)));
              
    }
    
}

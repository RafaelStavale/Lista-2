/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import exercicio5.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Thaïs Simões
 * Classe para a criação de dados de uma agenda. Implementa Serializable, interface
 * responsável por I/O em documentos.
 */
public class AgendaTelefone implements Serializable{
    @Getter @Setter String nome, apelido, telefone, endereco;

   
    
}

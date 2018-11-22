/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args){  
        Jogador jogador = new Jogador("maria", "10/10/20", 700700, "brasileira", "maria@quentemail.com");
        Pessoa pessoa = new Pessoa("jorge", "21/01/10", 800800800, "brasileiro");
        
        jogador.mensagemVitoria();
        pessoa.mensagemVitoria();
    }
}

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
public class Mesa {
    Jogador jogador1;
    Jogador jogador2;
    
    Mesa(){
        jogador1 = new Jogador("Maria");
        jogador2 = new Jogador("João");
    }
    
    Mesa(String nome1, String nome2){
        jogador1 = new Jogador(nome1);
        jogador2 = new Jogador(nome2);
    }
    
    Jogador getNomeJogador1(){
        return jogador1;
    }
    
    Jogador getNomeJogador2(){
        return jogador2;
    }
    
}

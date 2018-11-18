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
    private Jogador jogador1;
    private Jogador jogador2;
    
    public Mesa(){
        jogador1 = new Jogador("Maria");
        jogador2 = new Jogador("João");
    }
    
    public Mesa(String nome1, String nome2){
        jogador1 = new Jogador(nome1);
        jogador2 = new Jogador(nome2);
    }
    
    public Jogador getNomeJogador1(){
        return jogador1;
    }
    
    public Jogador getNomeJogador2(){
        return jogador2;
    }
    
}

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
        Jogador player1 = new Jogador("Andrade");
        Jogador player2 = new Jogador("Matheus");
       
        Mesa mesa1 = new Mesa();
        
        System.out.println("P1: "+mesa1.getNomeJogador1().getNome());
        System.out.println("P2: "+mesa1.getNomeJogador2().getNome());
        
        Mesa mesa2 = new Mesa(player1.getNome(), player2.getNome());
        
        System.out.println("P1: "+mesa2.getNomeJogador1().getNome());
        System.out.println("P2: "+mesa2.getNomeJogador2().getNome());
        
        Baralho baralho1 = new Baralho();
        
        baralho1.listarCartas();
    }
}

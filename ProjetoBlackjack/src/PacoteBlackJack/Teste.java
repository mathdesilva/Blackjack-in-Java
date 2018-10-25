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
        Carta carta1 = new Carta();
        Jogador player1 = new Jogador();
        System.out.println("======= CONSTRUTOR PADRÃO =======");
        System.out.println("Jogador: "+player1.getNome());
        System.out.println("A carta é "+carta1.getNumero()+" de "
                +carta1.getNaipe());
        
        Carta carta2 = new Carta('8', "Paus", 8);
        Jogador player2 = new Jogador("Matheus");
        System.out.println("====== CONSTRUTOR CRIADO =======");
        System.out.println("A carta é "+carta2.getNumero()+" de "
                +carta2.getNaipe()+" e o jogador é "+player2.getNome());
        
    }
}

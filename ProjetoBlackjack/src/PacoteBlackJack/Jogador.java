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
public class Jogador {
    String nome;
    
    Jogador(){
        nome = "Zé Ninguém";
    }
    
    Jogador(String nome){
        this.nome = nome;
    }
    
    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
}

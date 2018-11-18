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
    private String nome;
    
    public Jogador(){
        nome = "Zé Ninguém";
    }
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}

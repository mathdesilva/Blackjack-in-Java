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
public class Humano {
    private String nome;
    private String dataDeNascimento;
    
    
    public Humano(String nome, String dataDeNascimento){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    
    protected String getNome(){
        return nome;
    }
    protected void setNome(String nome){
        this.nome = nome;
    }
     
    protected String getDataDeNascimento(){
        return dataDeNascimento;
    }
    protected void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
     
}

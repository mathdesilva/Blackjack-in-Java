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
public class Pessoa extends Humano {
    private int cpf;
    private String nacionalidade;
    
    public Pessoa(String nome, String dataDeNascimento, int cpf, String nacionalidade){
        super(nome, dataDeNascimento);
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
    }
    
    protected int getCPF(){
        return cpf;
    }
    protected void setCPF(int cpf){
        this.cpf = cpf;
    }
    
    protected String getNacionalidade(){
        return nacionalidade;
    }
    protected void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
}

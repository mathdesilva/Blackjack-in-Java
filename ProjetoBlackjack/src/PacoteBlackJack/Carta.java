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
public class Carta {
    private char numero;
    private String naipe;
    private int valor;
    
    public Carta(){
        numero = '0';
        naipe = "fake";
        valor = 0;
    }
    
    public Carta(char numero, String naipe, int valor){
        this.numero = numero;
        this.naipe = naipe;
        this.valor = valor;
    }
    
    public char getNumero(){
        return numero;
    }
    public void setNumero(char numero){
        this.numero = numero;
    }
    
    public String getNaipe(){
        return naipe;
    }
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}

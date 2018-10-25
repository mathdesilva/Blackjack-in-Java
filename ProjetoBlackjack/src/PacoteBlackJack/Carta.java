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
    char numero;
    String naipe;
    int valor;
    
    Carta(){
        numero = '0';
        naipe = "fake";
        valor = 0;
    }
    
    Carta(char numero, String naipe, int valor){
        this.numero = numero;
        this.naipe = naipe;
        this.valor = valor;
    }
    
    char getNumero(){
        return numero;
    }
    void setNumero(char numero){
        this.numero = numero;
    }
    
    String getNaipe(){
        return naipe;
    }
    void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    int getValor(){
        return valor;
    }
    void setValor(int valor){
        this.valor = valor;
    }
}

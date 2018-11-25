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
    public static void main(String[] args) throws ExcecaoBaralhoVazio{  
        Mesa mesa = new Mesa();
        mesa.embaralhar();
        mesa.listarCartas();
        
        Carta carta1 = new Carta();
        Carta carta2 = new Carta();
        
        carta1 = mesa.pegarCarta();
        carta2 = mesa.pegarCarta();
        
        System.out.println("carta 1: "+carta1.getNumero() + " " + carta1.getNaipe());
        System.out.println("carta 2: "+carta2.getNumero() + " " + carta2.getNaipe());
        
    }
}

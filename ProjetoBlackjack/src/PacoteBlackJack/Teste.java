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
        Mesa mesa = new Mesa();
        mesa.listarCartas();
        System.out.println("------------------------------------");
        mesa.embaralhar();
        mesa.listarCartas();
    }
}

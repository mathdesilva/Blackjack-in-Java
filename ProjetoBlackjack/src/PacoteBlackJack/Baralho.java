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
public class Baralho {
    private Carta[] cartas;
   
    public Baralho(){
        this.cartas = new Carta[52];
        
        String aux_numero[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String aux_naipes[] = {"espadas", "copas", "ouros", "paus"};
     
        for(int i=0; i<52; i++){
            cartas[i] = new Carta();
            
            cartas[i].setNumero(aux_numero[i%13]);
            cartas[i].setNaipe(aux_naipes[(int)Math.floor(i/13)]);
            if(i%13 < 10)
                cartas[i].setValor((i%13)+1);
            else
                cartas[i].setValor(10);
        }
    }
    
    
    public void listarCartas(){
        for(int i=0; i<52; i++){
            String num = this.cartas[i].getNumero();
            String naipe = this.cartas[i].getNaipe();
            int valor = this.cartas[i].getValor();
            System.out.println(num+" de "+naipe+" vale "+valor);
        }
    }
}
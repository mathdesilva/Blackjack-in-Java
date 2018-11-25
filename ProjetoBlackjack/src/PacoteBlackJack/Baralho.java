/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author matheus
 */
public class Baralho {
    private List<Carta> cartas; 
   
    public Baralho(){
        cartas = new ArrayList();
        
        String aux_numero[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String aux_naipes[] = {"espadas", "copas", "ouros", "paus"};
        
        for(int i=0; i<52; i++){
            Carta carta = new Carta();
                 
            carta.setNumero(aux_numero[i%13]);
            carta.setNaipe(aux_naipes[(int)Math.floor(i/13)]);
            if(i%13 < 10)
                carta.setValor((i%13)+1);
            else
                carta.setValor(10);
            
            cartas.add(carta);
        }
    }
    
    
    public void listarCartas(){
        for(Carta i : cartas){
            String num = i.getNumero();
            String naipe = i.getNaipe();
            int valor = i.getValor();
            System.out.println(num+" de "+naipe+" vale "+valor);
        }
    }
    
    protected void embaralhar(){
        Random random = new Random();
        int x, y;
        for(int i=0; i<5000; i++){
            x = random.nextInt(52);
            y = x;
            while(x == y)
                y = random.nextInt(52);
            Carta aux_cartas = new Carta();
            aux_cartas = cartas.get(x);
            cartas.set(x, cartas.get(y));
            cartas.set(y, aux_cartas);
        }
    }
}
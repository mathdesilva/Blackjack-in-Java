/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) throws ExcecaoBaralhoVazio{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do player 1: ");
        String nome1 = sc.nextLine();
        String data1 = "11/11/11";
        int cpf1 = 800800;
        String nacionalidade1 = "brasileiro";
        String email1 = "p1@p1.com";
        
        System.out.println("Digite o nome do player 2: ");
        String nome2 = sc.nextLine();
        String data2 = "10/10/2000";
        int cpf2 = 700700;
        String nacionalidade2 = "brasileiro";
        String email2 = "p2@p2.com";
        
        
        Mesa mesa = new Mesa(nome1, data1, cpf1, nacionalidade1, email1, nome2, data2, cpf2, nacionalidade2, email2);
        
        mesa.jogar();
        
        
    }
    
}

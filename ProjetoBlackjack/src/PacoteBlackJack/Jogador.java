/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteBlackJack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Jogador extends Pessoa{
   private String email;
   private List<Carta> cartasSacadas;
   
   public Jogador(String nome, String dataDeNascimento, int cpf, String nacionalidade, String email){
       super(nome, dataDeNascimento, cpf, nacionalidade);
       this.email = email;
       cartasSacadas = new ArrayList();
   }
   
   
   protected String getEmail(){
       return email;
   }
   protected void setEmail(String email){
       this.email = email;
   }
   
   protected void imprimeDadosJogador(){
       System.out.println("Dados do "+getNome()+":");
       System.out.println("data de nascimento: "+getDataDeNascimento());
       System.out.println("CPF: "+getCPF());
       System.out.println("Nacionalidade: "+getNacionalidade());
       System.out.println("Email: "+getEmail());
   }
   
   @Override
   public void mensagemVitoria(){
       System.out.println("Venci! uhuuuu");
   }
   
   protected int getPontos(){
       int total = 0;
       for(Carta c : cartasSacadas){
           total += c.getValor();
       }
       return total;
   }
   
   public void adicionarCartaSacada(Carta c){
       this.cartasSacadas.add(c);
   }
}

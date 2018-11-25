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
public class Mesa {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;
    
    public Mesa(){
        jogador1 = new Jogador("Maria", "10/10/10", 700700, "brasileiro", "maria@maria.com");
        jogador2 = new Jogador("João", "11/11/11", 800800, "brasileiro", "jao@jao.com");
        baralho = new Baralho();
    }
    
    public Mesa(String nome1, String data1, int cpf1, String nacionalidade1, String email1, 
            String nome2, String data2, int cpf2, String nacionalidade2, String email2){
        jogador1 = new Jogador(nome1, data1, cpf1, nacionalidade1, email1);
        jogador2 = new Jogador(nome2, data2, cpf2, nacionalidade2, email2);
        baralho = new Baralho();
    }
    
    public Jogador getNomeJogador1(){
        return jogador1;
    }
    
    public Jogador getNomeJogador2(){
        return jogador2;
    }
    
    public void imprimeDadosJogador1(){
        jogador1.imprimeDadosJogador();
    }
    
    public void imprimeDadosJogador2(){
        jogador2.imprimeDadosJogador();
    }
    
    public void listarCartas(){
        baralho.listarCartas();
    }
    
    public void embaralhar(){
        baralho.embaralhar();
    }
    
    protected Carta pegarCarta() throws ExcecaoBaralhoVazio{
        return baralho.pegarCarta();
    }
}

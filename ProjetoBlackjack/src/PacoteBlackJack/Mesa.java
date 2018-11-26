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
    
    protected void mostrarPlacar(){
        System.out.println(jogador1.getNome()+": "+jogador1.getPontos());
        System.out.println(jogador2.getNome()+": "+jogador2.getPontos());
    }
    
    public void jogar() throws ExcecaoBaralhoVazio{
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; ++i) System.out.println(); 
        this.embaralhar();
        int aux = 0, escolhap1 = 0, escolhap2 = 0;
        while(aux == 0){
            escolhap1 = 0;
            while(escolhap1 != 2 && escolhap1 != 1){
                System.out.println(jogador1.getNome()+", Deseja sacar uma carta?");
                System.out.println("  1 - Sim");
                System.out.println("  2 - Não");
                System.out.print("Digite uma opção: ");
                escolhap1 = sc.nextInt();
            }
            for (int i = 0; i < 50; ++i) System.out.println(); 
            if(escolhap1 == 1){
                Carta aux_carta = new Carta();
                try{
                    aux_carta = this.pegarCarta();
                    jogador1.adicionarCartaSacada(aux_carta);
                } catch (ExcecaoBaralhoVazio e){
                    e.getMessage();
                    return;
                }
                System.out.println(jogador1.getNome() + " pegou "+ aux_carta.mostrarCarta());
            }
            this.mostrarPlacar();
            aux = this.verificarPontos(escolhap1, escolhap2);
            if(aux == 2)
                break;
             
            escolhap2=0;
            while(escolhap2 != 2 && escolhap2 != 1){
                System.out.println(jogador2.getNome()+", Deseja sacar uma carta?");
                System.out.println("  1 - Sim");
                System.out.println("  2 - Não");
                System.out.print("Digite uma opção: ");
                escolhap2 = sc.nextInt();
            }
            for (int i = 0; i < 50; ++i) System.out.println(); 
            if(escolhap2 == 1){
                Carta aux_carta = new Carta();
                try{
                    aux_carta = this.pegarCarta();
                    jogador2.adicionarCartaSacada(aux_carta);
                } catch (ExcecaoBaralhoVazio e){
                    e.getMessage();
                    break;
                }    
                System.out.println(jogador2.getNome() + " pegou "+ aux_carta.mostrarCarta());
            }
            this.mostrarPlacar();
            aux = this.verificarPontos(escolhap1, escolhap2);
            if(aux == 2)
                break;
        }
    }
    
    // retorna 2 caso alguém ganhe
    // retorna 0 para continuar o jogo
    private int verificarPontos(int escolhap1, int escolhap2){
        int pontop1 = jogador1.getPontos();
        int pontop2 = jogador2.getPontos();
        if(escolhap1 == 2 && escolhap2 == 2){
            if(pontop1 > pontop2){
                System.out.println(jogador1.getNome() + " ganhou!!!!!");
                jogador1.mensagemVitoria();
                return 2;
            }
            if(pontop1 < pontop2){
                System.out.println(jogador2.getNome() + " ganhou!!!!!");
                jogador2.mensagemVitoria();
                return 2;
            }
            if(pontop1 == pontop2){
                System.out.println("EMPATE!!");
            }
        }else{
            if(pontop1 == 21){
                System.out.println(jogador1.getNome() + " ganhou!!!!!");
                jogador1.mensagemVitoria();
                return 2;
            }
            else if(pontop1 > 21){
                System.out.println(jogador2.getNome() + " ganhou!!!!!");
                jogador2.mensagemVitoria();
                return 2;
            }
            if(pontop2 == 21){
                System.out.println(jogador2.getNome() + " ganhou!!!!!");
                jogador1.mensagemVitoria();
                return 2;
            }
            else if(pontop2 > 21){
                System.out.println(jogador1.getNome() + " ganhou!!!!!");
                jogador2.mensagemVitoria();
                return 2;
            }
        }
        return 0;
    }
}

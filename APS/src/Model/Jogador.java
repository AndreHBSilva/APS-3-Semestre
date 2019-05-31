/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author André Hugo
 */
public class Jogador {
    String nome;
    int idade;
    int pontuacao;
    ArrayList<Integer> alternativasSelecionadas = new ArrayList<>();
    
    public Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public ArrayList<Integer> getAlternativasSelecionadas() {
        return alternativasSelecionadas;
    }

    public void setAlternativasSelecionadas(ArrayList<Integer> alternativasSelecionadas) {
        this.alternativasSelecionadas = alternativasSelecionadas;
    }
    
    
   
}

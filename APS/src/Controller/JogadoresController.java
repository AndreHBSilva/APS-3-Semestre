/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Jogador;
import java.util.ArrayList;

/**
 *
 * @author André Hugo
 */
public class JogadoresController {
    private static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    
    public static void gravaJogador(Jogador j){
        jogadores.add(j);
    }
    
    public static Jogador getJogador(int index){
        return jogadores.get(index);
    }

}

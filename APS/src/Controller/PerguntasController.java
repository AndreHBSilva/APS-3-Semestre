/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author André Hugo
 */
public class PerguntasController {
    private static final ArrayList<Pergunta> listaPerguntas = new ArrayList<Pergunta>();
    
    public static void gravaPergunta(Pergunta pe){
        listaPerguntas.add(pe);
    }
    
    public static String getAlternativas(int pergunta, int alternativa){
        return listaPerguntas.get(pergunta).getAlternativas().get(alternativa);
    }
    
    public static String getPerguntas(int posicaoPergunta){
        return listaPerguntas.get(posicaoPergunta).getPergunta();
    }
    
    public static ArrayList getArrayPerguntas(){
        return listaPerguntas;
    }
    
    public static String retornaCaminhoPergunta(int posicaoPegunta){
        return listaPerguntas.get(posicaoPegunta).getCaminhoPergunta();
    }
}

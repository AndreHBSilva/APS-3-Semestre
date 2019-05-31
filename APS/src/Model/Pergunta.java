/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author André Hugo
 */
public class Pergunta {
    private String caminhoPergunta;
    private String pergunta;
    //Criei um map para guardar os pontos junto com o texto da alternativa
    private Map<Integer,String> alternativas = new HashMap<>();

    public String getCaminhoPergunta() {
        return caminhoPergunta;
    }

    public void setCaminhoPergunta(String caminhoPergunta) {
        this.caminhoPergunta = caminhoPergunta;
    }

    public Map<Integer, String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map<Integer, String> alternativa) {
        this.alternativas = alternativa;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    
    
    
}

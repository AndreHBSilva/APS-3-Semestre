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
    private Map<Integer,String> alternativa = new HashMap<>();

    public String getCaminhoPergunta() {
        return caminhoPergunta;
    }

    public void setCaminhoPergunta(String caminhoPergunta) {
        this.caminhoPergunta = caminhoPergunta;
    }

    public Map<Integer, String> getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(Map<Integer, String> alternativa) {
        this.alternativa = alternativa;
    }
    
    
}

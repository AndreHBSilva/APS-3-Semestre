/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author André Hugo
 */
public class Main {

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Perguntas telaPerguntas = new Perguntas();
        telaPerguntas.setSize(800, 650);
        telaPerguntas.setVisible(true);
        telaPerguntas.setLocationRelativeTo(null);
        telaPerguntas.setResizable(false);
//        Pergunta pUm = new Pergunta();
//        Map<Integer, String> alternativaUm = new HashMap<>();
//        alternativaUm.put(25, "talkei");
//        pUm.setAlternativa(alternativaUm);
        String nome = JOptionPane.showInputDialog("Qual seu nome, jogador(a)?\n");
        JOptionPane.showMessageDialog(null,"Seu nome é: "+nome);
    }
}

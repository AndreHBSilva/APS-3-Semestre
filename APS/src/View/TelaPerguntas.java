/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.JogadoresController;
import Controller.PerguntasController;
import Model.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author André Hugo
 */
public class TelaPerguntas extends javax.swing.JFrame {


    TelaInicial tInicial;
    int index = 0;
    int iterator = 0;
    ArrayList<Integer> alternativasSelecionadas = new ArrayList<>();
    int pontuacaoFinal;
    public TelaPerguntas() {
        initComponents();
        //ArrayList<Pergunta> listaPerguntas = new ArrayList<>();
        Pergunta p1 = new Pergunta();
        p1.setPergunta("Você retira os aparelhos eletrodomésticos da tomada quando não está utilizando?");
        p1.setCaminhoPergunta("src/imagens/Slide1.PNG");
        Map<Integer, String> alternativasPum = new HashMap<>();
        alternativasPum.put(4, "Não, nem quando está chovendo e relampejando.");
        alternativasPum.put(7, "Apenas quando chove e está relampejando.");
        alternativasPum.put(8, "Às vezes.");
        alternativasPum.put(10, "Sim.");
        p1.setAlternativas(alternativasPum);
        PerguntasController.gravaPergunta(p1);
        Pergunta p2 = new Pergunta();
        p2.setPergunta("Com que frequência você come carne vermelha durante a semana?");
        p2.setCaminhoPergunta("src/imagens/Slide2.PNG");
        Map<Integer, String> alternativasPdois = new HashMap<>();
        alternativasPdois.put(4, "Todos os dias da semana.");
        alternativasPdois.put(7, "Intercalo com alguns dias da semana.");
        alternativasPdois.put(8, "Gosto de carne, mas não como com frequência.");
        alternativasPdois.put(10, "Não como carne vermelha.");
        p2.setAlternativas(alternativasPdois);
        PerguntasController.gravaPergunta(p2);
        Pergunta p3 = new Pergunta();
        p3.setPergunta("Você usa lâmpadas econômicas?");
        p3.setCaminhoPergunta("src/imagens/Slide3.PNG");
        Map<Integer, String> alternativasPtres = new HashMap<>();
        alternativasPtres.put(4, "Não uso.");
        alternativasPtres.put(7, "Utilizo, mas não em todos os cômodos da casa.");
        alternativasPtres.put(8, "3/4 são econômicas.");
        alternativasPtres.put(10, "Utilizo em todos os cômodos da casa.");
        p3.setAlternativas(alternativasPtres);
        PerguntasController.gravaPergunta(p3);
        Pergunta p4 = new Pergunta();
        p4.setPergunta("Você utiliza aparelhos de ar condicionado e/ou aquecedores em sua residência?");
        p4.setCaminhoPergunta("src/imagens/Slide4.PNG");
        Map<Integer, String> alternativasPquatro = new HashMap<>();
        alternativasPquatro.put(4, "Sim.");
        alternativasPquatro.put(7, "Não, utilizamos apenas o ventilador.");
        alternativasPquatro.put(8, "Sim, mas utilizamos apenas o aquecedor na época do inverno.");
        alternativasPquatro.put(10, "Não, usamos apenas métodos que não utilizam energia elétrica exemplo: leques e abanadores.");
        p4.setAlternativas(alternativasPquatro);
        PerguntasController.gravaPergunta(p4);
        Pergunta p5 = new Pergunta();
        p5.setPergunta("Com que frequência você ou sua família compram eletrodomésticos e aparelhos eletrônicos?");
        p5.setCaminhoPergunta("src/imagens/Slide5.PNG");
        Map<Integer, String> alternativasPcinco = new HashMap<>();
        alternativasPcinco.put(4, "Sempre procuramos por novas versões.");
        alternativasPcinco.put(7, "Sempre que há um novo lançamento.");
        alternativasPcinco.put(8, "Varia de acordo com as condições financeira.");
        alternativasPcinco.put(10, "Somente quando quebram e precisam ser substituídos.");
        p5.setAlternativas(alternativasPcinco);
        PerguntasController.gravaPergunta(p5);
        Pergunta p6 = new Pergunta();
        p6.setPergunta("Como você descarta o lixo de sua casa?");
        p6.setCaminhoPergunta("src/imagens/Slide6.PNG");
        Map<Integer, String> alternativasPseis = new HashMap<>();
        alternativasPseis.put(4, "Não me preocupo em separar o lixo.");
        alternativasPseis.put(7, "Em apenas uma lixeira, pois não existe seleta coletiva em minha cidade.");
        alternativasPseis.put(8, "Separo, mas não há utilização de duas lixeiras em minha cidade.");
        alternativasPseis.put(10, "Em duas lixeiras um para lixo comum e outra para lixo reciclável.");
        p6.setAlternativas(alternativasPseis);
        PerguntasController.gravaPergunta(p6);
        Pergunta p7 = new Pergunta();
        p7.setPergunta("Qual meio de transporte você utiliza com frequência?");
        p7.setCaminhoPergunta("src/imagens/Slide7.PNG");
        Map<Integer, String> alternativasPsete = new HashMap<>();
        alternativasPsete.put(4, "Carro.");
        alternativasPsete.put(7, "Tenho carro, mas procuro utilizar o transporte público durante a semana e os carros apenas finais de semana.");
        alternativasPsete.put(8, "Transporte público.");
        alternativasPsete.put(10, "Bicicleta ou a pé.");
        p7.setAlternativas(alternativasPsete);
        PerguntasController.gravaPergunta(p7);
        Pergunta p8 = new Pergunta();
        p8.setPergunta("Você consome refrigerante com que frequência?");
        p8.setCaminhoPergunta("src/imagens/Slide8.PNG");
        Map<Integer, String> alternativasPoito = new HashMap<>();
        alternativasPoito.put(4, "Refrigerante é um vício, todos os dias da semana.");
        alternativasPoito.put(7, "De três a quatro vezes por semana.");
        alternativasPoito.put(8, "Uma vez por semana e até menos.");
        alternativasPoito.put(10, "Consumia, mas hoje parei.");
        p8.setAlternativas(alternativasPoito);
        PerguntasController.gravaPergunta(p8);
        Pergunta p9 = new Pergunta();
        p9.setPergunta("Quantos minutos você gasta tomando banho por dia, somando o tempo de todos os banhos que você toma por dia?");
        p9.setCaminhoPergunta("src/imagens/Slide9.PNG");
        Map<Integer, String> alternativasPnove = new HashMap<>();
        alternativasPnove.put(4, "acima de 36 minutos.");
        alternativasPnove.put(7, "de 26 a 35 minutos.");
        alternativasPnove.put(8, "de 16 a 25 minutos.");
        alternativasPnove.put(10, "de 5 a 15 minutos.");
        p9.setAlternativas(alternativasPnove);
        PerguntasController.gravaPergunta(p9);
        Pergunta p10 = new Pergunta();
        p10.setPergunta("Que quantidade você consome de alimentos que contêm açúcar refinado, doces, chocolates entre outros?");
        p10.setCaminhoPergunta("src/imagens/Slide10.PNG");
        Map<Integer, String> alternativasPdez = new HashMap<>();
        alternativasPdez.put(4, "Todos os dias da semana.");
        alternativasPdez.put(7, "Quatro vezes por semana.");
        alternativasPdez.put(8, "Gosto de doces, mais não como com frequência.");
        alternativasPdez.put(10, "Intercalo com alguns dias da semana.");
        p10.setAlternativas(alternativasPdez);
        PerguntasController.gravaPergunta(p10);
        rbAlternativaUm.setText(PerguntasController.getAlternativas(index, 4));
        rbAlternativaDois.setText(PerguntasController.getAlternativas(index, 7));
        rbAlternativaTres.setText(PerguntasController.getAlternativas(index, 8));
        rbAlternativaQuatro.setText(PerguntasController.getAlternativas(index, 10));
        String path = new File(PerguntasController.retornaCaminhoPergunta(index)).getAbsolutePath();
        ImageIcon imagemPergunta = new ImageIcon(path);
        lblImagemPergunta.setIcon(imagemPergunta);
        System.out.println(path);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbAlternativaUm = new javax.swing.JRadioButton();
        rbAlternativaDois = new javax.swing.JRadioButton();
        rbAlternativaTres = new javax.swing.JRadioButton();
        lblImagemPergunta = new javax.swing.JLabel();
        btnProxima = new javax.swing.JButton();
        rbAlternativaQuatro = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 650));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        buttonGroup1.add(rbAlternativaUm);

        buttonGroup1.add(rbAlternativaDois);
        rbAlternativaDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlternativaDoisActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlternativaTres);
        rbAlternativaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlternativaTresActionPerformed(evt);
            }
        });

        btnProxima.setText("Próxima");
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlternativaQuatro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAlternativaQuatro)
                    .addComponent(rbAlternativaTres)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImagemPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbAlternativaDois)
                        .addComponent(rbAlternativaUm)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblImagemPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAlternativaUm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativaDois)
                .addGap(4, 4, 4)
                .addComponent(rbAlternativaTres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlternativaQuatro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        // TODO add your handling code here:
        if (alternativasSelecionadas.size() == 10){
            btnProxima.setEnabled(false);
        }
        if(buttonGroup1.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Selecione umas das opções!");
        } else {
            index++;
            if(index <= PerguntasController.getArrayPerguntas().size()){
                if (rbAlternativaUm.isSelected()) {
                    alternativasSelecionadas.add(4);
                } else if (rbAlternativaDois.isSelected()) {
                    alternativasSelecionadas.add(7);
                } else if (rbAlternativaTres.isSelected()) {
                    alternativasSelecionadas.add(8);
                } else {
                    alternativasSelecionadas.add(10);
                }
                rbAlternativaUm.setText(PerguntasController.getAlternativas(index, 4));
                rbAlternativaDois.setText(PerguntasController.getAlternativas(index, 7));
                rbAlternativaTres.setText(PerguntasController.getAlternativas(index, 8));
                rbAlternativaQuatro.setText(PerguntasController.getAlternativas(index, 10));
                String path = new File(PerguntasController.retornaCaminhoPergunta(index)).getAbsolutePath();
                ImageIcon imagemPergunta = new ImageIcon(path);
                lblImagemPergunta.setIcon(imagemPergunta);
                System.out.println(PerguntasController.getAlternativas(index, 4));
                System.out.println(PerguntasController.getAlternativas(index, 7));
                System.out.println(PerguntasController.getAlternativas(index, 8));
                System.out.println(PerguntasController.getAlternativas(index, 10));
                System.out.println(PerguntasController.retornaCaminhoPergunta(index));
            } else {
                System.out.println(alternativasSelecionadas);
                int i = 0;
                while (i <= alternativasSelecionadas.size()-2){
                    i++;
                    pontuacaoFinal += alternativasSelecionadas.get(i);
                }
                if (pontuacaoFinal < 60){
                    JOptionPane.showMessageDialog(null, "Pontuação: "+pontuacaoFinal+"\nVocê precisa reavaliar alguns hábitos para ajudar o planeta.");
                    btnProxima.setEnabled(false);
                    this.dispose();
                } else if (pontuacaoFinal < 75){
                    JOptionPane.showMessageDialog(null, "Pontuação: "+pontuacaoFinal+"\nPegada bacana, porém se esforçar um pouco mais pode ajudar muito mais o planeta!");
                    btnProxima.setEnabled(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Pontuação: "+pontuacaoFinal+"\nUau, sua pegada ecológia é maneira. O Planeta agradece pela a colaboração.");
                    btnProxima.setEnabled(false);
                    this.dispose();
                }
            }     
        }
        System.out.println(JogadoresController.getJogador(0).getNome());
    }//GEN-LAST:event_btnProximaActionPerformed

    private void rbAlternativaDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlternativaDoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlternativaDoisActionPerformed

    private void rbAlternativaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlternativaTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlternativaTresActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProxima;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblImagemPergunta;
    private javax.swing.JRadioButton rbAlternativaDois;
    private javax.swing.JRadioButton rbAlternativaQuatro;
    private javax.swing.JRadioButton rbAlternativaTres;
    private javax.swing.JRadioButton rbAlternativaUm;
    // End of variables declaration//GEN-END:variables
}

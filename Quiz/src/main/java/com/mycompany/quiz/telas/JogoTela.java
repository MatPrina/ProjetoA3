/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quiz.telas;

/**
 *
 * @author mathe
 */
import com.mycompany.quiz.daos.QuestaoDAO;
import com.mycompany.quiz.Questao;
import com.mycompany.quiz.Sessao;
import com.mycompany.quiz.Usuario;
import com.mycompany.quiz.daos.UsuarioDAO;
import javax.swing.JOptionPane;
import java.util.Random;

public class JogoTela extends javax.swing.JFrame {

    /**
     * Creates new form JogoTela
     */
    
    private String pergunta;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaCorreta;
    private String justificativa;
    private String escolha;
    private int cont = 0;
    private int posicao;
    private int[] posicoes = new int[6];
    private int numeroQuestao = 1;
    
    public JogoTela() {
        super("Squizz");
        initComponents();
        resetUser();
        setQuestao();
        setLocationRelativeTo(null);
    }
    
    private void resetUser(){
        try{
            Sessao sessao = Sessao.getInstance();
            Usuario usuario = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            String nome = sessao.getNomeLogin();
            usuario.setNome(nome);
            dao.setUserByNome(usuario);
            dao.resetPontuacaoUser(usuario);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas técnicos");
            e.printStackTrace();
        }
    
    
    }
    
    private void setQuestao(){
        
        try {
            QuestaoDAO dao = new QuestaoDAO();
            Questao [] questoes = dao.obterQuestoes();
            Random gerador = new Random();
            int totalQuestoes = dao.getTotalQuestoes();
            posicao = gerador.nextInt(totalQuestoes);
            if(posicao != posicoes[0] && posicao != posicoes[1] && posicao != posicoes[2] && posicao != posicoes[3] && posicao != posicoes[4]){
                pergunta = questoes[posicao].getPergunta();
                alternativaA = questoes[posicao].getAlternativaA();
                alternativaB = questoes[posicao].getAlternativaB();
                alternativaC = questoes[posicao].getAlternativaC();
                alternativaD = questoes[posicao].getAlternativaD();
                alternativaCorreta = questoes[posicao].getAlternativaCorreta();
                justificativa = questoes[posicao].getJustificativa();
                lbl_pergunta.setText(pergunta);
                lbl_numeroQuestao.setText(String.valueOf(numeroQuestao));
                btn_alternativaA.setText(alternativaA);
                btn_alternativaB.setText(alternativaB);
                btn_alternativaC.setText(alternativaC);
                btn_alternativaD.setText(alternativaD);
                posicoes[cont] = posicao;
                cont++;
            }else{
                setQuestao();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
            e.printStackTrace();
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        btn_responder = new javax.swing.JButton();
        btn_alternativaA = new javax.swing.JRadioButton();
        btn_alternativaB = new javax.swing.JRadioButton();
        btn_alternativaC = new javax.swing.JRadioButton();
        btn_alternativaD = new javax.swing.JRadioButton();
        lbl_pergunta = new javax.swing.JLabel();
        lbl_numeroQuestao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_responder.setText("Responder");
        btn_responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_responderActionPerformed(evt);
            }
        });

        btnGroup.add(btn_alternativaA);
        btn_alternativaA.setText("Alternativa A");
        btn_alternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alternativaAActionPerformed(evt);
            }
        });

        btnGroup.add(btn_alternativaB);
        btn_alternativaB.setText("Alternativa B");
        btn_alternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alternativaBActionPerformed(evt);
            }
        });

        btnGroup.add(btn_alternativaC);
        btn_alternativaC.setText("Alterantiva C");
        btn_alternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alternativaCActionPerformed(evt);
            }
        });

        btnGroup.add(btn_alternativaD);
        btn_alternativaD.setText("Alternaitva D");
        btn_alternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alternativaDActionPerformed(evt);
            }
        });

        lbl_pergunta.setText("Pergunta");

        lbl_numeroQuestao.setText("N");

        jLabel1.setText("A)");

        jLabel2.setText("B)");

        jLabel3.setText("C)");

        jLabel4.setText("D)");

        jLabel5.setText(")");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_numeroQuestao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_pergunta))
                    .addComponent(btn_alternativaC)
                    .addComponent(btn_alternativaA)
                    .addComponent(btn_alternativaB)
                    .addComponent(btn_alternativaD)
                    .addComponent(btn_responder))
                .addGap(107, 285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pergunta)
                    .addComponent(lbl_numeroQuestao)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_alternativaA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alternativaB)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alternativaC)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alternativaD)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btn_responder)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alternativaAActionPerformed
        // TODO add your handling code here:
        escolha = "A";
    }//GEN-LAST:event_btn_alternativaAActionPerformed

    private void btn_alternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alternativaBActionPerformed
        // TODO add your handling code here:
        escolha = "B";
    }//GEN-LAST:event_btn_alternativaBActionPerformed

    private void btn_alternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alternativaCActionPerformed
        // TODO add your handling code here:
        escolha = "C";
    }//GEN-LAST:event_btn_alternativaCActionPerformed

    private void btn_alternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alternativaDActionPerformed
        // TODO add your handling code here:
        escolha = "D";
    }//GEN-LAST:event_btn_alternativaDActionPerformed

    private void btn_responderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_responderActionPerformed
        // TODO add your handling code here:
        try {
            Sessao sessao = Sessao.getInstance();
            Usuario usuario = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            String nome = sessao.getNomeLogin();
            usuario.setNome(nome);
            dao.setUserByNome(usuario);
            btnGroup.clearSelection();
        
            if(numeroQuestao <= 5){
                if(escolha.equals(alternativaCorreta)){
                    JOptionPane.showMessageDialog(null, "Parabéns você acertou!");
                    dao.atualizaPontuacaoUser(usuario);
                    if(numeroQuestao >= 5){
                        JOptionPane.showMessageDialog(null, "Quiz completo! Sua pontução foi de: " + dao.getPontuacaoUser(usuario));
                        MenuJogoTela mj = new MenuJogoTela();
                        mj.setVisible(true);
                        this.dispose();
                    }
                    numeroQuestao++;
                    setQuestao();
                }else{
                    JOptionPane.showMessageDialog(null, "Você errou... " + justificativa);
                    if(numeroQuestao >= 5){
                        JOptionPane.showMessageDialog(null, "Quiz completo! Sua pontução foi de: " + dao.getPontuacaoUser(usuario));
                        MenuJogoTela mj = new MenuJogoTela();
                        mj.setVisible(true);
                        this.dispose();
                    }
                    numeroQuestao++;
                    setQuestao();
                }
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos tente novamente mais tarde");
            e.printStackTrace();
        }   
    }//GEN-LAST:event_btn_responderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton btn_alternativaA;
    private javax.swing.JRadioButton btn_alternativaB;
    private javax.swing.JRadioButton btn_alternativaC;
    private javax.swing.JRadioButton btn_alternativaD;
    private javax.swing.JButton btn_responder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_numeroQuestao;
    private javax.swing.JLabel lbl_pergunta;
    // End of variables declaration//GEN-END:variables
}

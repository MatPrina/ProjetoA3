/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quiz.telas;

/**
 *
 * @author mathe
 */
import com.mycompany.quiz.Questao;
import com.mycompany.quiz.daos.QuestaoDAO;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class QuestoesTela extends javax.swing.JFrame {

    /**
     * Creates new form QuestoesTela
     */
    public QuestoesTela() {
        super("Squizz");
        initComponents();
        buscarQuestoes();
        setLocationRelativeTo(null);
    }
    
    private void buscarQuestoes(){
        try{
            QuestaoDAO dao = new QuestaoDAO();
            Questao [] questoes = dao.obterQuestoes();
            questoesComboBox.setModel(new DefaultComboBoxModel<>(questoes));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
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

        jPanel1 = new javax.swing.JPanel();
        questoesComboBox = new javax.swing.JComboBox<>();
        txf_pergunta = new javax.swing.JTextField();
        txf_alternativaA = new javax.swing.JTextField();
        txf_alternativaB = new javax.swing.JTextField();
        txf_alternativaC = new javax.swing.JTextField();
        txf_alternativaD = new javax.swing.JTextField();
        txf_alternativaCorreta = new javax.swing.JTextField();
        txf_justificativa = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        questoesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questoesComboBoxActionPerformed(evt);
            }
        });

        txf_pergunta.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_alternativaA.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_alternativaB.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_alternativaC.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_alternativaD.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_alternativaCorreta.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        txf_justificativa.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questoesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txf_pergunta)
                    .addComponent(txf_alternativaA)
                    .addComponent(txf_alternativaB)
                    .addComponent(txf_alternativaC)
                    .addComponent(txf_alternativaD)
                    .addComponent(txf_alternativaCorreta)
                    .addComponent(txf_justificativa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_voltar)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txf_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_alternativaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_alternativaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_alternativaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_alternativaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_alternativaCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_justificativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questoesComboBoxActionPerformed
        // TODO add your handling code here:
        try{
            QuestaoDAO dao = new QuestaoDAO();
            Questao [] questoes = dao.obterQuestoes();
            int posicao = questoesComboBox.getSelectedIndex();
            String pergunta = questoes[posicao].getPergunta();
            String alternativaA = questoes[posicao].getAlternativaA();
            String alternativaB = questoes[posicao].getAlternativaB();
            String alternativaC = questoes[posicao].getAlternativaC();
            String alternativaD = questoes[posicao].getAlternativaD();
            String alternativaCorreta = questoes[posicao].getAlternativaCorreta();
            String justificativa = questoes[posicao].getJustificativa();
            txf_pergunta.setText(pergunta);
            txf_alternativaA.setText(alternativaA);
            txf_alternativaB.setText(alternativaB);
            txf_alternativaC.setText(alternativaC);
            txf_alternativaD.setText(alternativaD);
            txf_alternativaCorreta.setText(alternativaCorreta);
            txf_justificativa.setText(justificativa);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_questoesComboBoxActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        try{
            String pergunta = txf_pergunta.getText();
            String alternativaA = txf_alternativaA.getText();
            String alternativaB = txf_alternativaB.getText();
            String alternativaC = txf_alternativaC.getText();
            String alternativaD = txf_alternativaD.getText();
            String alternativaCorreta = txf_alternativaCorreta.getText();
            String justificativa = txf_justificativa.getText();
            Questao questao = new Questao(pergunta, alternativaA, alternativaB, alternativaC, alternativaD, alternativaCorreta, justificativa);
            QuestaoDAO dao = new QuestaoDAO();
            dao.criaQuestao(questao);
            JOptionPane.showMessageDialog(null, "Questão criada com sucesso!");
            txf_pergunta.setText("");
            txf_alternativaA.setText("");
            txf_alternativaB.setText("");
            txf_alternativaC.setText("");
            txf_alternativaD.setText("");
            txf_alternativaCorreta.setText("");
            txf_justificativa.setText("");
            buscarQuestoes();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
            e.printStackTrace();
        }    
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        GerenciamentoTela gt = new GerenciamentoTela();
        gt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        // TODO add your handling code here:
        try {
            QuestaoDAO dao = new QuestaoDAO();
            Questao [] questoes = dao.obterQuestoes();
            int posicao = questoesComboBox.getSelectedIndex();
            String pergunta = txf_pergunta.getText();
            String alternativaA = txf_alternativaA.getText();
            String alternativaB = txf_alternativaB.getText();
            String alternativaC = txf_alternativaC.getText();
            String alternativaD = txf_alternativaD.getText();
            String alternativaCorreta = txf_alternativaCorreta.getText();
            String justificativa = txf_justificativa.getText();
            questoes[posicao].setPergunta(pergunta);
            questoes[posicao].setAlternativaA(alternativaA);
            questoes[posicao].setAlternativaB(alternativaB);
            questoes[posicao].setAlternativaC(alternativaC);
            questoes[posicao].setAlternativaD(alternativaD);
            questoes[posicao].setAlternativaCorreta(alternativaCorreta);
            questoes[posicao].setJustificativa(justificativa);
            dao.atualizaQuestao(questoes[posicao]);
            JOptionPane.showMessageDialog(null, "Questão atualizada com sucesso");
            buscarQuestoes();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos volte mais tarde");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        // TODO add your handling code here:
        try {
            QuestaoDAO dao = new QuestaoDAO();
            Questao [] questoes = dao.obterQuestoes();
            int posicao = questoesComboBox.getSelectedIndex();
            dao.removeQuestao(questoes[posicao]);
            JOptionPane.showMessageDialog(null, "Questão excluida com sucesso");
            txf_pergunta.setText("");
            txf_alternativaA.setText("");
            txf_alternativaB.setText("");
            txf_alternativaC.setText("");
            txf_alternativaD.setText("");
            txf_alternativaCorreta.setText("");
            txf_justificativa.setText("");
            buscarQuestoes();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas técnicos tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_removerActionPerformed

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
            java.util.logging.Logger.getLogger(QuestoesTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestoesTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestoesTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestoesTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestoesTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Questao> questoesComboBox;
    private javax.swing.JTextField txf_alternativaA;
    private javax.swing.JTextField txf_alternativaB;
    private javax.swing.JTextField txf_alternativaC;
    private javax.swing.JTextField txf_alternativaCorreta;
    private javax.swing.JTextField txf_alternativaD;
    private javax.swing.JTextField txf_justificativa;
    private javax.swing.JTextField txf_pergunta;
    // End of variables declaration//GEN-END:variables
}

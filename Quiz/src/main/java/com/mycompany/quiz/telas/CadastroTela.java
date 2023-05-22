/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quiz.telas;

/**
 *
 * @author mathe
 */
import com.mycompany.quiz.Usuario;
import com.mycompany.quiz.daos.UsuarioDAO;
import javax.swing.JOptionPane;

public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTela
     */
    public CadastroTela() {
        super("Squizz");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txf_nome = new javax.swing.JTextField();
        txf_email = new javax.swing.JTextField();
        pwf_senha = new javax.swing.JPasswordField();
        btn_menu = new javax.swing.JButton();
        btn_criaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txf_nome.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite seu nome"));

        txf_email.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite seu email"));

        pwf_senha.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite sua senha"));

        btn_menu.setText("Voltar ao Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_criaCadastro.setText("Criar Cadastro");
        btn_criaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btn_criaCadastro))
                    .addComponent(txf_nome)
                    .addComponent(txf_email)
                    .addComponent(pwf_senha))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu)
                    .addComponent(btn_criaCadastro))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        MenuInicial mi = new MenuInicial();
        mi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_criaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criaCadastroActionPerformed
        // TODO add your handling code here:
        Usuario usuarios = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        String nome = txf_nome.getText();
        String email = txf_email.getText();
        String senha = new String(pwf_senha.getPassword());
       
        try {
            usuarios.setNome(nome);
            usuarios.setEmail(email);
            usuarios.setSenha(senha);
            if(nome.equals("") || email.equals("") || senha.equals("")){
                JOptionPane.showMessageDialog(null, "Nome, email, ou senha inválidos");
            }else{
                if(dao.existeNomeUser(usuarios)){
                    JOptionPane.showMessageDialog(null, "Nome ja existênte");
                    txf_nome.setText("");
                }
                if(dao.existeEmailUser(usuarios)){
                    if(email.equals("administrador@squizz.com")){
                        dao.adicionaUser(usuarios);
                        JOptionPane.showMessageDialog(null,"Cadastro de Administrador realizado!");
                        txf_nome.setText("");
                        txf_email.setText("");
                        pwf_senha.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Email ja existênte");
                        txf_email.setText("");
                    }
                }
                if(!dao.existeNomeUser(usuarios) && !dao.existeEmailUser(usuarios)){
                    dao.adicionaUser(usuarios);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    txf_nome.setText("");
                    txf_email.setText("");
                    pwf_senha.setText("");
                }
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_criaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_criaCadastro;
    private javax.swing.JButton btn_menu;
    private javax.swing.JPasswordField pwf_senha;
    private javax.swing.JTextField txf_email;
    private javax.swing.JTextField txf_nome;
    // End of variables declaration//GEN-END:variables
}

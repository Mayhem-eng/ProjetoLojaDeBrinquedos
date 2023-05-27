/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigoFonte.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author felipe Eduardo Garcia ( Mayhem-eng )
 */
public class telaTest extends javax.swing.JFrame implements LoginObserver{
    
   static TelaPrincipalFinal tp = new TelaPrincipalFinal();
    static int verificaAcesso = 0;
    static FormularioLogin formulario;
    static AcessoAdmin acessoAdm;
    
     telaDeCadastro tc = new telaDeCadastro();
    
    private boolean inLoginIn = false;
   
    
    public telaTest() {
      
        initComponents();
        //desktop.add(tp);
        
        Date dt = new Date();
        DateFormat formated = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formated.format(dt));
        
   
    }

   
    public void onLoginSucess(){
        
        if(inLoginIn){
            
            JInternalFrame jif = desktop.getSelectedFrame();
            if(jif != null && jif instanceof FormularioLogin && jif instanceof AcessoAdmin){
                FormularioLogin fl = (FormularioLogin) jif;
                AcessoAdmin ac = (AcessoAdmin) jif;
                
                if(fl.isVisible()){
                   
                    formulario.setVisible(false);
                    
                }
                else{
                      tp.setCRUD(true);
                    acessoAdm.setVisible(false);
                    
                }
            }
            
             
           
            tp.setVisible(true);
            
            dispose();
            
        }
    }
    
    public void setLoginStatus(boolean status){
        inLoginIn = status;
        onLoginSucess();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        acessoLogin = new javax.swing.JMenuItem();
        acessoCadastro = new javax.swing.JMenuItem();
        acessoAdmin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        lblData.setText("DaTa");

        desktop.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        desktop.setPreferredSize(new java.awt.Dimension(676, 676));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabel1.setText("SHOPTOYS");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel2.setText("BEM-VINDO");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel3.setText("tRANSFORMANDO SORRISOS EM ");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel4.setText("BRINCADEIRAS");

        jMenu1.setText("Acesso");
        jMenu1.setAutoscrolls(true);

        acessoLogin.setText("login");
        acessoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessoLoginActionPerformed(evt);
            }
        });
        jMenu1.add(acessoLogin);

        acessoCadastro.setText("cadastro");
        acessoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(acessoCadastro);

        acessoAdmin.setText("admin");
        acessoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessoAdminActionPerformed(evt);
            }
        });
        jMenu1.add(acessoAdmin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("opções");
        jMenuBar1.add(jMenu2);

        jMenu6.setText("Ajuda");
        jMenuBar1.add(jMenu6);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lblData)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(102, 102, 102)
                .addComponent(lblData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1031, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acessoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessoLoginActionPerformed
       if(desktop.getAllFrames().length > 0){
            tc.dispose();
            acessoAdm.dispose();
        }
        formulario.setVisible(true);
        formulario.setClosable(true);
      
        
        desktop.add(formulario);
    
    }//GEN-LAST:event_acessoLoginActionPerformed

    private void acessoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessoCadastroActionPerformed
       if(desktop.getAllFrames().length > 0){
            formulario.dispose();
            acessoAdm.dispose();
        }
        tc.setVisible(true);
        tc.setClosable(true);
        desktop.add(tc);
    }//GEN-LAST:event_acessoCadastroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void acessoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessoAdminActionPerformed
        if(desktop.getAllFrames().length > 0){
            formulario.dispose();
            tc.dispose();
           
        }
        acessoAdm.setVisible(true);
        acessoAdm.setClosable(true);

        
        desktop.add(acessoAdm);
        
    }//GEN-LAST:event_acessoAdminActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        dispose();
       
    }//GEN-LAST:event_menuSairActionPerformed

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
            java.util.logging.Logger.getLogger(telaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
           
            telaTest tt = new telaTest();
            tt.setVisible(true);
            formulario = new FormularioLogin(tt);
            acessoAdm = new AcessoAdmin(tt);
            
       
                if(formulario.isVisible()){
                    verificaAcesso = 1;
                     tp.muda("USUARIO");
                     tt.onLoginSucess();
                }
                else if(acessoAdm.isVisible()){
                    verificaAcesso = 2;
                    tp.muda("adm");
                    tt.onLoginSucess();
                }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acessoAdmin;
    private javax.swing.JMenuItem acessoCadastro;
    private javax.swing.JMenuItem acessoLogin;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onLoginIn(boolean LoginSucesso) {
        setLoginStatus(LoginSucesso);
    }

    
}

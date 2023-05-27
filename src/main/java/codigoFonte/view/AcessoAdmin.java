/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package codigoFonte.view;

import codigoFonte.Controller.ConectarBD;
import codigoFonte.Controller.RoundedCornerBorder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Feh
 */
public class AcessoAdmin extends javax.swing.JInternalFrame {
    
    private LoginObserver  observer;

    ConectarBD conn = new ConectarBD();
    
   
    public AcessoAdmin(LoginObserver observer) {
        this.observer = observer;
        initComponents();
        
        if(conn.statusConexao()){
            tblStatus1.setText("conectado");
        }
        else{
            tblStatus1.setText("não conectado");
        }
    }
    
    public AcessoAdmin(){
        initComponents();
        
        if(conn.statusConexao()){
            tblStatus1.setText("conectado");
        }
        else{
            tblStatus1.setText("não conectado");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField() {
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                        0, 0, getWidth() - 1, getHeight() - 1));
                g2.dispose();
            }
            super.paintComponent(g);
        }
        @Override public void updateUI() {
            super.updateUI();
            setOpaque(false);
            setBorder(new RoundedCornerBorder());
        }
    };
    tblStatus = new javax.swing.JLabel();
    buttLogin = new javax.swing.JButton();
    buttVerSenha = new javax.swing.JCheckBox();
    txtUsuario = new javax.swing.JTextField() {
        @Override protected void paintComponent(Graphics g) {
            if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setPaint(getBackground());
                g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                    0, 0, getWidth() - 1, getHeight() - 1));
            g2.dispose();
        }
        super.paintComponent(g);
    }
    @Override public void updateUI() {
        super.updateUI();
        setOpaque(false);
        setBorder(new RoundedCornerBorder());
    }
    }
    ;
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    buttLogin1 = new javax.swing.JButton();
    txtSenha1 = new javax.swing.JPasswordField() {
        @Override protected void paintComponent(Graphics g) {
            if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setPaint(getBackground());
                g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                    0, 0, getWidth() - 1, getHeight() - 1));
            g2.dispose();
        }
        super.paintComponent(g);
    }
    @Override public void updateUI() {
        super.updateUI();
        setOpaque(false);
        setBorder(new RoundedCornerBorder());
    }
    };
    txtUsuario1 = new javax.swing.JTextField() {
        @Override protected void paintComponent(Graphics g) {
            if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setPaint(getBackground());
                g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                    0, 0, getWidth() - 1, getHeight() - 1));
            g2.dispose();
        }
        super.paintComponent(g);
    }
    @Override public void updateUI() {
        super.updateUI();
        setOpaque(false);
        setBorder(new RoundedCornerBorder());
    }
    }
    ;
    buttVerSenha1 = new javax.swing.JCheckBox();
    tblStatus1 = new javax.swing.JLabel();

    jInternalFrame1.setClosable(true);
    jInternalFrame1.setFocusTraversalPolicyProvider(true);
    jInternalFrame1.setVisible(true);

    jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    jLabel3.setText("SEJA BEM-VINDO DE VOLTA");

    jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
    jLabel1.setText("Usuário");

    jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
    jLabel2.setText("Senha");

    tblStatus.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
    tblStatus.setText("Status");

    buttLogin.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    buttLogin.setText("logar");
    buttLogin.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttLoginActionPerformed(evt);
        }
    });

    buttVerSenha.setPreferredSize(new java.awt.Dimension(33, 9));
    buttVerSenha.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            buttVerSenhaItemStateChanged(evt);
        }
    });

    txtUsuario.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
    txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txtUsuarioFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtUsuarioFocusLost(evt);
        }
    });
    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUsuarioActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
    jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
    jInternalFrame1Layout.setHorizontalGroup(
        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jInternalFrame1Layout.createSequentialGroup()
            .addGap(144, 144, 144)
            .addComponent(jLabel3)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jInternalFrame1Layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttLogin)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61))))
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addComponent(tblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    jInternalFrame1Layout.setVerticalGroup(
        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jInternalFrame1Layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addComponent(jLabel3)
            .addGap(126, 126, 126)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(85, 85, 85)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addComponent(buttVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tblStatus)
                .addComponent(buttLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(72, 72, 72))
    );

    setClosable(true);
    setTitle("admin");

    jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    jLabel4.setText("Acessar como administrador");

    jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    jLabel5.setText("User:");

    jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    jLabel6.setText("Senha:");

    buttLogin1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
    buttLogin1.setText("logar");
    buttLogin1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttLogin1ActionPerformed(evt);
        }
    });

    txtUsuario1.setFont(new java.awt.Font("Perpetua Titling MT", 2, 18)); // NOI18N
    txtUsuario1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txtUsuario1FocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txtUsuario1FocusLost(evt);
        }
    });
    txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUsuario1ActionPerformed(evt);
        }
    });

    buttVerSenha1.setPreferredSize(new java.awt.Dimension(33, 9));
    buttVerSenha1.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            buttVerSenha1ItemStateChanged(evt);
        }
    });

    tblStatus1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
    tblStatus1.setText("Status");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(99, 99, 99)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(64, 64, 64))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(buttLogin1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttVerSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addContainerGap(72, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addComponent(jLabel4)
            .addGap(99, 99, 99)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel5)
                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(87, 87, 87)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(buttVerSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(112, 112, 112)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(tblStatus1)
                .addComponent(buttLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(159, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLoginActionPerformed
       
    }//GEN-LAST:event_buttLoginActionPerformed

    private void buttVerSenhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buttVerSenhaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            txtSenha1.setEchoChar((char)0);
        }
        else{
            txtSenha1.setEchoChar('*');
        }
    }//GEN-LAST:event_buttVerSenhaItemStateChanged

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario1.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario1.getText().equals("")){
            txtUsuario1.setText("usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuario1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusGained
        txtUsuario1.setText("");
    }//GEN-LAST:event_txtUsuario1FocusGained

    private void txtUsuario1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusLost
        if(txtUsuario1.getText().equals("")){
            txtUsuario1.setText("usuário");
        }
    }//GEN-LAST:event_txtUsuario1FocusLost

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void buttVerSenha1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buttVerSenha1ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            txtSenha1.setEchoChar((char)0);
        }
        else{
            txtSenha1.setEchoChar('*');
        }
    }//GEN-LAST:event_buttVerSenha1ItemStateChanged

    private void buttLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLogin1ActionPerformed
         String usuario = txtUsuario1.getText();
        String senha = new String(txtSenha1.getPassword());

        if(!"".equals(usuario) && !"".equals(senha)){
            String sql = "select * from cadastro where usuario = ? AND senha = ?;";
            try{
                conn.ptsm = conn.conexao.prepareStatement(sql);
                conn.ptsm.setString(1, usuario);
                conn.ptsm.setString(2, senha);
                conn.ptsm.executeQuery();
                boolean loginSucess = true;
                
                observer.onLoginIn(loginSucess);
               
            }catch(SQLException e){
                txtUsuario1.setText("");
                txtSenha1.setText("");
                JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            }
        }
    }//GEN-LAST:event_buttLogin1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttLogin;
    private javax.swing.JButton buttLogin1;
    private javax.swing.JCheckBox buttVerSenha;
    private javax.swing.JCheckBox buttVerSenha1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel tblStatus;
    private javax.swing.JLabel tblStatus1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}

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
 * @author Felipe Eduardo Garcua ( Mayhem-eng )
 */
public class FormularioLogin extends javax.swing.JInternalFrame {
    private LoginObserver  observer;

    ConectarBD conn = new ConectarBD();
  
    public FormularioLogin(LoginObserver observer) {
        this.observer = observer;
        initComponents();
       
        
        if(conn.statusConexao()){
            tblStatus.setText("conectado");
        }
        else{
            tblStatus.setText("não conectado");
        }
    }

    FormularioLogin() {
         initComponents();
       
        
        if(conn.statusConexao()){
            tblStatus.setText("conectado");
        }
        else{
            tblStatus.setText("não conectado");
        }
    }
    
    /*
    public void addObserver(LoginObserver observer){
        observers.add(observer);
    }
    
    public void removeObserver(LoginObserver observer){
        observers.remove(observer);
    }
    
    public void notifYObserver(boolean loginSucess){
        for(LoginObserver observer : observers){
            observer.onLoginIn(loginSucess);
        }
    }
    */
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

    setClosable(true);
    setFocusTraversalPolicyProvider(true);
    setVisible(true);

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(144, 144, 144)
            .addComponent(jLabel3)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(107, 107, 107)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttLogin)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61))))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(tblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addComponent(jLabel3)
            .addGap(126, 126, 126)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(85, 85, 85)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addComponent(buttVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tblStatus)
                .addComponent(buttLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(72, 72, 72))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLoginActionPerformed
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

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
                txtUsuario.setText("");
                txtSenha.setText("");
                JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            }
        }
    }//GEN-LAST:event_buttLoginActionPerformed

    private void buttVerSenhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buttVerSenhaItemStateChanged
         if(evt.getStateChange() == ItemEvent.SELECTED){
            txtSenha.setEchoChar((char)0);
        }
        else{
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_buttVerSenhaItemStateChanged

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().equals("")){
            txtUsuario.setText("usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttLogin;
    private javax.swing.JCheckBox buttVerSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel tblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

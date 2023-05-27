/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigoFonte.view;

import codigoFonte.Controller.ConectarBD;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Feh
 */
public class TelaPrincipalFinal extends javax.swing.JFrame {

     ConectarBD conn = new ConectarBD();
    
    private JPanel container;
    private JPanel parentPanel;
    
    public TelaPrincipalFinal() {
        initComponents();
        
        conn.statusConexao();
       
        
        
        parentPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        parentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

         JScrollPane scrollPane = new JScrollPane(parentPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        
        
        
         try{
             
             executeSQL("select * from Produtos");
             while(conn.result.next()){
                 String produto = conn.result.getString("nome");
                 Double preco2 = conn.result.getDouble("preco");

                addproduto(new JLabel(produto), new JLabel(Double.toString(preco2)));
            }
        
        
        }catch(SQLException e){
            System.out.println("Não foi possivel, linha 41+: " + e);
        }
         
         panel.add(scrollPane, BorderLayout.CENTER);
     
    }
    public JPanel setaContainer(JLabel imagem, JLabel preco){
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
       
        container.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        container.add(imagem);
        container.add(preco);
        
        return container;
        
    }
    public void addproduto(JLabel imagem, JLabel preco){
   
       
            Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagemCentral.setText(imagem.getText());
                lblPrecoCenter.setText(preco.getText());
            }
        });

        imagem.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                timer.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                timer.stop();
            }

        });
    
        
        JPanel criarProduto = setaContainer(imagem, preco);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = parentPanel.getComponentCount() % 2;
        gbc.gridy = parentPanel.getComponentCount() / 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        parentPanel.add(criarProduto, gbc);
      
     
        //panel.removeAll();
    }
    
    public void CriarEAddProdutos(String produto, Double preco){
        JLabel prod = new JLabel(produto);
        JLabel prec = new JLabel(Double.toString(preco));
        
        
        addproduto(prod, prec);
    }
    
     public void executeSQL(String sql){
         try{
            conn.ptsm = conn.conexao.prepareStatement(sql);
            conn.result = conn.ptsm.executeQuery();
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    
    
     
     
     public void setCRUD(boolean status){
         if(status){
            NovoProduto.setVisible(true);
            atualizarProduto.setVisible(true);
            ExcluirProduto.setVisible(true);

         }else{
              NovoProduto.setVisible(false);
          atualizarProduto.setVisible(false);
          ExcluirProduto.setVisible(false);
        }
     }
         
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblImagemCentral = new javax.swing.JLabel();
        lblPrecoCenter = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        buttFavoritarProduto = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        buttFavorito = new javax.swing.JButton();
        buttCarinho = new javax.swing.JButton();
        buttAjuda = new javax.swing.JButton();
        buttSair = new javax.swing.JButton();
        atualizarProduto = new javax.swing.JButton();
        NovoProduto = new javax.swing.JButton();
        ExcluirProduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText("ShopToys");

        lblImagemCentral.setText("Ao clicar na Imagem do brinquedo escolhido ela vai aparecer aqui ampliada ");

        lblPrecoCenter.setText("Preço");

        jButton5.setText("Adicionar ao carrinho");

        buttFavoritarProduto.setText("favoritar");

        jButton7.setText("Comprar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttFavorito.setText("Favoritos");

        buttCarinho.setText("Carrinho");

        buttAjuda.setText("Ajuda");

        buttSair.setText("Sair");
        buttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSairActionPerformed(evt);
            }
        });

        atualizarProduto.setText("Atualizar");
        atualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdutoActionPerformed(evt);
            }
        });

        NovoProduto.setText("Novo");
        NovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoProdutoActionPerformed(evt);
            }
        });

        ExcluirProduto.setText("Excluir");
        ExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirProdutoActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        panel.setLayout(new java.awt.GridLayout(1, 2));
        scrollPane.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(NovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(atualizarProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(ExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(543, 543, 543))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttFavorito)
                        .addGap(38, 38, 38)
                        .addComponent(buttCarinho)
                        .addGap(44, 44, 44)
                        .addComponent(buttAjuda)
                        .addGap(27, 27, 27)
                        .addComponent(buttSair)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPrecoCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7)
                                .addComponent(jButton5))
                            .addGap(52, 52, 52))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(lblImagemCentral))
                                .addComponent(buttFavoritarProduto))
                            .addGap(20, 20, 20)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(lblImagemCentral)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttFavoritarProduto)
                            .addComponent(jButton7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttCarinho)
                            .addComponent(buttAjuda)
                            .addComponent(buttSair)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttSairActionPerformed
        dispose();
        telaTest tt = new telaTest();
        tt.setVisible(true);
    }//GEN-LAST:event_buttSairActionPerformed

    private void NovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoProdutoActionPerformed
       JOptionPane pane  = new JOptionPane();
       
       String nome = pane.showInputDialog(null, "Nome Do produto: ");
       String preco = pane.showInputDialog(null, "Preço do produto");
       
       String mensagem = "Nome: " + nome + "\n Preço: " + preco;
       
       JOptionPane.showConfirmDialog(null, mensagem, "Confirmar inserção?", NORMAL);
       
        String sql = "insert into produtos (nome, preco) values('" + nome + "', '"+ preco +"');";
        
       try{
          
            conn.ptsm = conn.conexao.prepareStatement(sql);
            int linhasAlterads = conn.ptsm.executeUpdate();
            
            if(linhasAlterads > 0){
                 executeSQL("select * from Produtos where nome = '"+ nome +"';");
            
        
            String produto = conn.result.getString("nome");
            Double preco2 = conn.result.getDouble("preco");

            addproduto(new JLabel(produto), new JLabel(Double.toString(preco2)));
            
            panel.removeAll();
            panel.revalidate();
            panel.repaint();
            }
           
            //CriarEAddProdutos(produto, preco2);
       }catch(SQLException e){
           //JOptionPane.showMessageDialog(null, "erro: " + e);
       }
        
        
    }//GEN-LAST:event_NovoProdutoActionPerformed

    private void atualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProdutoActionPerformed
          JOptionPane pane  = new JOptionPane();
     
          
        try{
            
            String codigoAlter = JOptionPane.showInputDialog("Informe o codigo da tabela a ser alterada: ");
            if(!codigoAlter.isEmpty()){
                
                String nome = pane.showInputDialog(null, "Nome Do produto: ");
                String preco = pane.showInputDialog(null, "Preço do produto");
                
                if(!nome.isEmpty() && !preco.isEmpty()){
                     String sql = "UPDATE produtos SET nome = '"+ nome +"', preco = '"+ Double.parseDouble(preco) +"' WHERE id = '"+ codigoAlter + "';";
                    conn.ptsm = conn.conexao.prepareStatement(sql);
                    
                    
           
                    int linhasAfetadas = conn.ptsm.executeUpdate();
                    
                     // Verificar se a atualização foi bem-sucedida
                    if (linhasAfetadas > 0) {
                        JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao atualizar o produto.");
                    }
                }

                }
            
             
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel puxar os dados ou código não existe"+e,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_atualizarProdutoActionPerformed

    private void ExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirProdutoActionPerformed
            try{
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ", "Confirmar", JOptionPane.YES_NO_OPTION, 3);
            
            String codigoExcluir = JOptionPane.showInputDialog("Insira o codigo da coluna a ser excluida");
        
            if(resposta == 0){
                String sql = "delete from produtos where id = " + codigoExcluir;
                conn.ptsm = conn.conexao.prepareStatement(sql);
                 
                conn.ptsm.executeUpdate();

            }
            else{
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!", "mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
            
        
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro na exclusão: "+e, "mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        
       }
    }//GEN-LAST:event_ExcluirProdutoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!lblImagemCentral.getText().isEmpty()){
             int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja comprar o item?", "Confirmar", JOptionPane.YES_NO_OPTION, 3);
             if(resposta == 0){
               JOptionPane.showMessageDialog(null, "Item comprado");

            }
            else{
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!", "mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
                }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaPrincipalFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton ExcluirProduto;
    protected javax.swing.JButton NovoProduto;
    protected javax.swing.JButton atualizarProduto;
    private javax.swing.JButton buttAjuda;
    private javax.swing.JButton buttCarinho;
    private javax.swing.JButton buttFavoritarProduto;
    private javax.swing.JButton buttFavorito;
    private javax.swing.JButton buttSair;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagemCentral;
    private javax.swing.JLabel lblPrecoCenter;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}

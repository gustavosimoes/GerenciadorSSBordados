/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author gustavo
 */
public class GerenciarEstoque extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarEstoque
     */
    public GerenciarEstoque() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_estoqueProduto = new javax.swing.JButton();
        btn_novoProduto = new javax.swing.JButton();
        btn_verEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 470));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(234, 211, 161));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 470));

        btn_estoqueProduto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_estoqueProduto.setText("Inserir Estoque Produto");
        btn_estoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estoqueProdutoActionPerformed(evt);
            }
        });

        btn_novoProduto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_novoProduto.setText("Cadastrar Novo Produto");
        btn_novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoProdutoActionPerformed(evt);
            }
        });

        btn_verEstoque.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_verEstoque.setText("Ver Estoque");
        btn_verEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_novoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btn_estoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btn_verEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_estoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btn_verEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoProdutoActionPerformed

        CadastroProduto cadastroNovoProduto = new CadastroProduto();
        cadastroNovoProduto.setVisible(true);
    }//GEN-LAST:event_btn_novoProdutoActionPerformed

    private void btn_estoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estoqueProdutoActionPerformed

        InserirEstoqueProduto inserirEstoqueProduto = new InserirEstoqueProduto();
        inserirEstoqueProduto.setVisible(true);
    }//GEN-LAST:event_btn_estoqueProdutoActionPerformed

    private void btn_verEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verEstoqueActionPerformed
        
        VerEstoque verEstoque = new VerEstoque();
        verEstoque.setVisible(true);
        
    }//GEN-LAST:event_btn_verEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_estoqueProduto;
    private javax.swing.JButton btn_novoProduto;
    private javax.swing.JButton btn_verEstoque;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

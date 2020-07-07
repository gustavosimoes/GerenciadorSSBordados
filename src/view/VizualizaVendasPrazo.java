/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Cliente;
import controller.GeradorPdf;
import controller.Venda;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ClienteDAO;

/**
 *
 * @author gustavo
 */
public class VizualizaVendasPrazo extends javax.swing.JFrame {

    /**
     * Creates new form VizualizaVendasPrazi
     */
    public VizualizaVendasPrazo() {
        initComponents();
        ClienteDAO daoCliente = new ClienteDAO();
        this.preencherTabela(daoCliente.listaClientes());
        this.alinhaCelulas();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_filtrar = new javax.swing.JTextField();
        btn_filtarClientes = new javax.swing.JButton();
        btn_mostrarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vendasPrazoGeral = new javax.swing.JTable();
        btn_salvarRelatorio = new javax.swing.JButton();
        btn_vizualizarSelecionado = new javax.swing.JButton();
        txt_valorTotalPrazo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(234, 211, 161));

        txt_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtrarActionPerformed(evt);
            }
        });

        btn_filtarClientes.setText("Filtrar");
        btn_filtarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtarClientesActionPerformed(evt);
            }
        });

        btn_mostrarTodos.setText("Mostrar Todos");
        btn_mostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarTodosActionPerformed(evt);
            }
        });

        tbl_vendasPrazoGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Valor à Receber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_vendasPrazoGeral);

        btn_salvarRelatorio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salvarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf1.png"))); // NOI18N
        btn_salvarRelatorio.setText("Salvar Relatório Completo");
        btn_salvarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarRelatorioActionPerformed(evt);
            }
        });

        btn_vizualizarSelecionado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_vizualizarSelecionado.setText("Vizualizar Cliente");
        btn_vizualizarSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vizualizarSelecionadoActionPerformed(evt);
            }
        });

        txt_valorTotalPrazo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt_valorTotalPrazo.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_valorTotalPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_vizualizarSelecionado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salvarRelatorio))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(btn_filtarClientes)
                            .addGap(50, 50, 50)
                            .addComponent(btn_mostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_filtarClientes)
                    .addComponent(btn_mostrarTodos))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_valorTotalPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vizualizarSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtrarActionPerformed

    private void btn_filtarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtarClientesActionPerformed
        if (!txt_filtrar.getText().isEmpty()) {
            this.preencherTabela(this.filtrarTabela());
        } else {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo de pesquisa.");
        }
    }//GEN-LAST:event_btn_filtarClientesActionPerformed

    private void btn_mostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarTodosActionPerformed
        ClienteDAO daoCliente = new ClienteDAO();
        this.preencherTabela(daoCliente.listaClientes());
    }//GEN-LAST:event_btn_mostrarTodosActionPerformed

    private void btn_salvarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarRelatorioActionPerformed
        GeradorPdf geradorPdf = new GeradorPdf();
        try {
            geradorPdf.salvarVendasPrazo(txt_valorTotalPrazo.getText());
        } catch (IOException ex) {
            Logger.getLogger(VizualizaVendasPrazo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_salvarRelatorioActionPerformed

    private void btn_vizualizarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vizualizarSelecionadoActionPerformed
        if (tbl_vendasPrazoGeral.getSelectedRow() != -1) {
            String nomeCliente = String.valueOf(tbl_vendasPrazoGeral.getValueAt(tbl_vendasPrazoGeral.getSelectedRow(), 0));
            VizualizaVendasPorCliente vizualizaVendasPorCliente = new VizualizaVendasPorCliente(nomeCliente);
            vizualizaVendasPorCliente.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para"
                    + " ver as informações detalhadas.");
        }


    }//GEN-LAST:event_btn_vizualizarSelecionadoActionPerformed

    private void alinhaCelulas() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        for (int numCol = 0; numCol < tbl_vendasPrazoGeral.getColumnCount(); numCol++) {
            tbl_vendasPrazoGeral.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
        }
    }

    private void preencherTabela(ArrayList<Cliente> listaClientes) {
        ArrayList<Venda> listaVendas = new ArrayList<>();
        ClienteDAO daoCliente = new ClienteDAO();
        DefaultTableModel dtmVendasGeral = (DefaultTableModel) tbl_vendasPrazoGeral.getModel();
        dtmVendasGeral.setRowCount(0);
        for (Cliente clienteTemp : listaClientes) {

            listaVendas = daoCliente.getVendaCliente(clienteTemp.getNome());
            clienteTemp.setListaVendas(listaVendas);
            String strSaldoDevedor = "R$ " + String.format("%.2f", clienteTemp.getSaldoDevedor());

            Object[] dados = {
                clienteTemp.getNome(),
                strSaldoDevedor
            };

            dtmVendasGeral.addRow(dados);
        }
        atualizaVendaPrazoTotal();
    }

    private ArrayList<Cliente> filtrarTabela() {
        DefaultTableModel dtmVendasGeral = (DefaultTableModel) tbl_vendasPrazoGeral.getModel();
        dtmVendasGeral.setRowCount(0);
        ClienteDAO daoCliente = new ClienteDAO();
        ArrayList<Cliente> listaFiltrada = new ArrayList<>();

        for (Cliente cliente : daoCliente.listaClientes()) {
            
            String str1 = this.formataStringComp(cliente.getNome());
            String str2 = this.formataStringComp(txt_filtrar.getText());
            if (str1.contains(str2)) {
                listaFiltrada.add(cliente);
            }
        }
        return listaFiltrada;
    }
    
    private void atualizaVendaPrazoTotal() {
        double valorTotal = 0;
        for (int i = 0; i < tbl_vendasPrazoGeral.getRowCount(); i++) {
            String strValorLinha = (String) tbl_vendasPrazoGeral.getModel().getValueAt(i, 1);
            double valorLinha = Double.parseDouble(strValorLinha.replace(",", ".").replace("R$ ", ""));
            valorTotal += valorLinha;
        }

        String strValorTotal = String.format("%.2f", valorTotal);
        txt_valorTotalPrazo.setText("R$  " + strValorTotal);
    }
    
    
    private String formataStringComp(String str) {
        str = this.removerAcentos(str.toLowerCase());
        return str;
    }

    private static String removerAcentos(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        return str;
    }

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
            java.util.logging.Logger.getLogger(VizualizaVendasPrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VizualizaVendasPrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VizualizaVendasPrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VizualizaVendasPrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizaVendasPrazo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filtarClientes;
    private javax.swing.JButton btn_mostrarTodos;
    private javax.swing.JButton btn_salvarRelatorio;
    private javax.swing.JButton btn_vizualizarSelecionado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_vendasPrazoGeral;
    private javax.swing.JTextField txt_filtrar;
    private javax.swing.JLabel txt_valorTotalPrazo;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaelbenz.sgsc.ui.desktop.cliente;

import com.rafaelbenz.sgsc.controller.ClienteRafsonController;
import com.rafaelbenz.sgsc.controller.IController;
import com.rafaelbenz.sgsc.modelo.Cliente;
import java.awt.Dimension;
import java.io.Serializable;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.UIManager;

/**
 *
 * @author Rafeal Benzaquem Neto
 */
public class ClienteControleFrame extends javax.swing.JInternalFrame implements ClienteControleFrameListener {

    ClienteTableModel clienteTableModel = new ClienteTableModel();
    NovoClienteFrame novoClienteFrame;
    AtualizarClienteFrame atualizarClienteFrame;
    VisualizarClienteFrame visualizarClienteFrame;

    IController<Cliente> clienteController = new ClienteRafsonController();

    /**
     * Creates new form ClienteFrame
     */
    public ClienteControleFrame() {
        initComponents();

        atualizarTabelaCliente();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 251, 251));

        jPanel2.setBackground(new java.awt.Color(236, 251, 251));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle Cliente"));

        jTable1.setModel(clienteTableModel);
        jScrollPane1.setViewportView(jTable1);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setToolTipText("");
        jButtonAdicionar.setPreferredSize(new java.awt.Dimension(75, 20));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        int indexRow = jTable1.getSelectedRow();
        Object[] objects = clienteTableModel.getRow(indexRow);
        Cliente cliente = clienteController.ler((Serializable) objects[0]);
        visualizarClienteFrame = new VisualizarClienteFrame(cliente);
        visualizarClienteFrame.setClienteFrameListener(this);
        visualizarClienteFrame.setVisible(true);
        visualizarClienteFrame.setClosable(true);
        visualizarClienteFrame.setResizable(false);
        visualizarClienteFrame.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.getDesktopPane().add(visualizarClienteFrame, 0);
        this.getDesktopPane().repaint();
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        novoClienteFrame = new NovoClienteFrame();
        novoClienteFrame.setClienteFrameListener(this);
        novoClienteFrame.setVisible(true);
        novoClienteFrame.setClosable(true);
        novoClienteFrame.setResizable(false);
        novoClienteFrame.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.getDesktopPane().add(novoClienteFrame, 0);
        this.getDesktopPane().repaint();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int indexRow = jTable1.getSelectedRow();
        Object[] objects = clienteTableModel.getRow(indexRow);
        clienteController.deletar((Serializable) objects[0]);
        atualizarTabelaCliente();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        int indexRow = jTable1.getSelectedRow();
        Object[] objects = clienteTableModel.getRow(indexRow);
        Cliente cliente = clienteController.ler((Serializable) objects[0]);
        atualizarClienteFrame = new AtualizarClienteFrame(cliente);
        atualizarClienteFrame.setClienteFrameListener(this);
        atualizarClienteFrame.setVisible(true);
        atualizarClienteFrame.setClosable(true);
        atualizarClienteFrame.setResizable(false);
        atualizarClienteFrame.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.getDesktopPane().add(atualizarClienteFrame, 0);
        this.getDesktopPane().repaint();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ClienteControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ClienteControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ClienteControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ClienteControleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ClienteControleFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizarClienteControleFrame() {
        atualizarTabelaCliente();
    }

    private void atualizarTabelaCliente() {
        clienteTableModel.removeAll();
        List<Cliente> clientes = clienteController.listar();
        clientes.forEach((cliente) -> {
            clienteTableModel.addRow(cliente);
        });
    }

}

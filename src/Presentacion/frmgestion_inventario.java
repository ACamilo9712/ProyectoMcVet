/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Actores.CentralInventario;
import Actores.Inventario;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo
 */
public class frmgestion_inventario extends javax.swing.JFrame {

    /**
     * Creates new form frmgestion_inventario
     */
    CentralInventario ci;
    Inventario inventario;

    frmgestion_inventario(CentralInventario ci) {
        initComponents();
        this.ci = ci;
        this.inventario = inventario;
        this.ci.tabla = TablaInventario;
    }

    public void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) TablaInventario.getModel();
        model.setRowCount(0);
    }

    public void llenarTablaInorder() {
        ci.inorder(ci.raiz);
    }

    public void llenarTablaPreorder() {
        ci.preorder(ci.raiz);
    }

    public void llenarTablaPostorder() {
        ci.postorder(ci.raiz);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarInv = new javax.swing.JButton();
        btnBuscarInv = new javax.swing.JButton();
        btnEliminarInv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxOrden = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        btnAgregarInv.setText("Agregar");
        btnAgregarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInvActionPerformed(evt);
            }
        });

        btnBuscarInv.setText("Buscar");
        btnBuscarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInvActionPerformed(evt);
            }
        });

        btnEliminarInv.setText("Eliminar");
        btnEliminarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInvActionPerformed(evt);
            }
        });

        jLabel1.setText("Ver Listado en:");

        cbxOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inorder", "Preorder", "Postorder" }));
        cbxOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdenActionPerformed(evt);
            }
        });

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Descripcion", "Presentacion", "Unidades Existentes"
            }
        ));
        TablaInventario.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(TablaInventario);
        TablaInventario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAgregarInv)
                .addGap(76, 76, 76)
                .addComponent(btnBuscarInv)
                .addGap(116, 116, 116)
                .addComponent(btnEliminarInv)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarInv)
                    .addComponent(btnBuscarInv)
                    .addComponent(btnEliminarInv)
                    .addComponent(jLabel1)
                    .addComponent(cbxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdenActionPerformed
        // TODO add your handling code here:

        if (cbxOrden.getSelectedItem().toString() == "Inorder") {
            ci.inorder(inventario);
            limpiarTabla();
            llenarTablaInorder();
        }
        if (cbxOrden.getSelectedItem().toString() == "Preorder") {
            limpiarTabla();
            llenarTablaPreorder();
        }
        if (cbxOrden.getSelectedItem().toString() == "Postorder") {
            limpiarTabla();
            llenarTablaPostorder();
        }


    }//GEN-LAST:event_cbxOrdenActionPerformed

    private void btnAgregarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInvActionPerformed
        // TODO add your handling code here:
        Inventario i = null;
        frmagg_Inventario form = new frmagg_Inventario(this.ci, this);
        form.toFront();
        form.setTitle("Agregar Producto");
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarInvActionPerformed

    private void btnBuscarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInvActionPerformed
        // TODO add your handling code here:
        frmbuscar_inventario form = new frmbuscar_inventario(this.ci, this);
        form.toFront();
        form.setTitle("Buscar Producto");
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBuscarInvActionPerformed

    private void btnEliminarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInvActionPerformed
        // TODO add your handling code here:
        frmeliminar_inventario form = new frmeliminar_inventario(this);
        form.toFront();
        form.setTitle("Eliminar Producto");
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarInvActionPerformed

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
            java.util.logging.Logger.getLogger(frmgestion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmgestion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmgestion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmgestion_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmgestion_inventario().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInventario;
    private javax.swing.JButton btnAgregarInv;
    private javax.swing.JButton btnBuscarInv;
    private javax.swing.JButton btnEliminarInv;
    private javax.swing.JComboBox<String> cbxOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

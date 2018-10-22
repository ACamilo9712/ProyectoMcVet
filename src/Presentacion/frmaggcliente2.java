/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Actores.CentralCliente;
import Actores.Cliente;
import javax.swing.JOptionPane;


public class frmaggcliente2 extends javax.swing.JFrame {

    private Cliente cliente;
    private frmgestion_clientes frmClientes;
    private CentralCliente cc;

    /**
     * Creates new form frmaggcliente2
     */
    public frmaggcliente2() {
        initComponents();
    }
    
  public frmaggcliente2(Cliente cliente, CentralCliente cc, frmgestion_clientes frmClientes)
  {
    initComponents();
    this.grupo_clientes.add(this.RB_ClienteAgregaralComienzo);
    this.grupo_clientes.add(this.RB_ClienteAgregaAlFinal);
    this.grupo_clientes.add(this.RB_ClienteAntesDe);
    this.grupo_clientes.add(this.RB_ClienteDespuesDe);
    this.cliente = cliente;
    this.cc = cc;
    this.frmClientes = frmClientes;
    super.setDefaultCloseOperation(HIDE_ON_CLOSE);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_clientes = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        RB_ClienteAgregaralComienzo = new javax.swing.JRadioButton();
        RB_ClienteAgregaAlFinal = new javax.swing.JRadioButton();
        RB_ClienteAntesDe = new javax.swing.JRadioButton();
        RB_ClienteDespuesDe = new javax.swing.JRadioButton();
        txt_ClienteAgregarAntesDe = new javax.swing.JTextField();
        txt_AgregarCodigoClienteDespues = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        RB_ClienteAgregaralComienzo.setText("Agregar al Comienzo");

        RB_ClienteAgregaAlFinal.setText("Agregar al final");

        RB_ClienteAntesDe.setText("Agregar antes de");

        RB_ClienteDespuesDe.setText("Agregar después de");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnfinalizar.setText("Finalizar");
        btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB_ClienteAgregaAlFinal)
                            .addComponent(RB_ClienteAgregaralComienzo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB_ClienteDespuesDe)
                            .addComponent(RB_ClienteAntesDe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_AgregarCodigoClienteDespues, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txt_ClienteAgregarAntesDe))
                        .addGap(73, 73, 73))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(btnfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(RB_ClienteAgregaralComienzo)
                .addGap(18, 18, 18)
                .addComponent(RB_ClienteAgregaAlFinal)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_ClienteAntesDe)
                    .addComponent(txt_ClienteAgregarAntesDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_ClienteDespuesDe)
                    .addComponent(txt_AgregarCodigoClienteDespues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnfinalizar))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarActionPerformed
        // TODO add your handling code here:
   
    if (this.RB_ClienteAgregaralComienzo.isSelected())
    {
      this.cc.agregarAlComienzo(this.cliente);
      JOptionPane.showMessageDialog(this.rootPane, "El cliente ha sido agregado");
    }
    if (this.RB_ClienteAgregaAlFinal.isSelected())
    {
      this.cc.agregarAlFinal(this.cliente);
      JOptionPane.showMessageDialog(this.rootPane, "El cliente ha sido agregado");
    }
    if (this.RB_ClienteAntesDe.isSelected()) {
      if (this.cc.buscarCliente(Integer.parseInt(this.txt_ClienteAgregarAntesDe.getText())) != null)
      {
        this.cc.insertarAntesDe(Integer.parseInt(this.txt_ClienteAgregarAntesDe.getText()), this.cliente);
        this.cc.mostrarClientes();
        JOptionPane.showMessageDialog(this.rootPane, "El cliente ha sido agregado");
      }
      else
      {
        JOptionPane.showMessageDialog(this.rootPane, "El cliente no existe");
      }
    }
    if (this.RB_ClienteDespuesDe.isSelected()) {
      if (this.cc.buscarCliente(Integer.parseInt(this.txt_AgregarCodigoClienteDespues.getText())) != null)
      {
        this.cc.insertarDespuesDe(Integer.parseInt(this.txt_AgregarCodigoClienteDespues.getText()), this.cliente);
        this.cc.mostrarClientes();
        JOptionPane.showMessageDialog(this.rootPane, "El cliente ha sido agregado");
      }
      else
      {
        JOptionPane.showMessageDialog(this.rootPane, "No se puede agregar el cliente");
      }
    }
    dispose();
    this.frmClientes.setVisible(true);
    this.frmClientes.llenarTabla();
    this.cc.mostrarClientes();
  
    }//GEN-LAST:event_btnfinalizarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmaggcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmaggcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmaggcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmaggcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmaggcliente2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB_ClienteAgregaAlFinal;
    private javax.swing.JRadioButton RB_ClienteAgregaralComienzo;
    private javax.swing.JRadioButton RB_ClienteAntesDe;
    private javax.swing.JRadioButton RB_ClienteDespuesDe;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnfinalizar;
    private javax.swing.ButtonGroup grupo_clientes;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JTextField txt_AgregarCodigoClienteDespues;
    private javax.swing.JTextField txt_ClienteAgregarAntesDe;
    // End of variables declaration//GEN-END:variables
}

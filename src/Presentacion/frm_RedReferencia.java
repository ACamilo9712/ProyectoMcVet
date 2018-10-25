/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Actores.CentralClinica;
import Actores.CentralRedReferencia;
import Actores.Establecimiento;
import Actores.Pintar;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frm_RedReferencia extends javax.swing.JFrame {

    
    CentralClinica  cl;
    Pintar pintar = new Pintar();
    CentralRedReferencia arboles = new CentralRedReferencia();
    frm_AgregarClinica nuevaClinica = new frm_AgregarClinica(this.cl, this);
    Establecimiento e;
    
    
    public void R_repaint(int tope, CentralRedReferencia arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Pintar.pintarLinea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), String.valueOf(arboles.getNombre(j)));
        }

    }

    public void R_repaint() {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Pintar.pintarLinea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < i; j++) {
            Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), String.valueOf(arboles.getNombre(j)+e.getNombreEstablecimiento()));
        }
    }

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste, int tope) {
        int nodoOrigen = 0;
        try {
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog("" + nodoOrige));
            if (nodoOrigen >= tope) {
                JOptionPane.showMessageDialog(null, "" + noExiste + "\nDebe de ingresar  un Nodo existente");
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        } catch (Exception ex) {
            nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
        }
        return nodoOrigen;
    }

    public int ingresarTamano(String tama) {
        int tamano = 0;
        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
            if (tamano < 1) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        } catch (Exception ex) {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }

    public boolean cicDerechoSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {// consultamos si se ha sado  click sobre algun nodo 
            if ((xxx + 2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j) + 13) && (yyy + 2) > arboles.getCordeY(j) && yyy < (arboles.getCordeY(j) + 13)) {

                if (n == 0) {
                    id = j;
                    R_repaint(tope, arboles);
                    Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    n++;
                } else {
                    id2 = j;
                    n++;
                    Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    if (id == id2) {// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                        n = 0;
                        Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(e.getNombreEstablecimiento()));
                        id = -1;
                        id2 = -1;
                    }
                }
                nn = 0;
                return true;
            }
        }
        frm_AgregarClinica form = new frm_AgregarClinica(this.cl, this);
        form.toFront();
        form.setVisible(true);        
        return false;
    }

    public void clicIzqSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {
            if ((xxx + 2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j) + 13) && (yyy + 2) > arboles.getCordeY(j) && yyy < (arboles.getCordeY(j) + 13)) {
                if (nn == 0) {
                    permanente = j;
                    R_repaint(tope, arboles);
                } else {
                    nodoFin = j;
                }
                nn++;
                n = 0;
                id = -1;
                Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.GREEN);
                break;
            }
          
        }
        this.cl.mostrarClientes();
      

    }

    public frm_RedReferencia(CentralClinica cl) {
        initComponents();
        this.cl=cl;
    }

    Frame frame;

    public frm_RedReferencia(Pintar pinta, CentralRedReferencia arbole, int ii, Frame fram) {
        initComponents();
        i = ii;
        this.pintar = pinta;
        this.arboles = arbole;
        frame = fram;
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
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Eliminar Nodo ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Arista");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Establecimiento Inicial");

        jLabel5.setText("Establecimiento Final");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(n2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(34, 34, 34))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            clicIzqSobreNodo(xxx, yyy);

        } else {
            if (!cicDerechoSobreNodo(xxx, yyy)) {// si  clik sobre  nodo es falso entra
                if (tope < 50) {
                    arboles.setCordeX(tope, xxx);
                    arboles.setCordeY(tope, yyy);
                    arboles.setNombre(tope, tope);
                    Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(tope), arboles.getCordeY(tope), String.valueOf(arboles.getNombre(tope)));
                    tope++;
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha llegado al Maximo de nodos..");
                }
            }
            if (n == 2) {
                n = 0;
                int ta = 5;
                if (aristaMayor < ta) {
                    aristaMayor = ta;
                }
                arboles.setmAdyacencia(id2, id, 1);
                arboles.setmAdyacencia(id, id2, 1);
                arboles.setmCoeficiente(id2, id, ta);
                arboles.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), arboles.getCordeX(id2), arboles.getCordeY(id2), ta);
                Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(arboles.getNombre(id)));
                Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id2), arboles.getCordeY(id2), String.valueOf(arboles.getNombre(id2)));
                id = -1;
                id2 = -1;
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int x;
        int y;
        int ta;
        if (n1.getText().length() < 1 || n2.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Error.. Faltan datos : ");
        } else {
            x = Integer.parseInt(n1.getText());
            y = Integer.parseInt(n2.getText());

            if (x == y) {
                JOptionPane.showMessageDialog(null, "Error.. Debe digitar un nodo diferente a : " + y);
            } else if (x < 0 || x >= i || y < 0 || y >= i) {

                arboles.setmAdyacencia(x, y, 0);
                arboles.setmAdyacencia(y, x, 0);
                arboles.setmCoeficiente(x, y, 0);
                arboles.setmCoeficiente(y, x, 0);
                n1.setText(null);
                n2.setText(null);
                jPanel1.paint(jPanel1.getGraphics());

                R_repaint(tope, arboles);
            }

        }


    }//GEN-LAST:event_jButton4ActionPerformed

 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int Eliminar = Integer.parseInt(jTextField2.getText());
        if (Eliminar <= tope && Eliminar >= 0 && tope > 0) {
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope; k++) {
                    if (j == Eliminar || k == Eliminar) {
                        arboles.setmAdyacencia(j, k, -1);
                    }
                }
            }
            for (int l = 0; l < tope - 1; l++) {
                for (int m = 0; m < tope; m++) {
                    if (arboles.getmAdyacencia(l, m) == -1) {
                        arboles.setmAdyacencia(l, m, arboles.getmAdyacencia(l + 1, m));
                        arboles.setmAdyacencia(l + 1, m, -1);
                        arboles.setmCoeficiente(l, m, arboles.getmCoeficiente(l + 1, m));
                    }
                }
            }
            for (int l = 0; l < tope; l++) {
                for (int m = 0; m < tope - 1; m++) {

                    if (arboles.getmAdyacencia(l, m) == -1) {
                        arboles.setmAdyacencia(l, m, arboles.getmAdyacencia(l, m + 1));
                        arboles.setmAdyacencia(l, m + 1, -1);
                        arboles.setmCoeficiente(l, m, arboles.getmCoeficiente(l, m + 1));

                    }
                }
            }

            arboles.setCordeX(Eliminar, -10);
            arboles.setCordeY(Eliminar, -10);
            arboles.setNombre(Eliminar, -10);
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope - 1; k++) {
                    if (arboles.getCordeX(k) == -10) {
                        arboles.setCordeX(k, arboles.getCordeX(k + 1));
                        arboles.setCordeX(k + 1, -10);
                        arboles.setCordeY(k, arboles.getCordeY(k + 1));
                        arboles.setCordeY(k + 1, -10);
                        arboles.setNombre(k, arboles.getNombre(k + 1));
                        arboles.setNombre(k + 1, -10);
                    }
                }
            }
            for (int j = 0; j < tope; j++) {

            }
            // eliminamos los -1 y  los -10 
            for (int j = 0; j < tope + 1; j++) {
                for (int k = 0; k < tope + 1; k++) {
                    if (arboles.getmAdyacencia(j, k) != -1) {
                        arboles.setmAdyacencia(j, k, arboles.getmAdyacencia(j, k));
                    } else {
                        arboles.setmAdyacencia(j, k, 0);
                    }
                    if (arboles.getmCoeficiente(j, k) != -10) {
                        arboles.setmCoeficiente(j, k, arboles.getmCoeficiente(j, k));
                    } else {
                        arboles.setmCoeficiente(j, k, 0);
                    }
                }
            }
            tope--;
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope, arboles);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean NodosEnElLienzo(int caja) {       
        for (int j = 0; j < tope; j++) {
            if (arboles.getNombre(j) == caja) {
                return true;
            }
        }
        return false;
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    private int i = 0;
    private int tope = 0;// lleva el # de nodos creado 
    private int nodoFin;
    private int permanente;
    int n = 0, nn = 0, id, id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    // End of variables declaration//GEN-END:variables
}

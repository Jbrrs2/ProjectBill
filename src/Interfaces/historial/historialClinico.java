/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces.historial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class historialClinico extends javax.swing.JFrame {

    boolean fi, hi, in, ci, fa, rec;

    public historialClinico() {
        initComponents();

        seleccion("fi");
        fichaPaciente ficha = new fichaPaciente();
        abrirVentana(ficha);
        getContentPane().setBackground(Color.white);
    }

    public void cerrar() {
        fi = false;
        hi = false;
        in = false;
        ci = false;
        fa = false;
        rec = false;

        lbficha.setForeground(Color.white);
        lbhistoria.setForeground(Color.white);
        lbinformes.setForeground(Color.white);
        lbcitas.setForeground(Color.white);
        lbfacturas.setForeground(Color.white);
        lbrecetas.setForeground(Color.white);

        lbficha.setOpaque(false);
        lbhistoria.setOpaque(false);
        lbinformes.setOpaque(false);
        lbcitas.setOpaque(false);
        lbfacturas.setOpaque(false);
        lbrecetas.setOpaque(false);

    }

    public void seleccion(String entrada) {
        HashMap<String, JLabel> navegacion = new HashMap<>();

        navegacion.put("fi", lbficha);
        navegacion.put("hi", lbhistoria);
        navegacion.put("in", lbinformes);
        navegacion.put("ci", lbcitas);
        navegacion.put("fa", lbfacturas);
        navegacion.put("rec", lbrecetas);

        HashMap<String, Boolean> estados = new HashMap<>();
        estados.put("fi", false);
        estados.put("hi", false);
        estados.put("in", false);
        estados.put("ci", false);
        estados.put("fa", false);
        estados.put("rec", false);

        for (String clave : navegacion.keySet()) {
            if (entrada.equals(clave)) {
                cerrar();
                navegacion.get(clave).setForeground(new Color(102, 102, 102));
                navegacion.get(clave).setOpaque(true);

                estados.put(clave, true);
                fi = estados.get("fi");
                hi = estados.get("hi");
                in = estados.get("in");
                ci = estados.get("ci");
                fa = estados.get("fa");
                rec = estados.get("rec");
            }
        }

    }

    public void abrirVentana(JPanel entrada) {
        entrada.setLocation(0, 0);
        contenido.removeAll();
        contenido.setLayout(new BorderLayout());
        contenido.add(entrada, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbficha = new javax.swing.JLabel();
        lbhistoria = new javax.swing.JLabel();
        lbinformes = new javax.swing.JLabel();
        lbcitas = new javax.swing.JLabel();
        lbfacturas = new javax.swing.JLabel();
        lbrecetas = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha Paciente");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbficha.setBackground(new java.awt.Color(255, 255, 255));
        lbficha.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbficha.setForeground(new java.awt.Color(255, 255, 255));
        lbficha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbficha.setText("Ficha Paciente");
        lbficha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbfichaMouseClicked(evt);
            }
        });

        lbhistoria.setBackground(new java.awt.Color(255, 255, 255));
        lbhistoria.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbhistoria.setForeground(new java.awt.Color(255, 255, 255));
        lbhistoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbhistoria.setText("Historial Clinico");
        lbhistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbhistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbhistoriaMouseClicked(evt);
            }
        });

        lbinformes.setBackground(new java.awt.Color(255, 255, 255));
        lbinformes.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbinformes.setForeground(new java.awt.Color(255, 255, 255));
        lbinformes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbinformes.setText("Informes");
        lbinformes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbinformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbinformesMouseClicked(evt);
            }
        });

        lbcitas.setBackground(new java.awt.Color(255, 255, 255));
        lbcitas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbcitas.setForeground(new java.awt.Color(255, 255, 255));
        lbcitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcitas.setText("Citas");
        lbcitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbcitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbcitasMouseClicked(evt);
            }
        });

        lbfacturas.setBackground(new java.awt.Color(255, 255, 255));
        lbfacturas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbfacturas.setForeground(new java.awt.Color(255, 255, 255));
        lbfacturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbfacturas.setText("Facturas");
        lbfacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbfacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbfacturasMouseClicked(evt);
            }
        });

        lbrecetas.setBackground(new java.awt.Color(255, 255, 255));
        lbrecetas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbrecetas.setForeground(new java.awt.Color(255, 255, 255));
        lbrecetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbrecetas.setText("Recetas");
        lbrecetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbrecetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbrecetasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lbficha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbhistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbinformes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbcitas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbfacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbrecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbficha, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lbhistoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbinformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbcitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbfacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbrecetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbfichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMouseClicked

        seleccion("fi");
        fichaPaciente ficha = new fichaPaciente();
        abrirVentana(ficha);

    }//GEN-LAST:event_lbfichaMouseClicked

    private void lbhistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhistoriaMouseClicked
        // TODO add your handling code here:
        seleccion("hi");
    }//GEN-LAST:event_lbhistoriaMouseClicked

    private void lbinformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbinformesMouseClicked
        // TODO add your handling code here:
        seleccion("in");
    }//GEN-LAST:event_lbinformesMouseClicked

    private void lbcitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbcitasMouseClicked
        // TODO add your handling code here:
        seleccion("ci");
    }//GEN-LAST:event_lbcitasMouseClicked

    private void lbfacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfacturasMouseClicked
        // TODO add your handling code here:
        seleccion("fa");
    }//GEN-LAST:event_lbfacturasMouseClicked

    private void lbrecetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbrecetasMouseClicked
        // TODO add your handling code here:
        seleccion("rec");
    }//GEN-LAST:event_lbrecetasMouseClicked

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
            java.util.logging.Logger.getLogger(historialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historialClinico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcitas;
    private javax.swing.JLabel lbfacturas;
    private javax.swing.JLabel lbficha;
    private javax.swing.JLabel lbhistoria;
    private javax.swing.JLabel lbinformes;
    private javax.swing.JLabel lbrecetas;
    // End of variables declaration//GEN-END:variables
}

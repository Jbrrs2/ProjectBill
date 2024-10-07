/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Menus.MenuPaciente;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class Inicio extends javax.swing.JFrame {

    int paci, home;

    public Inicio() {
        initComponents();
        getContentPane().setBackground(Color.white);

    }

    public void cerrar() {
        lbpaciente.setOpaque(false);
        lbpaciente.setForeground(Color.white);

        lbhome.setOpaque(false);
        lbhome.setForeground(Color.white);

        paci = 0;
        home = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbpaciente = new javax.swing.JLabel();
        lbhome = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbpaciente.setBackground(new java.awt.Color(255, 255, 255));
        lbpaciente.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lbpaciente.setForeground(new java.awt.Color(255, 255, 255));
        lbpaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpaciente.setText("Paciente");
        lbpaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbpaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbpacienteMouseClicked(evt);
            }
        });

        lbhome.setBackground(new java.awt.Color(255, 255, 255));
        lbhome.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbhome.setForeground(new java.awt.Color(255, 255, 255));
        lbhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hogar.png"))); // NOI18N
        lbhome.setText("Home");
        lbhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbhome.setPreferredSize(new java.awt.Dimension(33, 19));
        lbhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbhomeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbpaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
            .addComponent(lbhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbhome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(590, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbpacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbpacienteMouseClicked

        try {
//            cerrar();
//            paci = 1;
            cerrar();
            MenuPaciente mp = new MenuPaciente();

            mp.setLocation(0, 0);
            contenido.removeAll();
            contenido.setLayout(new BorderLayout());
            contenido.add(mp, BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
            lbpaciente.setOpaque(true);
            lbpaciente.setForeground(new Color(102, 102, 102));
            paci = 1;
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lbpacienteMouseClicked

    private void lbhomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhomeMousePressed
        // TODO add your handling code here:
        try {
            cerrar();
            lbhome.setOpaque(true);
            lbhome.setForeground(new Color(102, 102, 102));
            home = 1;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbhomeMousePressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();

                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbhome;
    private javax.swing.JLabel lbpaciente;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class MenuPaciente extends javax.swing.JPanel {

    int c,a;
    public MenuPaciente() {
        initComponents();
    }

    public void cerrar(){
        lbadmision.setOpaque(false);
        lbadmision.setForeground(Color.white);
        
        lbatencion.setOpaque(false);
        lbatencion.setForeground(Color.white);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbadmision = new javax.swing.JLabel();
        lbatencion = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbadmision.setBackground(new java.awt.Color(255, 255, 255));
        lbadmision.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbadmision.setForeground(new java.awt.Color(255, 255, 255));
        lbadmision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbadmision.setText("Citas y Admisiones");
        lbadmision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbadmision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbadmisionMousePressed(evt);
            }
        });

        lbatencion.setBackground(new java.awt.Color(255, 255, 255));
        lbatencion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbatencion.setForeground(new java.awt.Color(255, 255, 255));
        lbatencion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbatencion.setText("Atencion");
        lbatencion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbatencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbatencionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lbadmision, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbatencion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(791, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbatencion, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lbadmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbadmisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbadmisionMousePressed
        // TODO add your handling code here:

        try {
            menuAdmision a = new menuAdmision();
            a.setLocation(0, 0);
            contenido.removeAll();
            contenido.setLayout(new BorderLayout());
            contenido.add(a, BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
            

            cerrar();
            lbadmision.setOpaque(true);
            lbadmision.setForeground(new Color(102, 102, 102));
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lbadmisionMousePressed

    private void lbatencionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbatencionMousePressed
        // TODO add your handling code here:
        try {
            menuAtencion ma = new menuAtencion();
            ma.setLocation(0, 0);
            contenido.removeAll();
            contenido.setLayout(new BorderLayout());
            contenido.add(ma, BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();

            cerrar();
            lbatencion.setOpaque(true);
            lbatencion.setForeground(new Color(102, 102, 102));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_lbatencionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbadmision;
    private javax.swing.JLabel lbatencion;
    // End of variables declaration//GEN-END:variables
}

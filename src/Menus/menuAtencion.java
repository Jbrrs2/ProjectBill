/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus;

import Interfaces.Paciente.registroServicios;

/**
 *
 * @author USUARIO
 */
public class menuAtencion extends javax.swing.JPanel {

    /**
     * Creates new form menuAtencion
     */
    public menuAtencion() {
        initComponents();
        añadir();
    }

    public void añadir(){
        
        registroServicios registro = new registroServicios();
        paginas.add("Registro de Servicios", registro);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paginas = new javax.swing.JTabbedPane();

        setPreferredSize(new java.awt.Dimension(1202, 660));

        paginas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paginas, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paginas, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane paginas;
    // End of variables declaration//GEN-END:variables
}

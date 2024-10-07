/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.Paciente;

import Interfaces.historial.historialClinico;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

public class Admision extends javax.swing.JPanel {

    Icon alerta = new ImageIcon(getClass().getResource("/Img/1.gif"));
    Icon error = new ImageIcon(getClass().getResource("/Img/ee.gif"));
    Icon exitoso = new ImageIcon(getClass().getResource("/Img/2.gif"));
    
    public Admision() {
        initComponents();
        quitarBordes();
        documento.requestFocus();
    }

    public void quitarBordes() {
        paciente.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Paciente", 0, 0, null, new Color(102, 102, 102)));
        genero.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Genero", 0, 0, null, new Color(102, 102, 102)));
        edad.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Edad", 0, 0, null, new Color(102, 102, 102)));
        telefono.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Telefono", 0, 0, null, new Color(102, 102, 102)));
        email.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Correo Electronico", 0, 0, null, new Color(102, 102, 102)));
        direccion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Direccion", 0, 0, null, new Color(102, 102, 102)));
        tipoUser.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Tipo Usuario", 0, 0, null, new Color(102, 102, 102)));
        comboAfiliado.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Tipo Afiliado", 0, 0, null, new Color(102, 102, 102)));
        socioEconomico.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nivel Socio-Eco", 0, 0, null, new Color(102, 102, 102)));
        ips.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Ips o Sucursal", 0, 0, null, new Color(102, 102, 102)));
        contrato.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Contrato", 0, 0, null, new Color(102, 102, 102)));
        observacion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Observacion", 0, 0, null, new Color(102, 102, 102)));
        n_admision.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nro Admision", 0, 0, null, new Color(102, 102, 102)));
        motivo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Motivo Admision", 0, 0, null, new Color(102, 102, 102)));

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        n_admision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaAdmision = new com.toedter.calendar.JDateChooser();
        documento = new javax.swing.JTextField();
        ips = new javax.swing.JComboBox<>();
        paciente = new javax.swing.JTextField();
        socioEconomico = new javax.swing.JComboBox<>();
        tipoUser = new javax.swing.JComboBox<>();
        comboAfiliado = new javax.swing.JComboBox<>();
        edad = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lbficha = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        contrato = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        observacion = new javax.swing.JTextField();
        motivo = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1202, 660));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Documentos Entregados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("Carnet");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setText("Documento Identidad");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox3.setText("Seguro");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox5.setText("jCheckBox5");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        n_admision.setEditable(false);
        n_admision.setBackground(new java.awt.Color(255, 255, 255));
        n_admision.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha Admision");

        fechaAdmision.setBackground(new java.awt.Color(255, 255, 255));
        fechaAdmision.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        documento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        documento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                documentoKeyReleased(evt);
            }
        });

        ips.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        ips.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3", "Item 4" }));
        ips.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        paciente.setEditable(false);
        paciente.setBackground(new java.awt.Color(255, 255, 255));
        paciente.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        socioEconomico.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        socioEconomico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3", "Item 4" }));
        socioEconomico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tipoUser.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoUserItemStateChanged(evt);
            }
        });

        comboAfiliado.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        comboAfiliado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboAfiliado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAfiliadoItemStateChanged(evt);
            }
        });

        edad.setEditable(false);
        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        genero.setEditable(false);
        genero.setBackground(new java.awt.Color(255, 255, 255));
        genero.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        email.setEditable(false);
        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        lbficha.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lbficha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbficha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/historial-medico.png"))); // NOI18N
        lbficha.setText("Ficha Paciente");
        lbficha.setToolTipText(""); // NOI18N
        lbficha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbfichaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbfichaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbfichaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbfichaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbfichaMouseReleased(evt);
            }
        });

        direccion.setEditable(false);
        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        contrato.setEditable(false);
        contrato.setBackground(new java.awt.Color(255, 255, 255));
        contrato.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregar.png"))); // NOI18N
        jLabel7.setToolTipText("Añadir Paciente");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        observacion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        motivo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        motivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Procedimiento Programado", "Consulta", "Urgencia", "Enfermedad crónica descompensada" }));
        motivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbficha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(observacion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n_admision, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(paciente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(genero))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                .addComponent(contrato))
                                            .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboAfiliado, javax.swing.GroupLayout.Alignment.LEADING, 0, 199, Short.MAX_VALUE)
                                    .addComponent(tipoUser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ips, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(socioEconomico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n_admision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(socioEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbficha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void documentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoKeyReleased
        // TODO add your handling code here:
        if (!documento.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Solo se Permiten Numero", "Error", 1, error);
            documento.setText("");
            documento.requestFocus();

        }

    }//GEN-LAST:event_documentoKeyReleased

    private void tipoUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoUserItemStateChanged
        // TODO add your handling code here:
      

    }//GEN-LAST:event_tipoUserItemStateChanged

    private void comboAfiliadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAfiliadoItemStateChanged
        // TODO add your handling code here:
        String afiliado = comboAfiliado.getSelectedItem().toString();

    }//GEN-LAST:event_comboAfiliadoItemStateChanged

    private void lbfichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMouseClicked
        // TODO add your handling code here:
        historialClinico hc = new historialClinico();
        hc.setVisible(true);
    }//GEN-LAST:event_lbfichaMouseClicked

    private void lbfichaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMouseEntered
        // TODO add your handling code here:
        lbficha.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbfichaMouseEntered

    private void lbfichaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMouseExited
        // TODO add your handling code here:
        lbficha.setForeground(Color.black);
    }//GEN-LAST:event_lbfichaMouseExited

    private void lbfichaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbfichaMousePressed

    private void lbfichaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbfichaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbfichaMouseReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        agregarPaciente ag = new agregarPaciente();
        ag.setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAfiliado;
    private javax.swing.JTextField contrato;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private com.toedter.calendar.JDateChooser fechaAdmision;
    private javax.swing.JTextField genero;
    private static javax.swing.JComboBox<String> ips;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbficha;
    private javax.swing.JComboBox<String> motivo;
    private javax.swing.JTextField n_admision;
    private javax.swing.JTextField observacion;
    private javax.swing.JTextField paciente;
    private javax.swing.JComboBox<String> socioEconomico;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipoUser;
    // End of variables declaration//GEN-END:variables
}

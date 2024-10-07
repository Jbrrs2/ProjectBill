/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.historial;

import conector.RoundedPanel;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class fichaPaciente extends javax.swing.JPanel {

    boolean ob, al, ha, qu, cro;

    public fichaPaciente() {
        initComponents();

        bteditar.putClientProperty("JButton.buttonType", "roundRect");
        btcancelar.putClientProperty("JButton.buttonType", "roundRect");
        quitarBordes();

        btguardar.setVisible(false);
        btcancelar.setVisible(false);
    }

    public void quitarBordes() {
        apellidoP.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Primer Apellido", 0, 0, null, new Color(102, 102, 102)));
        apellidoS.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Segundo Apellido", 0, 0, null, new Color(102, 102, 102)));
        nombre.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nombre", 0, 0, null, new Color(102, 102, 102)));
        estadoCivil.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Estado Civil", 0, 0, null, new Color(102, 102, 102)));
        edad.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Edad", 0, 0, null, new Color(102, 102, 102)));
        grupoSanguineo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Gr. Sanguineo", 0, 0, null, new Color(102, 102, 102)));
        documento.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Documento", 0, 0, null, new Color(102, 102, 102)));
        telefono.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Telefono", 0, 0, null, new Color(102, 102, 102)));
        celular.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Celular", 0, 0, null, new Color(102, 102, 102)));
        n_historia.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nro Historia Clinica", 0, 0, null, new Color(102, 102, 102)));
        email.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Correo Electronico", 0, 0, null, new Color(102, 102, 102)));
        aseguradora.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Aseguradora", 0, 0, null, new Color(102, 102, 102)));
        n_poliza.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nro Poliza", 0, 0, null, new Color(102, 102, 102)));
        direccion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Direccion", 0, 0, null, new Color(102, 102, 102)));
        departamento.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Departamento", 0, 0, null, new Color(102, 102, 102)));
        municipio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Municipio", 0, 0, null, new Color(102, 102, 102)));
        f_nacimiento.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Fecha Nacimiento", 0, 0, null, new Color(102, 102, 102)));

    }

    public void editar(Boolean entrada) {

        if (entrada == false) {
            apellidoP.setEditable(false);
            apellidoS.setEditable(false);
            nombre.setEditable(false);
            edad.setEditable(false);
            grupoSanguineo.setEditable(false);
            telefono.setEditable(false);
            celular.setEditable(false);
            email.setEditable(false);
            aseguradora.setEditable(false);
            n_poliza.setEditable(false);
            direccion.setEditable(false);
            departamento.setEditable(false);
            municipio.setEditable(false);
            estadoCivil.setEditable(false);
            f_nacimiento.setEditable(false);

        }
        if (entrada == true) {
            apellidoP.setEditable(true);
            apellidoS.setEditable(true);
            nombre.setEditable(true);
            edad.setEditable(true);
            grupoSanguineo.setEditable(true);
            telefono.setEditable(true);
            celular.setEditable(true);
            email.setEditable(true);
            aseguradora.setEditable(true);
            n_poliza.setEditable(true);
            direccion.setEditable(true);
            departamento.setEditable(true);
            municipio.setEditable(true);
            estadoCivil.setEditable(true);
            f_nacimiento.setEditable(true);
        }

    }

    public void cerrar() {
        ob = false;
        al = false;
        ha = false;
        qu = false;
        cro = false;

        lbobservaciones.setForeground(new Color(102, 102, 102));
        lbalergias.setForeground(new Color(102, 102, 102));
        lbhabitual.setForeground(new Color(102, 102, 102));
        lbquirurgicas.setForeground(new Color(102, 102, 102));
        lbcronicas.setForeground(new Color(102, 102, 102));
    }

    public void seleccion(String entrada) {
        HashMap<String, JLabel> navegacion = new HashMap<>();

        navegacion.put("ob", lbobservaciones);
        navegacion.put("al", lbalergias);
        navegacion.put("ha", lbhabitual);
        navegacion.put("qu", lbquirurgicas);
        navegacion.put("cro", lbcronicas);

        HashMap<String, Boolean> estados = new HashMap<>();
        estados.put("ob", false);
        estados.put("al", false);
        estados.put("ha", false);
        estados.put("qu", false);
        estados.put("cro", false);

        for (String clave : navegacion.keySet()) {
            if (entrada.equals(clave)) {
                cerrar();
                navegacion.get(clave).setForeground(new Color(0, 153, 153));

                estados.put(clave, true);
                ob = estados.get("ob");
                al = estados.get("al");
                ha = estados.get("ha");
                qu = estados.get("qu");
                cro = estados.get("cro");

            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        apellidoP = new javax.swing.JTextField();
        apellidoS = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JComboBox<>();
        edad = new javax.swing.JTextField();
        grupoSanguineo = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        n_historia = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        aseguradora = new javax.swing.JTextField();
        n_poliza = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        municipio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        lbobservaciones = new javax.swing.JLabel();
        lbalergias = new javax.swing.JLabel();
        lbhabitual = new javax.swing.JLabel();
        lbquirurgicas = new javax.swing.JLabel();
        lbcronicas = new javax.swing.JLabel();
        bteditar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        f_nacimiento = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setText("Genero");

        jRadioButton1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jRadioButton1.setText("Hombre");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRadioButton2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jRadioButton2.setText("Mujer");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        apellidoP.setEditable(false);
        apellidoP.setBackground(new java.awt.Color(255, 255, 255));
        apellidoP.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        apellidoS.setEditable(false);
        apellidoS.setBackground(new java.awt.Color(255, 255, 255));
        apellidoS.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        estadoCivil.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        estadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        edad.setEditable(false);
        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        grupoSanguineo.setEditable(false);
        grupoSanguineo.setBackground(new java.awt.Color(255, 255, 255));
        grupoSanguineo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        documento.setEditable(false);
        documento.setBackground(new java.awt.Color(255, 255, 255));
        documento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        celular.setEditable(false);
        celular.setBackground(new java.awt.Color(255, 255, 255));
        celular.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        n_historia.setEditable(false);
        n_historia.setBackground(new java.awt.Color(255, 255, 255));
        n_historia.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        email.setEditable(false);
        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        aseguradora.setEditable(false);
        aseguradora.setBackground(new java.awt.Color(255, 255, 255));
        aseguradora.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        n_poliza.setEditable(false);
        n_poliza.setBackground(new java.awt.Color(255, 255, 255));
        n_poliza.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        direccion.setEditable(false);
        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        departamento.setEditable(false);
        departamento.setBackground(new java.awt.Color(255, 255, 255));
        departamento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        municipio.setEditable(false);
        municipio.setBackground(new java.awt.Color(255, 255, 255));
        municipio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        tabla.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jToolBar1.setRollover(true);

        lbobservaciones.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbobservaciones.setForeground(new java.awt.Color(102, 102, 102));
        lbobservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-arriba-a-la-derecha-desde-el-cuadrado.png"))); // NOI18N
        lbobservaciones.setText("Observaciones");
        lbobservaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbobservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbobservacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbobservacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbobservacionesMouseExited(evt);
            }
        });

        lbalergias.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbalergias.setForeground(new java.awt.Color(102, 102, 102));
        lbalergias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-arriba-a-la-derecha-desde-el-cuadrado.png"))); // NOI18N
        lbalergias.setText("Alergias");
        lbalergias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbalergias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbalergiasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbalergiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbalergiasMouseExited(evt);
            }
        });

        lbhabitual.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbhabitual.setForeground(new java.awt.Color(102, 102, 102));
        lbhabitual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-arriba-a-la-derecha-desde-el-cuadrado.png"))); // NOI18N
        lbhabitual.setText("Trat. Habitual");
        lbhabitual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbhabitual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbhabitualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbhabitualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbhabitualMouseExited(evt);
            }
        });

        lbquirurgicas.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbquirurgicas.setForeground(new java.awt.Color(102, 102, 102));
        lbquirurgicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-arriba-a-la-derecha-desde-el-cuadrado.png"))); // NOI18N
        lbquirurgicas.setText("Int. Quirurgicas");
        lbquirurgicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbquirurgicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbquirurgicasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbquirurgicasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbquirurgicasMouseExited(evt);
            }
        });

        lbcronicas.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lbcronicas.setForeground(new java.awt.Color(102, 102, 102));
        lbcronicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/flecha-arriba-a-la-derecha-desde-el-cuadrado.png"))); // NOI18N
        lbcronicas.setText("Enf. Cronicas");
        lbcronicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbcronicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbcronicasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbcronicasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbcronicasMouseExited(evt);
            }
        });

        bteditar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        bteditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lapiz (1).png"))); // NOI18N
        bteditar.setText("Editar");
        bteditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });

        btguardar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar.png"))); // NOI18N
        btguardar.setText("Guardar Cambios");
        btguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-eliminar.png"))); // NOI18N
        btcancelar.setText("Cancelar ");
        btcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        f_nacimiento.setEditable(false);
        f_nacimiento.setBackground(new java.awt.Color(255, 255, 255));
        f_nacimiento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(aseguradora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(departamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(n_poliza, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(f_nacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(celular, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(municipio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(grupoSanguineo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(apellidoS)
                            .addComponent(n_historia)
                            .addComponent(direccion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(documento)
                            .addComponent(nombre)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lbobservaciones)
                        .addGap(18, 18, 18)
                        .addComponent(lbalergias)
                        .addGap(18, 18, 18)
                        .addComponent(lbhabitual)
                        .addGap(18, 18, 18)
                        .addComponent(lbquirurgicas)
                        .addGap(18, 18, 18)
                        .addComponent(lbcronicas)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bteditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btcancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btguardar)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bteditar)
                    .addComponent(btguardar)
                    .addComponent(btcancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n_historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aseguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n_poliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbobservaciones)
                    .addComponent(lbalergias)
                    .addComponent(lbhabitual)
                    .addComponent(lbquirurgicas)
                    .addComponent(lbcronicas))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void lbobservacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbobservacionesMouseEntered
        // TODO add your handling code here:
        lbobservaciones.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_lbobservacionesMouseEntered

    private void lbobservacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbobservacionesMouseExited
        if (ob == false) {

            lbobservaciones.setForeground(new Color(102, 102, 102));
        }

    }//GEN-LAST:event_lbobservacionesMouseExited

    private void lbalergiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbalergiasMouseEntered
        // TODO add your handling code here:
        lbalergias.setForeground(new Color(0, 153, 153));

    }//GEN-LAST:event_lbalergiasMouseEntered

    private void lbhabitualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhabitualMouseEntered
        // TODO add your handling code here:
        lbhabitual.setForeground(new Color(0, 153, 153));

    }//GEN-LAST:event_lbhabitualMouseEntered

    private void lbquirurgicasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquirurgicasMouseEntered
        // TODO add your handling code here:
        lbquirurgicas.setForeground(new Color(0, 153, 153));

    }//GEN-LAST:event_lbquirurgicasMouseEntered

    private void lbcronicasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbcronicasMouseEntered
        // TODO add your handling code here:
        lbcronicas.setForeground(new Color(0, 153, 153));

    }//GEN-LAST:event_lbcronicasMouseEntered

    private void lbalergiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbalergiasMouseExited
        // TODO add your handling code here:
        if (al == false) {

            lbalergias.setForeground(new Color(102, 102, 102));
        }

    }//GEN-LAST:event_lbalergiasMouseExited

    private void lbhabitualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhabitualMouseExited
        // TODO add your handling code here:
        if (ha == false) {

            lbhabitual.setForeground(new Color(102, 102, 102));
        }

    }//GEN-LAST:event_lbhabitualMouseExited

    private void lbquirurgicasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquirurgicasMouseExited
        // TODO add your handling code here:
        if (qu == false) {

            lbquirurgicas.setForeground(new Color(102, 102, 102));
        }

    }//GEN-LAST:event_lbquirurgicasMouseExited

    private void lbcronicasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbcronicasMouseExited
        // TODO add your handling code here:
        if (cro == false) {

            lbcronicas.setForeground(new Color(102, 102, 102));
        }

    }//GEN-LAST:event_lbcronicasMouseExited

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        // TODO add your handling code here:
        editar(true);
        btguardar.setVisible(true);
        btcancelar.setVisible(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // TODO add your handling code here:

        editar(false);
        btcancelar.setVisible(false);
        btguardar.setVisible(false);

    }//GEN-LAST:event_btguardarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        // TODO add your handling code here:
        editar(false);
        btcancelar.setVisible(false);
        btguardar.setVisible(false);
    }//GEN-LAST:event_btcancelarActionPerformed

    private void lbobservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbobservacionesMouseClicked
        // TODO add your handling code here:
        seleccion("ob");
    }//GEN-LAST:event_lbobservacionesMouseClicked

    private void lbalergiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbalergiasMouseClicked
        // TODO add your handling code here:
        seleccion("al");
    }//GEN-LAST:event_lbalergiasMouseClicked

    private void lbhabitualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbhabitualMouseClicked
        // TODO add your handling code here:
        seleccion("ha");
    }//GEN-LAST:event_lbhabitualMouseClicked

    private void lbquirurgicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquirurgicasMouseClicked
        // TODO add your handling code here:
        seleccion("qu");
    }//GEN-LAST:event_lbquirurgicasMouseClicked

    private void lbcronicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbcronicasMouseClicked
        // TODO add your handling code here:
        seleccion("cro");
    }//GEN-LAST:event_lbcronicasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoP;
    private javax.swing.JTextField apellidoS;
    private javax.swing.JTextField aseguradora;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btguardar;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField departamento;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> estadoCivil;
    private javax.swing.JTextField f_nacimiento;
    private javax.swing.JTextField grupoSanguineo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbalergias;
    private javax.swing.JLabel lbcronicas;
    private javax.swing.JLabel lbhabitual;
    private javax.swing.JLabel lbobservaciones;
    private javax.swing.JLabel lbquirurgicas;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField n_historia;
    private javax.swing.JTextField n_poliza;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}

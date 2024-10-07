/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces.Paciente;

import Clases.citasAsignadas;
import com.toedter.calendar.JCalendar;
import java.awt.Color;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class Citas extends javax.swing.JPanel {

    /**
     * Creates new form Citas
     */
    public Citas() {
        initComponents();
        quitarBordes();
        alerta_cita.setVisible(false);
        documento.setFocusable(true);
        calendarioCitas();

    }

    public void quitarBordes() {

        n_cita.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nro Cita", 0, 0, null, new Color(102, 102, 102)));
        documento.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Documento", 0, 0, null, new Color(102, 102, 102)));
        paciente.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Nombre Completo", 0, 0, null, new Color(102, 102, 102)));
        genero.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Genero", 0, 0, null, new Color(102, 102, 102)));
        edad.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Edad", 0, 0, null, new Color(102, 102, 102)));
        celular.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Celular", 0, 0, null, new Color(102, 102, 102)));
        email.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Correo Electronico", 0, 0, null, new Color(102, 102, 102)));
        eps.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Eps", 0, 0, null, new Color(102, 102, 102)));
        afiliacion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Afiliacion", 0, 0, null, new Color(102, 102, 102)));

        especialidad.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Especialidad", 0, 0, null, new Color(102, 102, 102)));
        medico.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Medico", 0, 0, null, new Color(102, 102, 102)));
        fecha.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Fecha", 0, 0, null, new Color(102, 102, 102)));
        hora.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Hora Cita", 0, 0, null, new Color(102, 102, 102)));
        consultorio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Consultorio", 0, 0, null, new Color(102, 102, 102)));
        clinica.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Clinica", 0, 0, null, new Color(102, 102, 102)));
        motivo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Motivo Cita", 0, 0, null, new Color(102, 102, 102)));
        valor.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)), "Valor a Cancelar", 0, 0, null, new Color(102, 102, 102)));

    }

    public void calendarioCitas() {

        // Definir los días especiales para diferentes años y meses
        HashMap<Integer, HashMap<Integer, int[]>> fechas = new HashMap<>();

        int mes = 9;
        int año = 2024;
        int[] dias = {1, 4, 6, 20};

        HashMap<Integer, Integer> indice = new HashMap<>();

        indice.put(1, 0);
        indice.put(2, 1);
        indice.put(3, 2);
        indice.put(4, 3);
        indice.put(5, 4);
        indice.put(6, 5);
        indice.put(7, 6);
        indice.put(8, 7);
        indice.put(9, 8);
        indice.put(10, 9);
        indice.put(11, 10);
        indice.put(12, 11);

        int indiceMes = indice.get(mes);

        // Añadir días especiales para enero de 2024
        HashMap<Integer, int[]> f = new HashMap<>();
        // se agrega el mes y los dias
        f.put(indiceMes, dias);

        //se agrega el año junto con el mes y los dias
        fechas.put(año, f);

        // Crear un evaluador con los días especiales para múltiples meses
        citasAsignadas evaluator = new citasAsignadas(fechas);

        // Agregar el evaluador al calendario
        calendario.getDayChooser().addDateEvaluator(evaluator);

    }

    public void fechasDisponibles(String fecha ) {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        documento = new javax.swing.JTextField();
        paciente = new javax.swing.JTextField();
        n_cita = new javax.swing.JTextField();
        celular = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        especialidad = new javax.swing.JComboBox<>();
        medico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fecha = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        consultorio = new javax.swing.JTextField();
        clinica = new javax.swing.JComboBox<>();
        motivo = new javax.swing.JComboBox<>();
        eps = new javax.swing.JTextField();
        afiliacion = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        btAgendar = new javax.swing.JLabel();
        alerta_cita = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        documento.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        paciente.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        n_cita.setEditable(false);
        n_cita.setBackground(new java.awt.Color(255, 255, 255));
        n_cita.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        celular.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        email.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        genero.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        edad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        especialidad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        especialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        medico.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        medico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/md-del-usuario.png"))); // NOI18N

        calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        calendario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

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

        fecha.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        hora.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/busqueda.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        consultorio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        clinica.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        clinica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        motivo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        motivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        motivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        eps.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        afiliacion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        valor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        valor.setText("$ 0.0");

        btAgendar.setBackground(new java.awt.Color(0, 153, 153));
        btAgendar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calendario.png"))); // NOI18N
        btAgendar.setText("  Agendar");
        btAgendar.setToolTipText("Programar Cita");
        btAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAgendarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAgendarMouseExited(evt);
            }
        });

        alerta_cita.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        alerta_cita.setText("NO HAY CITA PROGRAMADA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email)
                            .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eps, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(afiliacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(240, 240, 240))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha)
                                            .addComponent(clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hora)
                                            .addComponent(consultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alerta_cita))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(n_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(eps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(afiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alerta_cita))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(consultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        // TODO add your handling code here:

        Date selectedDate = calendario.getDate();

        // Usa Calendar para extraer el día, mes y año
        Calendar cal = Calendar.getInstance(); // Aquí se obtiene la instancia de Calendar
        cal.setTime(selectedDate);

        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1; // Los meses en Calendar comienzan en 0, por lo que sumamos 1
        int año = cal.get(Calendar.YEAR);

        String fechaSeleccionada = dia + "-" + mes + "-" + año;

        fecha.setText(fechaSeleccionada);
        fechasDisponibles(fechaSeleccionada);

    }//GEN-LAST:event_calendarioPropertyChange

    private void btAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgendarMouseEntered
        // TODO add your handling code here:
        btAgendar.setOpaque(true);
    }//GEN-LAST:event_btAgendarMouseEntered

    private void btAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgendarMouseExited
        // TODO add your handling code here:
        btAgendar.setOpaque(false);
    }//GEN-LAST:event_btAgendarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField afiliacion;
    private javax.swing.JLabel alerta_cita;
    private javax.swing.JLabel btAgendar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JTextField celular;
    private javax.swing.JComboBox<String> clinica;
    private javax.swing.JTextField consultorio;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JTextField eps;
    private javax.swing.JComboBox<String> especialidad;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> medico;
    private javax.swing.JComboBox<String> motivo;
    private javax.swing.JTextField n_cita;
    private javax.swing.JTextField paciente;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    private JTable getCalendarTable(Calendar calendar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JTable getCalendarTable(JCalendar calendario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

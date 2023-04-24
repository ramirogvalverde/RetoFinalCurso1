/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RestoDiv;

import Alumno.*;
import Usuario.Usuario;
import Ajustes.*;
import Main.Main;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author damt111
 */
public class RestoDiv extends javax.swing.JPanel {

    MetodosJuegoRestoDiv juego = null;
    boolean controlPartida = false; // partida no iniciada , en true iniciada
    private String almacenOperaciones = "";

    /**
     * Creates new form NewJPanel
     */
    public RestoDiv() {
        initComponents();
        actualizarTablas();
    }

    public void actualizarTablas() {
        actualizarClasificacion();
        actualizarMejorePartidas();
        actualizarUltimasPartidas();
    }

    public void actualizarAlmacenOperaciones(boolean control) {
        if (controlPartida) {
            if (control) {
                almacenOperaciones = almacenOperaciones + "\nResto: " + juego.getDividendo() + " / " + juego.getDivisor() + " es: " + juego.getRespuesta() + " ★ ";
                jTextAreaAlmacenOperaconiones.setText(almacenOperaciones);
            } else {
                almacenOperaciones = almacenOperaciones + "\nResto: " + juego.getDividendo() + " / " + juego.getDivisor() + " es: " + juego.getRespuesta() + " ☓ tu respuesta " + TFrespuesta.getText();
                jTextAreaAlmacenOperaconiones.setText(almacenOperaciones);
            }
        } else {
            jTextAreaAlmacenOperaconiones.setText("");
        }

    }

    private void actualizarClasificacion() {
        DefaultTableModel modelC = (DefaultTableModel) jTclasificacion.getModel();
        modelC.setRowCount(0);
        Object[] row = new Object[4];
        ArrayList<objetosBBDDRestoDiv> lista = BBDDMetodosRestoDiv.selectClasificacion(Main.getCon());
        for (int i = 0; i < lista.size(); i++) {
            row[0] = lista.get(i).getAlias();
            row[1] = lista.get(i).getTiempoPartida();
            row[2] = lista.get(i).getAciertos();
            row[3] = lista.get(i).getFecha_hora();
            modelC.addRow(row);
        }
    }

    private void actualizarMejorePartidas() {

        DefaultTableModel modelB = (DefaultTableModel) jTmejoresPartidas.getModel();
        modelB.setRowCount(0);
        Object[] row = new Object[4];
        ArrayList<objetosBBDDRestoDiv> lista = BBDDMetodosRestoDiv.selectJugadorMejoresPartidas(Main.getCon());
        for (int i = 0; i < lista.size(); i++) {
            row[0] = lista.get(i).getAlias();
            row[1] = lista.get(i).getTiempoPartida();
            row[2] = lista.get(i).getAciertos();
            row[3] = lista.get(i).getFecha_hora();
            modelB.addRow(row);
        }

    }

    private void actualizarUltimasPartidas() {

        DefaultTableModel modelL = (DefaultTableModel) jTultimasPartidas.getModel();
        modelL.setRowCount(0);
        Object[] row = new Object[4];
        ArrayList<objetosBBDDRestoDiv> lista = BBDDMetodosRestoDiv.selectJugadorUltimasPartidas(Main.getCon());
        for (int i = 0; i < lista.size(); i++) {
            row[0] = lista.get(i).getAlias();
            row[1] = lista.get(i).getTiempoPartida();
            row[2] = lista.get(i).getAciertos();
            row[3] = lista.get(i).getFecha_hora();
            modelL.addRow(row);
        }

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
        Informacion = new javax.swing.JPanel();
        Estadisticas = new javax.swing.JPanel();
        jSPranking = new javax.swing.JScrollPane();
        jTclasificacion = new javax.swing.JTable();
        jSPbestPlays = new javax.swing.JScrollPane();
        jTmejoresPartidas = new javax.swing.JTable();
        jSPlastPlays = new javax.swing.JScrollPane();
        jTultimasPartidas = new javax.swing.JTable();
        jLlastPlays = new javax.swing.JLabel();
        javax.swing.JLabel jLbestPlays = new javax.swing.JLabel();
        jLranking = new javax.swing.JLabel();
        jLOperacion = new javax.swing.JLabel();
        jLResultado = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        buttonNewPlay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFrespuesta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollAlmacenOperaciones = new javax.swing.JScrollPane();
        jTextAreaAlmacenOperaconiones = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(1070, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Informacion.setBackground(new java.awt.Color(255, 255, 255));

        Estadisticas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EstadisticasLayout = new javax.swing.GroupLayout(Estadisticas);
        Estadisticas.setLayout(EstadisticasLayout);
        EstadisticasLayout.setHorizontalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        EstadisticasLayout.setVerticalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        jSPranking.setBorder(null);

        jTclasificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Tiempo (sec)", "Aciertos", "Fecha y Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTclasificacion.setEnabled(false);
        jTclasificacion.setRowSelectionAllowed(false);
        jTclasificacion.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTclasificacion.getTableHeader().setReorderingAllowed(false);
        jSPranking.setViewportView(jTclasificacion);
        if (jTclasificacion.getColumnModel().getColumnCount() > 0) {
            jTclasificacion.getColumnModel().getColumn(0).setResizable(false);
            jTclasificacion.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTclasificacion.getColumnModel().getColumn(2).setPreferredWidth(25);
            jTclasificacion.getColumnModel().getColumn(3).setResizable(false);
        }

        jSPbestPlays.setBorder(null);

        jTmejoresPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Tiempo (sec)", "Aciertos", "Fecha y Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTmejoresPartidas.setEnabled(false);
        jTmejoresPartidas.setRowSelectionAllowed(false);
        jTmejoresPartidas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTmejoresPartidas.getTableHeader().setReorderingAllowed(false);
        jSPbestPlays.setViewportView(jTmejoresPartidas);
        if (jTmejoresPartidas.getColumnModel().getColumnCount() > 0) {
            jTmejoresPartidas.getColumnModel().getColumn(0).setResizable(false);
            jTmejoresPartidas.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTmejoresPartidas.getColumnModel().getColumn(2).setPreferredWidth(25);
            jTmejoresPartidas.getColumnModel().getColumn(3).setResizable(false);
        }

        jSPlastPlays.setBorder(null);

        jTultimasPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Tiempo (sec)", "Aciertos", "Fecha y Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTultimasPartidas.setEnabled(false);
        jTultimasPartidas.setRowSelectionAllowed(false);
        jTultimasPartidas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTultimasPartidas.getTableHeader().setReorderingAllowed(false);
        jSPlastPlays.setViewportView(jTultimasPartidas);
        if (jTultimasPartidas.getColumnModel().getColumnCount() > 0) {
            jTultimasPartidas.getColumnModel().getColumn(0).setResizable(false);
            jTultimasPartidas.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTultimasPartidas.getColumnModel().getColumn(2).setPreferredWidth(25);
            jTultimasPartidas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLlastPlays.setFont(Estilos.getFuenteCuerpo());
        jLlastPlays.setForeground(Estilos.getColorFuenteCuerpo());
        jLlastPlays.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLlastPlays.setText("Tus ultimas 5 partidas");
        jLlastPlays.setToolTipText("");

        jLbestPlays.setFont(Estilos.getFuenteCuerpo());
        jLbestPlays.setForeground(Estilos.getColorFuenteCuerpo());
        jLbestPlays.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLbestPlays.setText("Tus mejores partidas");
        jLbestPlays.setToolTipText("");

        jLranking.setFont(Estilos.getFuenteCuerpo());
        jLranking.setForeground(Estilos.getColorFuenteCuerpo());
        jLranking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLranking.setText("Clasificacion");
        jLranking.setToolTipText("");

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPranking, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(Estadisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSPbestPlays, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jSPlastPlays, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jLlastPlays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbestPlays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLranking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPranking, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbestPlays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPbestPlays, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLlastPlays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPlastPlays, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(83, 83, 83))
        );

        jPanel1.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 490, 720));

        jLOperacion.setFont(Estilos.getFuenteCuerpo());
        jLOperacion.setForeground(Estilos.getColorFuenteCuerpo());
        jLOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLOperacion.setText("Operacion");
        jLOperacion.setToolTipText("");
        jPanel1.add(jLOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 490, 40));

        jLResultado.setFont(Estilos.getFuenteCuerpo());
        jLResultado.setForeground(Estilos.getColorFuenteCuerpo());
        jLResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 490, 40));

        jLTitulo.setFont(Estilos.getFuenteCuerpo());
        jLTitulo.setForeground(Estilos.getColorFuenteCuerpo());
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Calcula el resto de una división entera");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 30));

        buttonNewPlay.setBackground(Estilos.getColorPanel());
        buttonNewPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNewPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNewPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonNewPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonNewPlayMouseExited(evt);
            }
        });

        jLabel1.setFont(Estilos.getFuenteCuerpo());
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Partida");

        javax.swing.GroupLayout buttonNewPlayLayout = new javax.swing.GroupLayout(buttonNewPlay);
        buttonNewPlay.setLayout(buttonNewPlayLayout);
        buttonNewPlayLayout.setHorizontalGroup(
            buttonNewPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        buttonNewPlayLayout.setVerticalGroup(
            buttonNewPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNewPlayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(buttonNewPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 180, 50));

        TFrespuesta.setFont(Estilos.getFuenteCuerpo());
        TFrespuesta.setForeground(new java.awt.Color(204, 204, 204));
        TFrespuesta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TFrespuesta.setText("Inserta una respuesta");
        TFrespuesta.setBorder(null);
        TFrespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFrespuestaFocusGained(evt);
            }
        });
        TFrespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFrespuestaMousePressed(evt);
            }
        });
        TFrespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFrespuestaActionPerformed(evt);
            }
        });
        TFrespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFrespuestaKeyPressed(evt);
            }
        });
        jPanel1.add(TFrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 250, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 250, 10));

        jScrollAlmacenOperaciones.setBorder(null);

        jTextAreaAlmacenOperaconiones.setColumns(20);
        jTextAreaAlmacenOperaconiones.setFont(Estilos.getFuenteCuerpo());
        jTextAreaAlmacenOperaconiones.setForeground(Estilos.getColorFuenteCuerpo());
        jTextAreaAlmacenOperaconiones.setRows(5);
        jTextAreaAlmacenOperaconiones.setText("Instrucciones de partida");
        jTextAreaAlmacenOperaconiones.setToolTipText("");
        jTextAreaAlmacenOperaconiones.setBorder(null);
        jScrollAlmacenOperaciones.setViewportView(jTextAreaAlmacenOperaconiones);

        jPanel1.add(jScrollAlmacenOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 490, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewPlayMouseClicked
        //inserta codigo para iniciar la partida
        //Esto evita que una ves precionado el boton de inicio se pueda volver a iniciar una partida
        if (controlPartida == false) {
            actualizarAlmacenOperaciones(controlPartida);
            controlPartida = true;
            // inicia el juego
            juego = new MetodosJuegoRestoDiv();
            juego.crearPregunta();
            juego.iniciarJuego();
            //se coloca la pregunta en el panel
            jLOperacion.setText("El resto de la division de " + juego.getDividendo() + " entre " + juego.getDivisor() + " es:");
            jLResultado.setText("");
            TFrespuesta.setText("");
            //
            almacenOperaciones = "";
            //lleva el teclado al campo de la respuesta
            TFrespuesta.requestFocus();
        }

    }//GEN-LAST:event_buttonNewPlayMouseClicked

    private void buttonNewPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewPlayMouseEntered
        buttonNewPlay.setBackground(Estilos.getColorFuenteRegistroLogin());
    }//GEN-LAST:event_buttonNewPlayMouseEntered

    private void buttonNewPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewPlayMouseExited
        buttonNewPlay.setBackground(Estilos.getColorPanel());
    }//GEN-LAST:event_buttonNewPlayMouseExited

    private void TFrespuestaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFrespuestaMousePressed
        if (TFrespuesta.getText().equals("Inserta una respuesta")) {
            TFrespuesta.setText("");
            TFrespuesta.setForeground(Color.black);
        }
    }//GEN-LAST:event_TFrespuestaMousePressed

    private void TFrespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFrespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFrespuestaActionPerformed

    private void TFrespuestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFrespuestaKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER && controlPartida == true) {
            System.out.println("");
            if (juego.comprobarRespuesta(TFrespuesta.getText())) {
                jLResultado.setForeground(Color.GREEN);
                jLResultado.setText("¡Correcto!");
                actualizarAlmacenOperaciones(true);
            } else {
                jLResultado.setForeground(Color.RED);
                jLResultado.setText("Incorrecto, la respuesta es: " + juego.getRespuesta());
                actualizarAlmacenOperaciones(false);
            }

            TFrespuesta.setText("");
            TFrespuesta.requestFocus();

            if (juego.comprobarQuedanIntentos()) {
                juego.crearPregunta();
                jLOperacion.setText("El resto de la division de " + juego.getDividendo() + " entre " + juego.getDivisor() + " es:");
            } else {
                juego.terminarJuego();
                controlPartida = false;
                jLOperacion.setText("Aciertos: " + juego.getAciertos() + ", Tiempo: " + juego.getTiempoPartida() + " sec");
                BBDDMetodosRestoDiv.insertResultado(Main.getCon(), juego.getAciertos(), juego.getTiempoPartida());
                // actualiza la informacion de las tablas
                actualizarTablas();
            }
        }
    }//GEN-LAST:event_TFrespuestaKeyPressed

    private void TFrespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFrespuestaFocusGained
        // TODO add your handling code here:
        TFrespuesta.setText("");
        TFrespuesta.setForeground(Color.black);
    }//GEN-LAST:event_TFrespuestaFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Estadisticas;
    private javax.swing.JPanel Informacion;
    private javax.swing.JTextField TFrespuesta;
    private javax.swing.JPanel buttonNewPlay;
    private javax.swing.JLabel jLOperacion;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLlastPlays;
    private javax.swing.JLabel jLranking;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPbestPlays;
    private javax.swing.JScrollPane jSPlastPlays;
    private javax.swing.JScrollPane jSPranking;
    private javax.swing.JScrollPane jScrollAlmacenOperaciones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTclasificacion;
    private javax.swing.JTextArea jTextAreaAlmacenOperaconiones;
    private javax.swing.JTable jTmejoresPartidas;
    private javax.swing.JTable jTultimasPartidas;
    // End of variables declaration//GEN-END:variables
}

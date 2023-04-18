/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Alumno;

/**
 *
 * @author damt111
 */
public class PanelAlumno extends javax.swing.JPanel {

    /**
     * Creates new form PanelAlumno
     */
    public PanelAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAlumnos = new javax.swing.JPanel();
        Cálculo = new javax.swing.JPanel();
        LoginTXT4 = new javax.swing.JLabel();
        Euclides1 = new javax.swing.JPanel();
        Euclides = new javax.swing.JLabel();
        RestoDivision = new javax.swing.JPanel();
        LoginTXT = new javax.swing.JLabel();
        Calculadora = new javax.swing.JPanel();
        LoginTXT3 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(210, 330));
        setRequestFocusEnabled(false);

        PanelAlumnos.setBackground(new java.awt.Color(0, 155, 155));
        PanelAlumnos.setPreferredSize(new java.awt.Dimension(210, 330));

        Cálculo.setBackground(new java.awt.Color(0, 155, 155));
        Cálculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CálculoMouseClicked(evt);
            }
        });

        LoginTXT4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        LoginTXT4.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT4.setText("Cálculo");
        LoginTXT4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CálculoLayout = new javax.swing.GroupLayout(Cálculo);
        Cálculo.setLayout(CálculoLayout);
        CálculoLayout.setHorizontalGroup(
            CálculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CálculoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(LoginTXT4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CálculoLayout.setVerticalGroup(
            CálculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CálculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTXT4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        Euclides1.setBackground(new java.awt.Color(0, 155, 155));
        Euclides1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Euclides1MouseClicked(evt);
            }
        });

        Euclides.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Euclides.setForeground(new java.awt.Color(255, 255, 255));
        Euclides.setText("Euclides");
        Euclides.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Euclides1Layout = new javax.swing.GroupLayout(Euclides1);
        Euclides1.setLayout(Euclides1Layout);
        Euclides1Layout.setHorizontalGroup(
            Euclides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Euclides1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Euclides)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Euclides1Layout.setVerticalGroup(
            Euclides1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Euclides, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        RestoDivision.setBackground(new java.awt.Color(0, 155, 155));
        RestoDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestoDivisionMouseClicked(evt);
            }
        });

        LoginTXT.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        LoginTXT.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT.setText("Resto división");
        LoginTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout RestoDivisionLayout = new javax.swing.GroupLayout(RestoDivision);
        RestoDivision.setLayout(RestoDivisionLayout);
        RestoDivisionLayout.setHorizontalGroup(
            RestoDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestoDivisionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LoginTXT)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        RestoDivisionLayout.setVerticalGroup(
            RestoDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        Calculadora.setBackground(new java.awt.Color(0, 155, 155));
        Calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculadoraMouseClicked(evt);
            }
        });

        LoginTXT3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        LoginTXT3.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT3.setText("Calculadora ");
        LoginTXT3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginTXT3)
                .addGap(34, 34, 34))
        );
        CalculadoraLayout.setVerticalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTXT3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelAlumnosLayout = new javax.swing.GroupLayout(PanelAlumnos);
        PanelAlumnos.setLayout(PanelAlumnosLayout);
        PanelAlumnosLayout.setHorizontalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAlumnosLayout.createSequentialGroup()
                        .addGroup(PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cálculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Euclides1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7))
                    .addGroup(PanelAlumnosLayout.createSequentialGroup()
                        .addComponent(RestoDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(Calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAlumnosLayout.setVerticalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Cálculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RestoDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Euclides1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(PanelAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(98, 98, 98)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CálculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CálculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CálculoMouseClicked

    private void Euclides1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Euclides1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Euclides1MouseClicked

    private void RestoDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestoDivisionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RestoDivisionMouseClicked

    private void CalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculadoraMouseClicked

    }//GEN-LAST:event_CalculadoraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculadora;
    private javax.swing.JPanel Cálculo;
    private javax.swing.JLabel Euclides;
    private javax.swing.JPanel Euclides1;
    private javax.swing.JLabel LoginTXT;
    private javax.swing.JLabel LoginTXT3;
    private javax.swing.JLabel LoginTXT4;
    private javax.swing.JPanel PanelAlumnos;
    private javax.swing.JPanel RestoDivision;
    // End of variables declaration//GEN-END:variables
}

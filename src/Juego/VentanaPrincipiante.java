/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Juego;

/**
 *
 * @author Adriel
 */
public class VentanaPrincipiante extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaPrincipiante
     */
    public VentanaPrincipiante() {
    initComponents();
    inicializarArregloBotones();
        }
private javax.swing.JButton[] botones = new javax.swing.JButton[16];

private void inicializarArregloBotones() {
    botones[0]  = Boton1;
    botones[1]  = Boton2;
    botones[2]  = Boton3;
    botones[3]  = Boton4;
    botones[4]  = Boton5;
    botones[5]  = Boton6;
    botones[6]  = Boton7;
    botones[7]  = Boton8;
    botones[8]  = Boton9;
    botones[9]  = Boton10;
    botones[10] = Boton11;
    botones[11] = Boton12;
    botones[12] = Boton13;
    botones[13] = Boton14;
    botones[14] = Boton15;
    botones[15] = Boton16;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton9 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton14 = new javax.swing.JButton();
        Boton13 = new javax.swing.JButton();
        Boton15 = new javax.swing.JButton();
        Boton16 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton11 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton12 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        BotonReiniciar = new javax.swing.JButton();
        lblParejasEncontradas = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblCantidadIntentos = new javax.swing.JLabel();

        Boton9.addActionListener(this::Boton9ActionPerformed);

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img8/01.png"))); // NOI18N

        Boton10.addActionListener(this::Boton10ActionPerformed);

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img8/01.png"))); // NOI18N

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img8/02.png"))); // NOI18N
        Boton3.addActionListener(this::Boton3ActionPerformed);

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img8/02.png"))); // NOI18N
        Boton4.addActionListener(this::Boton4ActionPerformed);

        Boton12.addActionListener(this::Boton12ActionPerformed);

        lblPuntos.setText("jLabel1");

        BotonReiniciar.setText("jButton1");

        lblParejasEncontradas.setText("jLabel2");

        lblTiempo.setText("jLabel3");

        lblCantidadIntentos.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPuntos)
                        .addGap(125, 125, 125)
                        .addComponent(lblParejasEncontradas)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCantidadIntentos)
                                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTiempo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonReiniciar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonReiniciar)
                            .addComponent(lblTiempo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPuntos)
                                .addComponent(lblCantidadIntentos))
                            .addComponent(lblParejasEncontradas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton13;
    private javax.swing.JButton Boton14;
    private javax.swing.JButton Boton15;
    private javax.swing.JButton Boton16;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonReiniciar;
    private javax.swing.JLabel lblCantidadIntentos;
    private javax.swing.JLabel lblParejasEncontradas;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}


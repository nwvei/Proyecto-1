/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Juego;

import cartas.Carta;
import cartas.Nivel;
import javax.swing.JOptionPane;

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
    juego = new Juego(Nivel.PRINCIPIANTE);
    inicializarArregloBotones();
    actualizarTablero();
    actualizarlabels();

    timer = new javax.swing.Timer(1000, evt -> {
        actualizarlabels();
    });

    timer.start();
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

        Boton5.addActionListener(this::Boton5ActionPerformed);

        Boton1.addActionListener(this::Boton1ActionPerformed);

        Boton14.addActionListener(this::Boton14ActionPerformed);

        Boton13.addActionListener(this::Boton13ActionPerformed);

        Boton15.addActionListener(this::Boton15ActionPerformed);

        Boton16.addActionListener(this::Boton16ActionPerformed);

        Boton10.addActionListener(this::Boton10ActionPerformed);

        Boton6.addActionListener(this::Boton6ActionPerformed);

        Boton2.addActionListener(this::Boton2ActionPerformed);

        Boton3.addActionListener(this::Boton3ActionPerformed);

        Boton11.addActionListener(this::Boton11ActionPerformed);

        Boton7.addActionListener(this::Boton7ActionPerformed);

        Boton4.addActionListener(this::Boton4ActionPerformed);

        Boton8.addActionListener(this::Boton8ActionPerformed);

        Boton12.addActionListener(this::Boton12ActionPerformed);

        lblPuntos.setText("Puntos Obtenidos:");

        BotonReiniciar.setText("Reiniciar");
        BotonReiniciar.addActionListener(this::BotonReiniciarActionPerformed);

        lblParejasEncontradas.setText("Parejas Encontradas:");

        lblTiempo.setText("Tiempo:");

        lblCantidadIntentos.setText("Cantidad de intentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPuntos)
                        .addGap(125, 125, 125)
                        .addComponent(lblParejasEncontradas)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblCantidadIntentos)
                        .addGap(95, 95, 95)
                        .addComponent(lblTiempo)
                        .addGap(18, 18, 18)
                        .addComponent(BotonReiniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTiempo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPuntos)
                                .addComponent(lblCantidadIntentos))
                            .addComponent(lblParejasEncontradas, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonReiniciar)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
     manejarClicBoton(8);
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        manejarClicBoton(3);
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
    manejarClicBoton(9);
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
       manejarClicBoton(2);
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
    manejarClicBoton(11);
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
    manejarClicBoton(0);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void BotonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReiniciarActionPerformed
       juego.reiniciarPartida();
            actualizarTablero();
            actualizarlabels();
    }//GEN-LAST:event_BotonReiniciarActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
         manejarClicBoton(1);
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
      manejarClicBoton(4);
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
      manejarClicBoton(5);
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
    manejarClicBoton(6);
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
     manejarClicBoton(7);
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
   manejarClicBoton(10);
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
     manejarClicBoton(12);
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
    manejarClicBoton(13);
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
    manejarClicBoton(14);
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
    manejarClicBoton(15);
    }//GEN-LAST:event_Boton16ActionPerformed


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

    private static final int COLUMNAS = 4; 

    private Juego juego;
    private javax.swing.JButton[] botones = new javax.swing.JButton[16];
    private javax.swing.Timer timer;

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
    private void manejarClicBoton(int indice) {
       int fila = indice / juego.getNivel().getColumnas();
        int columna = indice % juego.getNivel().getColumnas();

        String resultado = juego.seleccionarCarta(fila, columna);
        actualizarTablero();
        actualizarlabels();

        if (resultado.equals("PAREJA  ENCONTRADA")) {
            if (juego.esVictoria()) {
                JOptionPane.showMessageDialog(this, "¡Felicidades, completaste el tablero!");
            }
        } else if (resultado.equals("NO ES  PAREJA")) {
            javax.swing.Timer temporizador = new javax.swing.Timer(2000, evt -> {
                juego.ocultarCartasNoEmparejadas();
                actualizarTablero();
            });
            temporizador.setRepeats(false);
            temporizador.start();
        }
    }

 private void actualizarTablero() {
        for (int i = 0; i < botones.length; i++) {
            int fila = i / COLUMNAS;
            int columna = i % COLUMNAS;
            Carta carta = juego.getTablero().obtenerCarta(fila, columna);
            javax.swing.JButton boton = botones[i];

            boolean debeMostrarse = carta.isVisible() || carta.isEncontrada();
            boolean estaMostrado = boton.getIcon() != null;

            if (debeMostrarse && !estaMostrado) {
                boton.setIcon(juego.getTablero().obtenerImagen(carta));
            } else if (!debeMostrarse && estaMostrado) {
                boton.setIcon(null);
            }
            boton.setEnabled(!carta.isEncontrada());
        }
    }

    private void actualizarlabels() {
        lblPuntos.setText("Puntos: " + juego.getPuntaje());
        lblCantidadIntentos.setText("Intentos: " + juego.getCantidadIntentos());
        lblParejasEncontradas.setText("Parejas: " + juego.getParejasEncontradas() + "/" + juego.getTotalParejas());
        lblTiempo.setText(juego.getTiempoTranscurrido());
    }
}

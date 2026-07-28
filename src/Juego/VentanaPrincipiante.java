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
    actualizarEtiquetas();
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

        Boton1.addActionListener(this::Boton1ActionPerformed);

        Boton10.addActionListener(this::Boton10ActionPerformed);

        Boton3.addActionListener(this::Boton3ActionPerformed);

        Boton4.addActionListener(this::Boton4ActionPerformed);

        Boton12.addActionListener(this::Boton12ActionPerformed);

        lblPuntos.setText("Puntos Obtenidos:");

        BotonReiniciar.setText("Reiniciar");

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

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton1ActionPerformed


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
 private static final String CARPETA_IMAGENES = "img8";
    private static final int COLUMNAS = 4; 

    private Juego juego;
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

        for (int i = 0; i < botones.length; i++) {
            final int indice = i;
            botones[i].setText("");
            botones[i].addActionListener(evt -> manejarClicBoton(indice));
        }

        BotonReiniciar.addActionListener(evt -> {
            juego.reiniciarPartida();
            actualizarTablero();
            actualizarEtiquetas();
        });
    }

    private void manejarClicBoton(int indice) {
        int fila = indice / COLUMNAS;
        int columna = indice % COLUMNAS;

        String resultado = juego.seleccionarCarta(fila, columna);
        actualizarTablero();
        actualizarEtiquetas();

        if (resultado.equals("PAREJA  ENCONTRADA")) {
            if (juego.esVictoria()) {
                JOptionPane.showMessageDialog(this, "¡Felicidades, completaste el tablero!");
            }
        } else if (resultado.equals("NO ES  PAREJA")) {
            javax.swing.Timer temporizador = new javax.swing.Timer(800, evt -> {
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
                GestorImagenes.voltear(boton, GestorImagenes.obtenerIcono(CARPETA_IMAGENES, carta));
            } else if (!debeMostrarse && estaMostrado) {
                GestorImagenes.voltear(boton, null);
            }
            boton.setEnabled(!carta.isEncontrada());
        }
    }

    private void actualizarEtiquetas() {
        lblPuntos.setText("Puntos: " + juego.getPuntaje());
        lblCantidadIntentos.setText("Intentos: " + juego.getCantidadIntentos());
        lblParejasEncontradas.setText("Parejas: " + juego.getParejasEncontradas() + "/" + juego.getTotalParejas());
        lblTiempo.setText(juego.getTiempoTranscurrido());
    }
}

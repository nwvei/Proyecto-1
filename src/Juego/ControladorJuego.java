/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* * @author Adriel*/
package Juego;
import Tablero.Tablero;
import cartas.Carta;
import cartas.Nivel;
import cronometros.Cronometro;
import jugadores.Jugador;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ControladorJuego {
    private Tablero tablero;
    private Jugador jugador;
    private Cronometro cronometro;
    private Nivel nivel;
    private VentanaAvanzado frm;

    private int filaSel1, colSel1, filaSel2, colSel2;
    private boolean esperandoComparacion;

    public ControladorJuego(VentanaAvanzado frm, Nivel nivel) {
        this.frm = frm;
        this.nivel = nivel;
        this.tablero = new Tablero(nivel);
        this.jugador = new Jugador();
        this.cronometro = new Cronometro();
        limpiarSeleccion();
        cronometro.iniciar();
    }

    public void seleccionarCarta(int fila, int columna) {
        if (esperandoComparacion) return;

        Carta carta = tablero.obtenerCarta(fila, columna);
        if (carta.isEncontrada()) return;

        if (filaSel1 == -1) {
            filaSel1 = fila;
            colSel1 = columna;
            carta.mostrar();
            frm.mostrarCarta(fila, columna);
            return;
        }

        if (fila == filaSel1 && columna == colSel1) return;

        filaSel2 = fila;
        colSel2 = columna;
        carta.mostrar();
        frm.mostrarCarta(fila, columna);
        esperandoComparacion = true;

        jugador.registrarIntento();

        if (compararSeleccionActual()) {
            marcarParejaEncontrada();
        } else {
            jugador.registrarFallo();
            frm.bloquearTablero(true);
            Timer timer = new Timer(2000, e -> {
                ocultarNoEmparejadas();
                frm.bloquearTablero(false);
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    private boolean compararSeleccionActual() {
        Carta c1 = tablero.obtenerCarta(filaSel1, colSel1);
        Carta c2 = tablero.obtenerCarta(filaSel2, colSel2);
        return tablero.compararCartas(c1, c2);
    }

    private void marcarParejaEncontrada() {
        Carta c1 = tablero.obtenerCarta(filaSel1, colSel1);
        Carta c2 = tablero.obtenerCarta(filaSel2, colSel2);
        c1.marcarEncontrada();
        c2.marcarEncontrada();

        jugador.registrarParejaEncontrada();
        limpiarSeleccion();

        if (tablero.verificarFinDelJuego()) {
            cronometro.detener();
            frm.mostrarVictoria(jugador.getPuntoObtenidos());
        }
    }

    private void ocultarNoEmparejadas() {
        if (filaSel1 != -1 && filaSel2 != -1) {
            tablero.obtenerCarta(filaSel1, colSel1).ocultar();
            tablero.obtenerCarta(filaSel2, colSel2).ocultar();
            frm.ocultarCarta(filaSel1, colSel1);
            frm.ocultarCarta(filaSel2, colSel2);
        }
        limpiarSeleccion();
    }

    private void limpiarSeleccion() {
        filaSel1 = -1;
        colSel1 = -1;
        filaSel2 = -1;
        colSel2 = -1;
        esperandoComparacion = false;
    }

    public int getColumnas() {
        return nivel.getColumnas();
    }

    public int getSimbolo(int fila, int columna) {
        return tablero.obtenerCarta(fila, columna).getSimbolo();
    }
}
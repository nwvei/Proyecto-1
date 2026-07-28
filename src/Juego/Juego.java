/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Tablero.Tablero;
import cartas.Carta;
import cartas.Nivel;
import cronometros.Cronometro;
import jugadores.Jugador;

/**
 * Controlador genérico del juego de memoria.
 * Es el mismo para los 3 niveles (Principiante, Intermedio, Avanzado):
 * solo cambia el Nivel que se le pasa en el constructor.
 *
 * @author Adriel
 */
public class Juego {

    private Tablero tablero;
    private Jugador jugador;
    private Cronometro cronometro;
    private Nivel nivel;

    private int filaSel1;
    private int colSel1;
    private int filaSel2;
    private int colSel2;

    private boolean esperandoComparacion;

    public Juego(Nivel nivelInicial) {
        iniciarNuevaPartida(nivelInicial);
    }

    public void iniciarNuevaPartida(Nivel nuevoNivel) {
        this.nivel = nuevoNivel;
        this.tablero = new Tablero(nivel);
        this.jugador = new Jugador();
        this.cronometro = new Cronometro();
        limpiarSeleccion();
        cronometro.iniciar();
    }

    public void cambiarNivel(Nivel nuevoNivel) {
        iniciarNuevaPartida(nuevoNivel);
    }

    public void reiniciarPartida() {
        tablero.reiniciarTablero();
        jugador.reiniciar();
        cronometro.reiniciar();
        limpiarSeleccion();
        cronometro.iniciar();
    }

    public String seleccionarCarta(int fila, int columna) {
        if (esperandoComparacion) {
            return "ESPERANDO";
        }

        Carta carta = tablero.obtenerCarta(fila, columna);

        if (carta.isEncontrada()) {
            return "YA ENCONTRADA";
        }

        if (filaSel1 == -1) {
            filaSel1 = fila;
            colSel1 = columna;
            carta.mostrar();
            return "PRIMERA CARTA";
        }

        if (fila == filaSel1 && columna == colSel1) {
            return "MISMA CARTA";
        }

        filaSel2 = fila;
        colSel2 = columna;
        carta.mostrar();
        esperandoComparacion = true;

        jugador.registrarIntento();

        if (compararSeleccionActual()) {
            marcarParejaEncontrada();
            return "PAREJA  ENCONTRADA";
        } else {
            jugador.registrarFallo();
            return "NO ES  PAREJA";
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

        if (esVictoria()) {
            cronometro.detener();
        }
    }

    public void ocultarCartasNoEmparejadas() {
        if (filaSel1 != -1 && filaSel2 != -1) {
            Carta c1 = tablero.obtenerCarta(filaSel1, colSel1);
            Carta c2 = tablero.obtenerCarta(filaSel2, colSel2);
            c1.ocultar();
            c2.ocultar();
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

    public boolean esVictoria() {
        return tablero.verificarFinDelJuego();
    }

    public int getPuntaje() {
        return jugador.getPuntoObtenidos();
    }

    public int getCantidadIntentos() {
        return jugador.getCantidadIntentos();
    }

    public int getParejasEncontradas() {
        return jugador.getParejasEncontradas();
    }

    public int getTotalParejas() {
        return nivel.getCantidadParejas();
    }

    public String getTiempoTranscurrido() {
        return cronometro.getTiempoTranscurrido();
    }

    public Nivel getNivel() {
        return nivel;
    }

    public boolean estaEsperandoComparacion() {
        return esperandoComparacion;
    }

    public Tablero getTablero() {
        return tablero;
    }
}

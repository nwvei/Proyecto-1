/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablero;
import cartas.Carta;
import cartas.Nivel;
import javax.swing.ImageIcon;

/**
 *
 * @author Aaron
 */
public class Tablero {

    private Carta[][] cartas;
    private int filas;
    private int columnas;
    private Nivel nivelActual;

    public Tablero(Nivel nivel) {
        IniciarTablero(nivel);
    }

    public void IniciarTablero(Nivel nivel) {
        this.nivelActual = nivel;
        this.filas = nivel.getFilas();
        this.columnas = nivel.getColumnas();
        this.cartas = new Carta[filas][columnas];
        DParejas(nivel.getCantidadParejas());
    }

    private void DParejas(int cantidadParejas) {
        int totalCartas = cantidadParejas * 2;
        int[] ids = new int[totalCartas];
        int contador = 0;

        for (int i = 1; i <= cantidadParejas; i++) {
            ids[contador] = i;
            contador++;
            ids[contador] = i;
            contador++;
        }

        for (int i = totalCartas - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temporal = ids[i];
            ids[i] = ids[j];
            ids[j] = temporal;
        }

        int tempo = 0;
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                cartas[fila][columna] = new Carta(ids[tempo]);
                tempo++;
            }
        }
    }
public String obtenerRutaImagen(Carta carta) {
    String carpeta = "img" + nivelActual.getCantidadParejas();
    String numero = "" + carta.getSimbolo();
    if (carta.getSimbolo() < 10) {
        numero = "0" + numero;
    }
    return "/imagenes/" + carpeta + "/" + numero + ".png";
}
    public Carta obtenerCarta(int fila, int columna) {
        return cartas[fila][columna];
    }
    public javax.swing.ImageIcon obtenerImagen(Carta carta) {
    String ruta = obtenerRutaImagen(carta);
    java.net.URL url = getClass().getResource(ruta);
    return new javax.swing.ImageIcon(url);
}

public boolean compararCartas(Carta carta1, Carta carta2) {
        return carta1.getSimbolo() == carta2.getSimbolo();
    }

    public boolean verificarFinDelJuego() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (!cartas[fila][columna].isEncontrada()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reiniciarTablero() {
        IniciarTablero(this.nivelActual);
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
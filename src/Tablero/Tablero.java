/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablero;
import cartas.Carta;
import cartas.Nivel;

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
        inicializarTablero(nivel);
    }
 
    public void inicializarTablero(Nivel nivel) {
        this.nivelActual = nivel;
 
        // Ahora se obtienen directamente del nivel (ej. Principiante: 4x4, Intermedio: 4x8, Avanzado: 8x8)
        this.filas = nivel.getFilas();
        this.columnas = nivel.getColumnas();
 
        this.cartas = new Carta[filas][columnas];
        distribuirParejas(nivel.getCantidadParejas());
    }
 
    private static final String[] ImagenesR = {
        "/imagenes/carta1.png", "/imagenes/carta2.png", "/imagenes/carta3.png", "/imagenes/carta4.png",
        "/imagenes/carta5.png", "/imagenes/carta6.png", "/imagenes/carta7.png", "/imagenes/carta8.png",
        "/imagenes/carta9.png", "/imagenes/carta10.png", "/imagenes/carta11.png", "/imagenes/carta12.png",
        "/imagenes/carta13.png", "/imagenes/carta14.png", "/imagenes/carta15.png", "/imagenes/carta16.png",
        "/imagenes/carta17.png", "/imagenes/carta18.png", "/imagenes/carta19.png", "/imagenes/carta20.png",
        "/imagenes/carta21.png", "/imagenes/carta22.png", "/imagenes/carta23.png", "/imagenes/carta24.png",
        "/imagenes/carta25.png", "/imagenes/carta26.png", "/imagenes/carta27.png", "/imagenes/carta28.png",
        "/imagenes/carta29.png", "/imagenes/carta30.png", "/imagenes/carta31.png", "/imagenes/carta32.png",
        "/imagenes/carta33.png", "/imagenes/carta34.png", "/imagenes/carta35.png", "/imagenes/carta36.png",
        "/imagenes/carta37.png", "/imagenes/carta38.png", "/imagenes/carta39.png", "/imagenes/carta40.png",
        "/imagenes/carta41.png", "/imagenes/carta42.png", "/imagenes/carta43.png", "/imagenes/carta44.png",
        "/imagenes/carta45.png", "/imagenes/carta46.png", "/imagenes/carta47.png", "/imagenes/carta48.png",
        "/imagenes/carta49.png", "/imagenes/carta50.png", "/imagenes/carta51.png", "/imagenes/carta52.png",
        "/imagenes/carta53.png", "/imagenes/carta54.png", "/imagenes/carta55.png", "/imagenes/carta56.png",
        "/imagenes/carta57.png", "/imagenes/carta58.png", "/imagenes/carta59.png", "/imagenes/carta60.png",
        "/imagenes/carta61.png", "/imagenes/carta62.png", "/imagenes/carta63.png", "/imagenes/carta64.png"
    };
 
    private void distribuirParejas(int cantidadParejas) {
        int totalCartas = cantidadParejas * 2;
        String[] imagenes = new String[totalCartas];
 
        int contador = 0;
        for (int i = 0; i < cantidadParejas; i++) {
            String imagen = ImagenesR[i];
            imagenes[contador] = imagen;
            contador++;
            imagenes[contador] = imagen;
            contador++;
        }
 
        for (int i = totalCartas - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temporal = imagenes[i];
            imagenes[i] = imagenes[j];
            imagenes[j] = temporal;
        }
 
        int indice = 0;
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                cartas[fila][columna] = new Carta(imagenes[indice % imagenes.length]);
                indice++;
            }
        }
    }
 
    public Carta obtenerCarta(int fila, int columna) {
        return cartas[fila][columna];
    }

    public boolean compararCartas(Carta carta1, Carta carta2) {
        return carta1.getSimbolo().equals(carta2.getSimbolo());
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
        inicializarTablero(this.nivelActual);
    }
 
    public int getFilas() {
        return filas;
    }
 
    public int getColumnas() {
        return columnas;
    }
}
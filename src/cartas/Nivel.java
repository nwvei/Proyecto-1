/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package cartas;

/**
 *
 * @author HP
 */
public enum Nivel {
    PRINCIPIANTE(16, 8, 8),
    INTERMEDIO(32, 16, 16),
    AVANZADO(64, 32, 32);  

    private final int cantidadParejas;
    private final int filas;
    private final int columnas;

    Nivel(int cantidadParejas, int filas, int columnas) {
        this.cantidadParejas = cantidadParejas;
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getCantidadParejas() {
        return cantidadParejas;
    }

    public int getCantidadCartas() {
        return cantidadParejas * 2;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}

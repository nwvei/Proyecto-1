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
    PRINCIPIANTE(8, 4, 4),
    INTERMEDIO(16, 4, 8),
    AVANZADO(32, 8, 8);  

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

    @Override
    public String toString() {
        switch (this) {
            case PRINCIPIANTE:
                return "Principiante (8 parejas)";
            case INTERMEDIO:
                return "Intermedio (16 parejas)";
            case AVANZADO:
                return "Avanzado (32 parejas)";
            default:
                return name();
        }
    }
}

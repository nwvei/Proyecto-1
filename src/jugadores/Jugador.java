/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;

/**
 *
 * @author UTN
 */
public class Jugador {
    private int puntoObtenidos;
    private int cantidadIntentos;
    private int parejasEncontradas;

    public int getPuntoObtenidos() {
        return puntoObtenidos;
    }

    public void setPuntoObtenidos(int puntoObtenidos) {
        this.puntoObtenidos = puntoObtenidos;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public int getParejasEncontradas() {
        return parejasEncontradas;
    }

    public void setParejasEncontradas(int parejasEncontradas) {
        this.parejasEncontradas = parejasEncontradas;
    }

    public Jugador() {
        this.puntoObtenidos = 0;
        this.cantidadIntentos = 0;
        this.parejasEncontradas = 0;
    }
    
    public void registrarIntento() {
        this.cantidadIntentos++;
    }
    
    public void registrarParejaEncontrada() {
        this.parejasEncontradas++;
        this.puntoObtenidos += 100;
    }
    
    public void registrarFallo() {
        this.puntoObtenidos -= 20;
    }
    
    public void reiniciar() {
        this.puntoObtenidos = 0;
        this.cantidadIntentos = 0;
        this.parejasEncontradas = 0;
    }
    
    public boolean completoJuego(int totalParejasNivel) {
        return this.parejasEncontradas >= totalParejasNivel;
    }
    
    
    
    
    
}

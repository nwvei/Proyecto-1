/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartas;

/**
 *
 * @author HP
 */
public class Carta {
   private String simbolo;      
    private boolean visible;     
    private boolean encontrada;  

    public Carta(String simbolo) {
        this.simbolo = simbolo;
        this.visible = false;
        this.encontrada = false;
    }

    public void mostrar() {
        this.visible = true;
    }

    public void ocultar() {
        this.visible = false;
    }

    public void marcarEncontrada() {
        this.encontrada = true;
        this.visible = true; 
        
    }

    public String getSimbolo() {
        return simbolo;
    }

    public boolean isVisible() {
        return visible;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    @Override
    public String toString() {
        if (encontrada) {
            return "[" + simbolo + " - encontrada]";
        }
        return visible ? "[" + simbolo + "]" : "[?]";
    }  
}

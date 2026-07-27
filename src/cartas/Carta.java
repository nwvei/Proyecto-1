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
   private int ids;      
    private boolean visible;     
    private boolean encontrada;  

    public Carta(int simbolo) {
        this.ids = simbolo;
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

    public int getSimbolo() {
        return ids;
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
            return "[" + ids + " - encontrada]";
        }
        return visible ? "[" + ids + "]" : "[?]";
    }  
}

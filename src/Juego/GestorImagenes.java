/*
 * Utilidad compartida por VentanaPrincipiante, VentanaIntermedio y VentanaAvanzado.
 */
package Juego;

import cartas.Carta;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author Adriel
 */
public class GestorImagenes {

    public static String rutaImagen(String carpeta, Carta carta) {
        return String.format("/imagenes/%s/%02d.png", carpeta, carta.getSimbolo());
    }

    public static ImageIcon obtenerIcono(String carpeta, Carta carta) {
        return new ImageIcon(GestorImagenes.class.getResource(rutaImagen(carpeta, carta)));
    }

    public static void voltear(JButton boton, ImageIcon iconoNuevo) {
        ImageIcon iconoAnterior = (boton.getIcon() instanceof ImageIcon) ? (ImageIcon) boton.getIcon() : null;
        int ancho = boton.getWidth() > 20 ? boton.getWidth() - 10 : 90;
        int alto = boton.getHeight() > 20 ? boton.getHeight() - 10 : 90;

        final int pasos = 10;
        final int[] paso = {0};
        final Timer[] temporizador = new Timer[1];

        temporizador[0] = new Timer(15, evt -> {
            paso[0]++;
            boolean segundaMitad = paso[0] > pasos / 2;
            ImageIcon base = segundaMitad ? iconoNuevo : iconoAnterior;

            double progreso = segundaMitad
                    ? (paso[0] - pasos / 2.0) / (pasos / 2.0)
                    : 1 - (paso[0] / (pasos / 2.0));
            int anchoActual = Math.max(3, (int) (ancho * progreso));

            if (base != null) {
                Image escalada = base.getImage().getScaledInstance(anchoActual, alto, Image.SCALE_FAST);
                boton.setIcon(new ImageIcon(escalada));
            } else {
                boton.setIcon(null);
            }

            if (paso[0] >= pasos) {
                boton.setIcon(iconoNuevo);
                temporizador[0].stop();
            }
        });
        temporizador[0].start();
    }
}

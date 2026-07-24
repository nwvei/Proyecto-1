/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometros;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author UTN
 */
public class Cronometro {
    private Timer timer;
    private int contador;

    public Cronometro() {
        contador = 0;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
            }
        });
    }

    public void iniciar() {
        timer.start();
    }

    public void detener() {
        timer.stop();
    }

    public void reiniciar() {
        timer.stop();
        contador = 0;
    }

    public String obtenerTiempoTranscurrido() {
        int minutos = contador / 60;
        int segundos = contador % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
}

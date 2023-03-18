package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String idioma = JOptionPane.showInputDialog("Seleccione un idioma: ");
        System.out.println("1.-Español");
        System.out.println("2.- Inglés");

        Traduccion traduccion;
        if (idioma.equals("1")) {
            traduccion = new TraduccionEspañol();
        } else {
            traduccion = new TraduccionIngles();
        }

        traduccion.introducirDistancia();
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la distancia recorrida en km: "));
        traduccion.introducirTiempo();
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tiempo de viaje en h: "));
        double velocidad = (distancia / tiempo) * 60;

        traduccion.inicioRespuesta();
        traduccion.finalRespuesta(velocidad);

    }
}

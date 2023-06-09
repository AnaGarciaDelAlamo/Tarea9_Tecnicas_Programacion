package Ejercicio2;

import javax.swing.*;

public class TraduccionIngles implements Traduccion{
    @Override
    public void introducirDistancia() {
        JOptionPane.showInputDialog("Enter the distance traveled:");
    }

    @Override
    public void introducirTiempo() {
        JOptionPane.showInputDialog("Enter the time of travel:");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("You have traveled at a speed of: ");
    }

    @Override
    public void finalRespuesta(double velocidad) {
        System.out.println(velocidad + "Km/h");
    }
}

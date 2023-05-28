package org.example;

import org.example.controlador.ControladorEjemplo;
import org.example.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana ventana = new Ventana("Olakase");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);
    }
}
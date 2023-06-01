package org.example;

import org.example.controlador.ControladorGrupo;
import org.example.vista.VentanaGrupo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaGrupo view = new VentanaGrupo("Proyecto");
        ControladorGrupo controller = new ControladorGrupo(view);
    }
}
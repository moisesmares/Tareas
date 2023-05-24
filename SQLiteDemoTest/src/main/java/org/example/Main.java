package org.example;

import org.example.controlador.ControladorLibro;
import org.example.modelo.Libro;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("Prueba todo");
        ControladorLibro controladorLibro = new ControladorLibro(view);
    }

}
package org.example.controlador;

import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view,
                    "Hola desde el ejemplo",
                    "Titulo personalizado",
                    JOptionPane.WARNING_MESSAGE,
                    icono
            );
        }

        if (e.getSource() == view.getBtnEntrada()){
         String datos = JOptionPane.showInputDialog(view,
                "Ejemplo de entrada",
                 "Titulo personalizado",
                 JOptionPane.QUESTION_MESSAGE);
         this.view.getLblResultado().setText(datos);
        }

        if(e.getSource() == view.getBtnOpcion()){
            System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(view,"Estás seguro de borrar?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);


            if (respuesta == JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste opción Si");
            }else{
                view.getLblResultado().setText("Elegiste no");
            }
        }

    }
}
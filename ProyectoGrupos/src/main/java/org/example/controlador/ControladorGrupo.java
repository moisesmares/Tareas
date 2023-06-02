package org.example.controlador;

import org.example.modelo.Grupo;
import org.example.modelo.ModeloTablaGrupo;
import org.example.vista.VentanaGrupo;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorGrupo extends MouseAdapter {
    private VentanaGrupo view;
    private ModeloTablaGrupo modelo;

    public ControladorGrupo(VentanaGrupo view) {
        this.view = view;
        modelo = new ModeloTablaGrupo();
        this.view.getTabla().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {

            modelo.cargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Se presionó el botón Agregar");
            Grupo grupo = new Grupo();
            grupo.setId(0);
            grupo.setNombre(this.view.getTxtNombre().getText());
            grupo.setEmpresa(this.view.getTxtEmpresa().getText());
            grupo.setNumeroIntegrantes(Integer.parseInt(this.view.getTxtNumeroIntegrantes().getText()));
            grupo.setTiempoActividad(Integer.parseInt(this.view.getTxtTiempoActividad().getText()));
            grupo.setCancion(this.view.getTxtCancion().getText());
            grupo.setUrllFoto(this.view.getTxtUrl_Foto().getText());
            if (modelo.agregarGrupo(grupo)) {
                JOptionPane.showMessageDialog(view, "Se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }
        if (e.getSource() == this.view.getTabla()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTabla().getSelectedRow();
            Grupo tmp = modelo.getGrupoAtIndex(index);
            try {
                this.view.getLblImagenGrupo().setIcon(tmp.getImagen());
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }
            this.view.getTxtNombre().setText(tmp.getNombre());
            this.view.getTxtEmpresa().setText(tmp.getEmpresa());
            this.view.getTxtNumeroIntegrantes().setText(String.valueOf(tmp.getNumeroIntegrantes()));
            this.view.getTxtTiempoActividad().setText(String.valueOf(tmp.getTiempoActividad()));
            this.view.getTxtCancion().setText(tmp.getCancion());
            this.view.getTxtUrl_Foto().setText(tmp.getUrllFoto());
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.view.getTabla().getSelectedRow();
            Grupo tmp = modelo.getGrupoAtIndex(rowIndex);
            Grupo grupo = new Grupo();

                grupo.setNombre(this.view.getTxtNombre1().getText());
                grupo.setEmpresa(this.view.getTxtEmpresa1().getText());
                grupo.setNumeroIntegrantes(Integer.parseInt(this.view.getTxtNumeroIntegrantes1().getText()));
                grupo.setTiempoActividad(Integer.parseInt(this.view.getTxtTiempoActividad1().getText()));
                grupo.setCancion(this.view.getTxtCancion1().getText());
                grupo.setUrllFoto(this.view.getTxtUrl_Foto1().getText());
                grupo.setId(tmp.getId());
                if (modelo.modificarGrupo(grupo)) {
                    JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    modelo.cargarDatos();
                    this.view.getTabla().setModel(modelo);
                    this.view.getTabla().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);

                }
                this.view.getTabla().updateUI();
            

        }
    }
}
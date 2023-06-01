package org.example.controlador;

import org.example.modelo.Grupo;
import org.example.modelo.ModeloTablaGrupo;
import org.example.vista.VentanaGrupo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

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
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){

            modelo.cargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("Se presionó el botón Agregar");
            Grupo grupo = new Grupo();
            grupo.setId(0);
            grupo.setNombre(this.view.getTxtNombre().getText());
            grupo.setEmpresa(this.view.getTxtEmpresa().getText());
            grupo.setNumeroIntegrantes(Integer.parseInt(this.view.getTxtNumeroIntegrantes().getText()));
            grupo.setTiempoActividad(Integer.parseInt(this.view.getTxtTiempoActividad().getText()));
            grupo.setCancion(this.view.getTxtCancion().getText());
            grupo.setUrllFoto(this.view.getTxtUrl_Foto().getText());
            if (modelo.agregarGrupo(grupo)){
                JOptionPane.showMessageDialog(view, "Se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTabla().updateUI();
            }else{
                JOptionPane.showMessageDialog(view, "No se pudo agregar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }
        if(e.getSource() == this.view.getTabla()){
            System.out.println("Evento sobre tabla");
            int index = this.view.getTabla().getSelectedRow();
            Grupo tmp = modelo.getGrupoAtIndex(index);
            try {
                this.view.getLblImagenGrupo().setIcon(tmp.getImagen());
            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }
    }
}

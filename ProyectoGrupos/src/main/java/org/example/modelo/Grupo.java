package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Grupo {
    private int id;
    private String nombre;
    private String empresa;
    private int numeroIntegrantes;
    private int tiempoActividad;
    private String cancion;
    private String urllFoto;

    public Grupo() {
    }

    public Grupo(int id, String nombre, String empresa, int numeroIntegrantes, int tiempoActividad, String cancion, String urllFoto) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.numeroIntegrantes = numeroIntegrantes;
        this.tiempoActividad = tiempoActividad;
        this.cancion = cancion;
        this.urllFoto = urllFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public int getTiempoActividad() {
        return tiempoActividad;
    }

    public void setTiempoActividad(int tiempoActividad) {
        this.tiempoActividad = tiempoActividad;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getUrllFoto() {
        return urllFoto;
    }

    public void setUrllFoto(String urllFoto) {
        this.urllFoto = urllFoto;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", numeroIntegrantes=" + numeroIntegrantes +
                ", tiempoActividad=" + tiempoActividad +
                ", cancion='" + cancion + '\'' +
                ", urllFoto='" + urllFoto + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL urlImagen = new URL(this.urllFoto);
        return new ImageIcon(urlImagen);
    }
}


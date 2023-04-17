import java.awt.*;
import java.util.ArrayList;

public class Automovil extends Vehiculo {

    public String marca;
    public String subMarca;
    public byte modelo; //2000 + byte
    public Color color;

    public Automovil() {
    }

    public Automovil(int ruedas, String tipo, boolean contieneMotor, String material, String marca, String subMarca, byte modelo, Color color) {
        super(ruedas, tipo, contieneMotor, material);
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", ruedas=" + ruedas +
                ", tipo='" + tipo + '\'' +
                ", contieneMotor=" + contieneMotor +
                ", material='" + material + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("El automovil está encendiendo....");
    }
    public void velocidad(){
        System.out.println("El automovil avanza cada vez más rápido... ");
    }

    @Override
    public void mover() {
        System.out.println("El automoviñ se está moviendo");
    }

    @Override
    public void transportar() {
        System.out.println("El auto transporta gente");
    }
}


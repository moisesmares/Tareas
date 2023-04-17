import java.awt.*;
import java.sql.SQLOutput;

public class Taxi extends Automovil {
    private boolean enServicio;
    private int Horario;
    private double numeroPasajeros;

    public Taxi() {
    }

    public Taxi(int ruedas, String tipo, boolean contieneMotor, String material, String marca, String subMarca, byte modelo, Color color, boolean enServicio, int horario, double numeroPasajeros) {
        super(ruedas, tipo, contieneMotor, material, marca, subMarca, modelo, color);
        this.enServicio = enServicio;
        Horario = horario;
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int horario) {
        Horario = horario;
    }

    public double getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(double numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "enServicio=" + enServicio +
                ", Horario=" + Horario +
                ", numeroPasajeros=" + numeroPasajeros +
                ", marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", ruedas=" + ruedas +
                ", tipo='" + tipo + '\'' +
                ", contieneMotor=" + contieneMotor +
                ", material='" + material + '\'' +
                '}';
    }
    public void subirPasajeros(){
        System.out.println("Subale esta libre...");
    }
    public void prenderTaximetro(){
        System.out.println("Se enciende el taximetro");
    }

    @Override
    public void encender() {
        System.out.println("Se enciende el taxi");
    }

    @Override
    public void velocidad() {
        System.out.println("Aumenta la velocidad");
    }

    @Override
    public void mover() {
        System.out.println("Dizque se mueve pq hay trafico");
    }

    @Override
    public void transportar() {
        System.out.println("Subieron un buen de bolsas");
    }
}



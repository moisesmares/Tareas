import java.awt.*;
import java.awt.Color;
public class Main {
    public static void main(String[] args) {
        Vehiculo bici = new Vehiculo(2, "bicicleta", false, "metal");
        System.out.println(bici);
        bici.mover();
        bici.transportar();

        Automovil auto = new Automovil();
        System.out.println(auto);
        Automovil auto1 = new Automovil(4,"sedam", true, "acero", "Nissan", "March", (byte)14, Color.BLUE);
        System.out.println(auto1);
        auto1.encender();
        auto1.mover();
        auto1.velocidad();
        auto1.transportar();

    }
}
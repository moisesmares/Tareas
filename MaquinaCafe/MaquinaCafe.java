package org.example;

public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }
    public void servirAmericano() {
        if (this.agua >= 180 && this.cafe >=15 && this.vasos >0){
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos --;
            System.out.println("Aquí tiene su americano");
        } else {
            System.out.println("No hay sistema, ni recursos");
        }
    }
    public void servirExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos >0 ){
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos --;
            System.out.println("Aquí tiene su americano");
        } else {
            System.out.println("No hay sistema, ni recursos");
        }
    }
    public void servirCapuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0){
            this.agua -= 100;
            this.cafe -= 40;
            this.crema -= 70;
            this.vasos --;
            System.out.println("Aquí tiene su capuchino");
        } else {
            System.out.println("No hay sistema, ni recursos");
        }
    }
    public void mostrarCantidad(){
        System.out.println("Agua: " + this.agua + "ml");
        System.out.println("Café:" + this.cafe + "g");
        System.out.println("Crema: " + this.crema + "ml");
        System.out.println("Vasos: " + this.vasos);
    }
}
public class Vehiculo {
    protected int ruedas;
    protected String tipo;
    protected boolean contieneMotor;
    protected String material;

    public Vehiculo() {
    }

    public Vehiculo(int ruedas, String tipo, boolean contieneMotor, String material) {
        this.ruedas = ruedas;
        this.tipo = tipo;
        this.contieneMotor = contieneMotor;
        this.material = material;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isContieneMotor() {
        return contieneMotor;
    }

    public void setContieneMotor(boolean contieneMotor) {
        this.contieneMotor = contieneMotor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "ruedas=" + ruedas +
                ", tipo='" + tipo + '\'' +
                ", contieneMotor=" + contieneMotor +
                ", material='" + material + '\'' +
                '}';
    }
    public void transportar(){
        System.out.println("Este vehículo transporta algo...");
    }
    public void mover(){
        System.out.println("Este vehículo se mueve");
    }

}

package Clases;

public class Avion {
    String modelo;
    String marca;
    double capacidadCombustible;
    String tipoMotor;
    int cantidadAsientos;

    public Avion(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }

    public Avion(String modelo, String marca, double capacidadCombustible, String tipoMotor) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public void despegar() {
        System.out.println(modelo + " está despegando...");
    }

    public void aterrizar() {
        System.out.println(modelo + " está aterrizando...");
    }

    public void volar() {
        System.out.println(modelo + " está volando...");
    }



}

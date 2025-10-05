package Clases;

import Enumeradores.TipoArma;

public class Militar extends Avion{
    private TipoArma tipoArma;
    private int cantidadBalas;

    public Militar(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, TipoArma tipoArma, int cantidadBalas) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.tipoArma = tipoArma;
        this.cantidadBalas = cantidadBalas;
    }

    public TipoArma getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(TipoArma tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    public boolean ingresar() {
        return true;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                ", tipoArma=" + tipoArma +
                ", cantidadBalas=" + cantidadBalas +
                '}';
    }
}

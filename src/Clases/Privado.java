package Clases;

public class Privado extends Avion{
     private boolean tieneJacuzzi;
     private String claveWifi;
     private boolean verMundial;

    public Privado(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean tieneJacuzzi, String claveWifi, boolean verMundial) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
        this.verMundial = verMundial;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    public boolean isVerMundial() {
        return verMundial;
    }

    public void setVerMundial(boolean verMundial) {
        this.verMundial = verMundial;
    }

    public void servirComida() {
        System.out.println(modelo + " (Privado) está sirviendo comida gourmet.");
    }

    public void darMantas() {
        System.out.println(modelo + " está ofreciendo mantas de lujo.");
    }

    @Override
    public String toString() {
        return "Privado{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                ", tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", verMundial=" + verMundial +
                '}';
    }
}

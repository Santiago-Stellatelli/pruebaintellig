package Clases;

import Enumeradores.ProductosTransportar;

import java.util.List;

public class Carga extends Avion{
    private double cantidadKilos;
    List <ProductosTransportar> listaProductos;

    public Carga(String modelo, String marca, double capacidadCombustible, String tipoMotor, double cantidadKilos, List<ProductosTransportar> listaProductos) {
        super(modelo, marca, capacidadCombustible, tipoMotor);
        this.cantidadKilos = cantidadKilos;
        this.listaProductos = listaProductos;
        this.cantidadAsientos = 0;
    }

    public double getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(double cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

    public List<ProductosTransportar> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<ProductosTransportar> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean ingresar() {
        return true; // simulación
    }

    public void descargarContenido() {
        System.out.println(modelo + " está descargando: " + listaProductos);
    }

    @Override
    public String toString() {
        return "Carga{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                ", cantidadKilos=" + cantidadKilos +
                ", listaProductos=" + listaProductos +
                '}';
    }
}

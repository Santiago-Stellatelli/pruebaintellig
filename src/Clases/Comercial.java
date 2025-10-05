package Clases;

import Enumeradores.Servicios;

import java.util.ArrayList;
import java.util.List;

public class Comercial extends Avion{
    private int cantidadAzafatas;
    List <Servicios> listaServicios;


    public Comercial(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas, List<Servicios> listaServicios) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.listaServicios = listaServicios;
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public List<Servicios> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicios> listaServicios) {
        this.listaServicios = listaServicios;
    }


    @Override
    public String toString() {
        return "Comercial{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                ", cantidadAzafatas=" + cantidadAzafatas +
                ", listaServicios=" + listaServicios +
                '}';
    }
}

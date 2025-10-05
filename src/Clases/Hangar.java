package Clases;

import java.util.ArrayList;
import java.util.List;

public class Hangar <T extends Avion>{
    private String nombre;
    private List<T> aviones;
    private Class<T> tipoAvion;

    public Hangar(String nombre) {
        this.nombre = nombre;
        aviones = new ArrayList<>();
    }
    public Hangar(){
        this.nombre = nombre;
        aviones = new ArrayList<>();
        this.tipoAvion = tipoAvion;
    }

    public void agregar(T avion){
        aviones.add(avion);
    }
    public void despegarTodos() {
        System.out.println("Despegando todos los aviones del hangar " + nombre);
        for (T avion : aviones) {
            avion.despegar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<T> getAviones() {
        return aviones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAviones(List<T> aviones) {
        this.aviones = aviones;
    }

    public Class<T> getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(Class<T> tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "nombre='" + nombre + '\'' +
                ", aviones=" + aviones +
                '}';
    }
}

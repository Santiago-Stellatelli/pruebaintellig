package Clases;

import java.util.HashMap;
import java.util.Map;

public class Aeropuerto <T extends Avion>{

    private String nombre;
    private String codigo;
    private String direccion;
    private int capacidadOperacion;
    private int cantidadActual;
    private Map<String, Hangar<? extends Avion>> hangares;

    public Aeropuerto(String nombre, String codigo, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.capacidadOperacion = capacidadOperacion;
        this.cantidadActual = 0;
        hangares = new HashMap<>();
    }

    public void agregarHangar(Hangar<? extends Avion> hangar){
        hangares.put(hangar.getNombre(), hangar);
    }

   /* public void agregarAvion(String nombreHangar, T avion){
        Hangar<T> hangar = hangares.get(nombreHangar);
        if(hangar != null && cantidadActual < capacidadOperacion){
            hangar.agregar(avion);
            cantidadActual++;
        }else{
            System.out.println("Capacidad maxima alcanzada o hangar no encontrado");
        }
    }*/
   public <T extends Avion> void agregarAvion(String nombreHangar, T avion) {
       Hangar<? extends Avion> hangarBase = hangares.get(nombreHangar);

       if (hangarBase == null) {
           System.out.println("❌ Hangar no encontrado");
           return;
       }

       // Validar tipo del hangar contra el tipo del avión
       if (!hangarBase.getTipoAvion().isInstance(avion)) {
           System.out.println("❌ Este avión no corresponde al tipo de hangar");
           return;
       }

       // Cast seguro porque ya validamos el tipo
       @SuppressWarnings("unchecked")
       Hangar<T> hangar = (Hangar<T>) hangarBase;

       hangar.agregar(avion);
       cantidadActual++;
       System.out.println("✅ Avión agregado correctamente");
   }



    public void despegarTodos(String nombreHangar){
        Hangar<? extends Avion> hangar =hangares.get(nombreHangar);
        if(hangar != null){
            for(Avion a: hangar.getAviones()){
                a.despegar();
            }
        }else {
            System.out.println("Hangar no encontrado");
        }
    }
    /*el get devuelve el hangar correspondiente a ese nombre (el string seria la clave, el valor es el hangar en si)
    * Eso de devuelve un Hangar de tipo <? extends Avion> (osea un hangar que puede ser de cualquier tipo de avion)
    * Entonces hacemos un casteo a Hangar<T> ya que "T" va a estar definido ya en el main
    *
    * */


    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", capacidadOperacion=" + capacidadOperacion +
                ", cantidadActual=" + cantidadActual +
                ", hangares=" + hangares +
                '}';
    }
}

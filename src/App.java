import Clases.*;
import Enumeradores.Servicios;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto("Astor Piazzolla","7600","MDQ",5);
        //Hangar<Avion> hangarComercial = new Hangar<>("Hangar Comercial");
        Hangar<Comercial> hangarComercial = new Hangar<>();
        hangarComercial.setNombre("Hangar Comercial");
        hangarComercial.setTipoAvion(Comercial.class);
        Hangar<Privado> hangarPrivado = new Hangar<>();
        hangarPrivado.setNombre("Hangar Privado");
        hangarPrivado.setTipoAvion(Privado.class);

        aeropuerto.agregarHangar(hangarComercial);
        aeropuerto.agregarHangar(hangarPrivado);


        Comercial c1 = new Comercial("Boeing 757","Boeing", 360,"Turbina",200,20, Arrays.asList(Servicios.COMIDA, Servicios.BEBIDAS));
        Privado p1 = new Privado("Jet5", "Emirates",100,"Jet",30,true,"Priv1", true);

       // hangarComercial.agregar(c1);
        //hangarPrivado.agregar(p1);
        aeropuerto.agregarAvion("Hangar Comercial", p1);
        aeropuerto.agregarAvion("Hangar Privado", p1);

        System.out.println(aeropuerto);




    }
}

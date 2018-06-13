package co.com.poli.data;

import co.com.poli.model.Inmueble;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cgaop
 */
public class InmuebleData {
    private static List<Inmueble> listaInmuebles;
    
    static{
        listaInmuebles = new ArrayList<Inmueble>(){
            {  
                add(new Inmueble("1010", "Nelson", 10000D, 6D, 1, 10, true));
                add(new Inmueble("1011", "Sonel", 50000D, 9D, 1, 5, true));
                add(new Inmueble("1012", "Cristian", 60000D, 2D, 1, 6, true));
                add(new Inmueble("1013", "Catalina", 30000D, 3D, 1, 8, true));
                add(new Inmueble("1014", "Sara", 80000D, 4D, 1, 9, true));
            }
        };
    }

    public static List<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public static void setListaInmuebles(List<Inmueble> aListaInmuebles) {
        listaInmuebles = aListaInmuebles;
    }
    
    
}

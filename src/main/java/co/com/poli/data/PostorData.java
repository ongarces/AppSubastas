package co.com.poli.data;

import co.com.poli.model.Inmueble;
import co.com.poli.model.Postor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cgaop
 */
public class PostorData {

    private static List<Postor> listaPostores;

    static {
        listaPostores = new ArrayList<Postor>() {
            {
                add(new Postor("9010", new Inmueble("1016", "Giovanny", 90000D, 3D, 1, 6, true), 40000D));
                add(new Postor("9011", new Inmueble("1017", "Yulieth", 85000D, 2D, 1, 7, true), 5000D));
                add(new Postor("9012", new Inmueble("1018", "Andres", 60000D, 4D, 1, 8, true), 25000D));
            }
        };
    }

    public static List<Postor> getListaPostores() {
        return listaPostores;
    }

    public static void setListaPostores(List<Postor> aListaPostores) {
        listaPostores = aListaPostores;
    }
    
    
}

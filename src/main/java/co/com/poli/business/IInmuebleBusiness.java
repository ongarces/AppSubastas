package co.com.poli.business;

import co.com.poli.model.Inmueble;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IInmuebleBusiness {
    List<Inmueble> obtenerInmuebles();
    Inmueble obtenerInmueble(String idInmueble);
    String crearInmueble(Inmueble inmueble);
    String eliminarInmueble(String idInmueble);
    
//    String pujaMaxActivada(String idInmueble);
//    String pujaMasAlta();
}

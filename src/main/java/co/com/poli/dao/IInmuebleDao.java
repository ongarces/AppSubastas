package co.com.poli.dao;

import co.com.poli.model.Inmueble;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IInmuebleDao {
    List<Inmueble> obtenerInmuebles();
    Inmueble obtenerInmueble(String idInmueble);
    String crearInmueble(Inmueble inmueble);
    String eliminarInmueble(String idInmueble);
}

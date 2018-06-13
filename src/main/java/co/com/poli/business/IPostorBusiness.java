package co.com.poli.business;

import co.com.poli.model.Postor;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IPostorBusiness {
    List<Postor> obtenerPostores();
    Postor obtenerPostor(String idPostor);
    String crearPostor(Postor postor);
    String eliminarPostor(String idPostor);
}

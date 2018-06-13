package co.com.poli.dao;

import co.com.poli.model.Postor;
import java.util.List;

/**
 *
 * @author cgaop
 */
public interface IPostorDao {
    List<Postor> obtenerPostores();
    Postor obtenerPostor(String idPostor);
    String crearPostor(Postor postor);
    String eliminarPostor(String idPostor);
}

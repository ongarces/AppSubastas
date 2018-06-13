package co.com.poli.dao.impl;

import co.com.poli.dao.IInmuebleDao;
import co.com.poli.data.InmuebleData;
import co.com.poli.model.Inmueble;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cgaop
 */
@Repository
public class InmuebleDaoImpl implements IInmuebleDao {

    @Override
    public List<Inmueble> obtenerInmuebles() {
        return InmuebleData.getListaInmuebles();
    }

    @Override
    public Inmueble obtenerInmueble(String idInmueble) {
        Inmueble inmueble = null;
        
        List<Inmueble> listaInmuebles = InmuebleData.getListaInmuebles();
        
        for (Inmueble inm : listaInmuebles) {
            if (inm.getIdInmueble().equals(idInmueble)) {
                inmueble = inm;
            }
        }
        
        return inmueble;
    }

    @Override
    public String crearInmueble(Inmueble inmueble) {
        List<Inmueble> listaInmuebles = InmuebleData.getListaInmuebles();
        listaInmuebles.add(inmueble);
        InmuebleData.setListaInmuebles(listaInmuebles);
        return"Inmueble creado...";
    }

    @Override
    public String eliminarInmueble(String idInmueble) {
        List<Inmueble> listaInmuebles = InmuebleData.getListaInmuebles();
        listaInmuebles.remove(obtenerInmueble(idInmueble));
        InmuebleData.setListaInmuebles(listaInmuebles);
        return "Inmueble eliminado..";
    }

}

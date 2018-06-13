package co.com.poli.business.impl;

import co.com.poli.business.IInmuebleBusiness;
import co.com.poli.dao.IInmuebleDao;
import co.com.poli.data.InmuebleData;
import co.com.poli.model.Inmueble;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cgaop
 */
@Service
public class InmuebleBusinessImpl implements IInmuebleBusiness {

    @Autowired
    private IInmuebleDao inmuebleDao;

    @Override
    public List<Inmueble> obtenerInmuebles() {
        return inmuebleDao.obtenerInmuebles();
    }

    @Override
    public Inmueble obtenerInmueble(String idInmueble) {
        return inmuebleDao.obtenerInmueble(idInmueble);
    }

    @Override
    public String crearInmueble(Inmueble inmueble) {
        String respuesta = "";
        List<Inmueble> listaInmuebles = InmuebleData.getListaInmuebles();

        if (listaInmuebles.contains(inmueble)) {
            respuesta = "Inmueble ya esta registrado...";
        } else {
            respuesta = inmuebleDao.crearInmueble(inmueble);
        }

        return respuesta;
    }

    @Override
    public String eliminarInmueble(String idInmueble) {
        String respuesta = "Materia no Existe";
        List<Inmueble> listaInmuebles = InmuebleData.getListaInmuebles();

        if (listaInmuebles.contains(inmuebleDao.obtenerInmueble(idInmueble))) {
            respuesta = inmuebleDao.eliminarInmueble(idInmueble);
        }
        return respuesta;
    }

//    @Override
//    public String pujaMaxActivada(String idInmueble) {//llego la puja max, estadoInm=inactivo
//
//    }
//
//    @Override
//    public String pujaMasAlta() {
//
//    }

}

package co.com.poli.business.impl;

import co.com.poli.business.IPostorBusiness;
import co.com.poli.dao.IPostorDao;
import co.com.poli.data.PostorData;
import co.com.poli.model.Postor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cgaop
 */
@Service
public class PostorBusinessImpl implements IPostorBusiness{
    
    @Autowired
    private IPostorDao postorDao;

    @Override
    public List<Postor> obtenerPostores() {
      return postorDao.obtenerPostores();
    }

    @Override
    public Postor obtenerPostor(String idPostor) {
        return  postorDao.obtenerPostor(idPostor);
    }

    @Override
    public String crearPostor(Postor postor) {
        String respuesta = "";
        List<Postor> listaPostores = PostorData.getListaPostores();
      
            if (listaPostores.contains(postor)) {
                respuesta = "Postor ya esta registrado...";
            } else {
                respuesta = postorDao.crearPostor(postor);
            }
        
        return respuesta;
    }

    @Override
    public String eliminarPostor(String idPostor) {
       String respuesta = "Postor no Existe";
        List<Postor> listaPostores = PostorData.getListaPostores();
        
        if (listaPostores.contains(postorDao.obtenerPostor(idPostor))) {
            respuesta = postorDao.eliminarPostor(idPostor);
        }
        return respuesta;
    }
}

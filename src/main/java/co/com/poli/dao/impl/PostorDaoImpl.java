package co.com.poli.dao.impl;

import co.com.poli.dao.IPostorDao;
import co.com.poli.data.PostorData;
import co.com.poli.model.Postor;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cgaop
 */
@Repository
public class PostorDaoImpl implements IPostorDao {

    @Override
    public List<Postor> obtenerPostores() {
        return PostorData.getListaPostores();
    }

    @Override
    public Postor obtenerPostor(String idPostor) {
        Postor postor = null;

        List<Postor> listaPostores = PostorData.getListaPostores();

        for (Postor post : listaPostores) {
            if (post.getIdPostor().equals(idPostor)) {
                postor = post;
            }
        }

        return postor;
    }

    @Override
    public String crearPostor(Postor postor) {
        List<Postor> listaPostores = PostorData.getListaPostores();
        listaPostores.add(postor);
        PostorData.setListaPostores(listaPostores);
        return "Postor creado...";
    }

    @Override
    public String eliminarPostor(String idPostor) {
        List<Postor> listaPostores = PostorData.getListaPostores();
        listaPostores.remove(obtenerPostor(idPostor));
        PostorData.setListaPostores(listaPostores);
        return "Postor eliminado..";
    }

}

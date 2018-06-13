package co.com.poli.controller;

import co.com.poli.business.IInmuebleBusiness;
import co.com.poli.business.IPostorBusiness;
import co.com.poli.model.Inmueble;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cgaop
 */
@RestController
@RequestMapping(value = "/")
public class SubastaController {
    
    @Autowired
    private IInmuebleBusiness inBusiness;
    @Autowired
    private IPostorBusiness poBusiness;
    
    @GetMapping("/inmueble")
    public List<Inmueble> obtenerInmuebles(HttpServletResponse hsr){
        return inBusiness.obtenerInmuebles();
    }
    
    @GetMapping("/inmueble/{id_inmueble}")//si me llega una variable, entro a obtener 1 inm
    public Inmueble obtenerInmueble(@PathVariable String id_inmueble, HttpServletResponse hsr){
        return inBusiness.obtenerInmueble(id_inmueble);
    }
    
    @PostMapping("/inmueble")
    public String crearInmueble(@RequestBody Inmueble inmueble, HttpServletResponse hsr){
        return inBusiness.crearInmueble(inmueble);
    }
    
    @DeleteMapping("/inmueble/{id_inmueble}")
    private String eliminarInmueble(@PathVariable String id_inmueble, HttpServletResponse hsr){
        return inBusiness.eliminarInmueble(id_inmueble);
    }
    
    //--------
    @GetMapping("/status")
    public String status(){
        return "running server subastas";
    }
}

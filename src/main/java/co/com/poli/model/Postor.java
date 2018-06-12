package co.com.poli.model;

import java.util.Objects;

/**
 *
 * @author cgaop
 */
public class Postor {
    private String idPostor;
    private Inmueble inmueble;
    private Double pujaPostor;

    public Postor() {
    }

    public Postor(String idPostor, Inmueble inmueble, Double pujaPostor) {
        this.idPostor = idPostor;
        this.inmueble = inmueble;
        this.pujaPostor = pujaPostor;
    }

    public Double getPujaPostor() {
        return pujaPostor;
    }

    public void setPujaPostor(Double pujaPostor) {
        this.pujaPostor = pujaPostor;
    }

    public String getIdPostor() {
        return idPostor;
    }

    public void setIdPostor(String idPostor) {
        this.idPostor = idPostor;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idPostor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Postor other = (Postor) obj;
        if (!Objects.equals(this.idPostor, other.idPostor)) {
            return false;
        }
        return true;
    }
    
}

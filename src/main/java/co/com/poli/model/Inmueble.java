package co.com.poli.model;

import java.util.Objects;

/**
 *
 * @author cgaop
 */
public class Inmueble {
    
    private String idInmueble;
    private String propietario;
    private Double valor;
    private Double porcentajePerdida;
    private int pujaMin;
    private int pujaMax;
    private Boolean estado;

    public Inmueble() {
    }

    public Inmueble(String idInmueble, String propietario, Double valor, Double porcentajePerdida, int pujaMin, int pujaMax, Boolean estado) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
        this.valor = valor;
        this.porcentajePerdida = porcentajePerdida;
        this.pujaMin = pujaMin;
        this.pujaMax = pujaMax;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPorcentajePerdida() {
        return porcentajePerdida;
    }

    public void setPorcentajePerdida(Double porcentajePerdida) {
        this.porcentajePerdida = porcentajePerdida;
    }

    public int getPujaMin() {
        return pujaMin;
    }

    public void setPujaMin(int pujaMin) {
        this.pujaMin = pujaMin;
    }

    public int getPujaMax() {
        return pujaMax;
    }

    public void setPujaMax(int pujaMax) {
        this.pujaMax = pujaMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idInmueble);
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
        final Inmueble other = (Inmueble) obj;
        if (!Objects.equals(this.idInmueble, other.idInmueble)) {
            return false;
        }
        return true;
    }
    
    
    
}

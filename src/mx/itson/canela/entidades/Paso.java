package mx.itson.canela.entidades;

/**
 *
 * @author Xylan
 * Entidad de Pasos
 */
public class Paso {

    private int orden;
    private String descripcion;
    
    /**
     * Getter & Setter
     */
    /** 
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

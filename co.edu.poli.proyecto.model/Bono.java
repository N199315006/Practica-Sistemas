package co.edu.poli.proyecto.model;

import java.util.*;

/**
 * 
 */
public class Bono extends Medios_de_pago {

    /**
     * Default constructor
     */
    public Bono() {
    }

    /**
     * 
     */
    private int codigo;

    /**
     * 
     */
    private int valor_bono;

    /**
     * 
     */
    private Date fecha_validez;




    /**
     * 
     */
    public abstract void Validar_pago();

}
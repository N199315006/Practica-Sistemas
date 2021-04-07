package co.edu.poli.proyecto.model;

import java.util.*;

/**
 * 
 */
public class Tarjeta extends Medios_de_pago {

    /**
     * Default constructor
     */
    public Tarjeta() {
    }

    /**
     * 
     */
    private int numero_tarjeta;

    /**
     * 
     */
    private String nombre_titular;

    /**
     * 
     */
    private Date fecha_vencimiento;


    /**
     * 
     */
    public abstract void Validar_pago();

}
package co.edu.poli.proyecto.model;

import java.util.*;

/**
 * 
 */
public class Efectivo extends Medios_de_pago {

    /**
     * Default constructor
     */
    public Efectivo() {
    }

    /**
     * 
     */
    public int cantidad_billetes;

    /**
     * 
     */
    public abstract void Validar_pago();

}
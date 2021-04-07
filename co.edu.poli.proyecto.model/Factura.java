package co.edu.poli.proyecto.model;

import java.util.*;

/**
 * 
 */
public class Factura extends Usuario {

    /**
     * Default constructor
     */
    public Factura() {
    }

    /**
     * 
     */
    private int numero_factura;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private String nit;

    /**
     * 
     */
    private String nombre_empresa;

    /**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private Medios_de_pago medios_de_pago;

    /**
     * 
     */
    private Producto producto [ ] ;

    /**
     * 
     */
    private Usuario usuario;






    /**
     * @param costo_categoria 
     * @return
     */
    public int total_costo(int costo_categoria) {
        // TODO implement here
        return 0;
    }

    /**
     * @param impuesto 
     * @return
     */
    public int cobro_impuestos(int impuesto) {
        // TODO implement here
        return 0;
    }

    /**
     * @param codigo_producto 
     * @return
     */
    public int conteo_productos(int codigo_producto) {
        // TODO implement here
        return 0;
    }

    /**
     * @param total_conteo 
     * @param costo_producto 
     * @param total_categoria 
     * @param Parameter1
     */
    public void costo_categoria(int total_conteo, float costo_producto, void total_categoria, int Parameter1) {
        // TODO implement here
    }

}
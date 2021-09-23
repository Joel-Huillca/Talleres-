package com.app;
/**
 * Es una herencia de la Clase Clientes
 */
public class Retail extends Cliente {
    /**
     * Declaramos los Atributos de esta clase
     */
    private int clientePorHora;
    private int ingresoHora;
    private int presupuestoSeguridad;

    /**Constructor:
     *
     * @param identificador Identificador de Cliente
     * @param nombre nombre de cliente
     * @param rubro rubro
     * @param clientePorHora Numero de cliente al dia
     * @param ingresoHora ingreso neto por hora
     * @param presupuestoSeguridad presupuesto de seguridad
     */
    public Retail(String identificador, String nombre, String rubro, int clientePorHora, int ingresoHora, int presupuestoSeguridad) {
        super(identificador, nombre, rubro);
        this.clientePorHora = clientePorHora;
        this.ingresoHora = ingresoHora;
        this.presupuestoSeguridad = presupuestoSeguridad;
    }

    /**   Este Metodo calcula el Factor de riesgo
     *       𝑓𝑎𝑐𝑡𝑜𝑟= 𝑛∗ℎ2−𝑝22 , donde
     *       n = número de clientes al día
     *       h = ingreso neto por hora
     *       p = presupuesto de seguridad
     *
     * @return factor de riesgo
     */
    public float calularRiesgo(){  //Retornar Riesgos

        float factor = ((clientePorHora*(ingresoHora*ingresoHora)))   -  ( (presupuestoSeguridad*presupuestoSeguridad) / 2 );
        return factor;
        //Calculadora:   91509370950000000
        //IntellJIdeA:   1.84268326E9
    }

    /**
     * @return todos los atributos de esta clase Retail
     */
    @Override
    public String toString() {
        return "Retail[" +
                "clientePorHora=" + clientePorHora +
                ", ingresoHora=" + ingresoHora +
                ", presupuestoSeguridad=" + presupuestoSeguridad +
                ']';
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */

    public int getClientePorHora() {
        return clientePorHora;
    }

    public void setClientePorHora(int clientePorHora) {
        this.clientePorHora = clientePorHora;
    }

    public int getIngresoHora() {
        return ingresoHora;
    }

    public void setIngresoHora(int ingresoHora) {
        this.ingresoHora = ingresoHora;
    }

    public int getPresupuestoSeguridad() {
        return presupuestoSeguridad;
    }

    public void setPresupuestoSeguridad(int presupuestoSeguridad) {
        this.presupuestoSeguridad = presupuestoSeguridad;
    }
}

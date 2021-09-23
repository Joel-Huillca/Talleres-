package com.app;

/**
 * Es una herencia de la Clase Clientes
 */
public class Banco extends Cliente {
    /**
     * Declaramos los Atributos de esta clase
     */
    private int clientePorHora;
    private int bovedas;
    private int presupuestoSeguridad;

    /**Constructor:
     *
     * @param identificador Es el identificador de cliente
     * @param nombre Es el nombre del Cliente
     * @param rubro Rubro de la clase
     * @param clientePorHora numero de clientes a la hora
     * @param bovedas numero de bovedas
     * @param presupuestoSeguridad Es el presupesto de seguridad
     */
    public Banco(String identificador, String nombre, String rubro, int clientePorHora, int bovedas, int presupuestoSeguridad) {
        super(identificador, nombre, rubro);
        this.clientePorHora = clientePorHora;
        this.bovedas = bovedas;
        this.presupuestoSeguridad = presupuestoSeguridad;
    }

    /**
     * @return retorna Es el factor de riesgo
     * Banco: 𝑓𝑎𝑐𝑡𝑜𝑟= 𝑛2+𝑏2−𝑝22 , donde
     * n = número de clientes a la hora
     * b = número de bóvedas
     * p = presupuesto de seguridad
     */
    public float calularRiesgo(){  //Retornar Riesgos

        float x1 =(clientePorHora*clientePorHora);
        float x2 =(presupuestoSeguridad*presupuestoSeguridad)/(2);
        float factor = x1-x2;

        return factor;
        // Calculadora:  -31249999024    o   -3,1249999024*10^{10}
        // PorPantalla:   9.622553E8
    }

    /**
     * @return todos los atributos de esta clase Banco
     */
    @Override
    public String toString() {
        return "Banco[" +
                "clientePorHora=" + clientePorHora +
                ", bovedas=" + bovedas +
                ", presupuestoSeguridad=" + presupuestoSeguridad +
                ']';
    }

    /**
     * Son para llamar y modificar
     *get() y Set()
     */

    public int getClientePorHora() {
        return clientePorHora;
    }

    public void setClientePorHora(int clientePorHora) {
        this.clientePorHora = clientePorHora;
    }

    public int getBovedas() {
        return bovedas;
    }

    public void setBovedas(int bovedas) {
        this.bovedas = bovedas;
    }

    public int getPresupuestoSeguridad() {
        return presupuestoSeguridad;
    }

    public void setPresupuestoSeguridad(int presupuestoSeguridad) {
        this.presupuestoSeguridad = presupuestoSeguridad;
    }



}

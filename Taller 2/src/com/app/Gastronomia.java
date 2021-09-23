package com.app;
/**
 * Es una herencia de la Clase Clientes
 */
public class Gastronomia extends Cliente{
    /**
     * Declaramos los Atributos de esta clase
     */
    private int clientePorHora;
    private int dispositovoloT;
    private int cajasRegistradoras;

    /**Constructor:
     *
     * @param identificador identificador de cliente
     * @param nombre nombre de cliente
     * @param rubro rubro
     * @param clientePorHora numero de cliente a la hora
     * @param dispositovoloT numero de bovedas
     * @param cajasRegistradoras numero de cajas regitradoras
     */
    public Gastronomia(String identificador, String nombre, String rubro, int clientePorHora, int dispositovoloT, int cajasRegistradoras) {
        super(identificador, nombre, rubro);
        this.clientePorHora = clientePorHora;
        this.dispositovoloT = dispositovoloT;
        this.cajasRegistradoras = cajasRegistradoras;
    }

    /**      Es es un metodo para calcular el factor de riesgo:
     *                       𝑓𝑎𝑐𝑡𝑜𝑟=(𝑛∗𝑐) + 𝑖 2
     *                 n = número de clientes a la hora
     *                 i = número de dispositivos IoT
     *                 c = número de cajas registradoras
     *
     * @return Factor de riesgo
     */
    public float calularRiesgo(){  //Retornar Riesgos
        int x = dispositovoloT*dispositovoloT;
        float factor= (clientePorHora*cajasRegistradoras)+ x;

        return factor;
    }

    /**
     * @return todos los atributos de esta clase Gastronomia
     */
    @Override
    public String toString() {
        return "Gastronomia{" +
                "clientePorHora=" + clientePorHora +
                ", dispositovoloT=" + dispositovoloT +
                ", cajasRegistradoras=" + cajasRegistradoras +
                '}';
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

    public int getDispositovoloT() {
        return dispositovoloT;
    }

    public void setDispositovoloT(int dispositovoloT) {
        this.dispositovoloT = dispositovoloT;
    }

    public int getCajasRegistradoras() {
        return cajasRegistradoras;
    }

    public void setCajasRegistradoras(int cajasRegistradoras) {
        this.cajasRegistradoras = cajasRegistradoras;
    }
}

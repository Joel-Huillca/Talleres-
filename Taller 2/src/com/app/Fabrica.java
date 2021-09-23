package com.app;
/**
 * Es una herencia de la Clase Clientes
 */
public class Fabrica extends Cliente{
    /**
     * Declaramos los Atributos de esta clase
     */
    private int clientePorHora;
    private int dispositivoloT; // Corregir: Ingreso Producido por Hora
    private int cajasRegistradoras; //Corregir: Numero de dispositivo loT

    /**
     *
     * @param identificador numero de cliente
     * @param nombre nombre de cliente
     * @param rubro rubro
     * @param clientePorHora numero de cliente al dia
     * @param dispositivoloT x
     * @param cajasRegistradoras x
     */
    public Fabrica(String identificador, String nombre, String rubro, int clientePorHora, int dispositivoloT, int cajasRegistradoras) {
        super(identificador, nombre, rubro);
        this.clientePorHora = clientePorHora;
        this.dispositivoloT = dispositivoloT;
        this.cajasRegistradoras = cajasRegistradoras;
    }

    /**    Calcula el factor de riesgo:
     *        𝑓𝑎𝑐𝑡𝑜𝑟= 𝑝∗ℎ+2∗𝑖 , donde
     *       p = piezas a la hora
     *       h = ingreso producido por hora
     *       i = número de dispositivo IoT
     *
     * @return retorna el factor de riesgo
     */
    public float calularRiesgo(){  //Retornar Riesgos

        float factor = (clientePorHora*dispositivoloT)+(2*cajasRegistradoras);
        return factor; //  43200010
    }

    /**
     * @return todos los atributos de esta clase Fabrica
     */
    @Override
    public String toString() {
        return "Fabrica[" +
                "clientePorHora=" + clientePorHora +
                ", dispositivoloT=" + dispositivoloT +
                ", Ingreso Producido por Hora=" + cajasRegistradoras +
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

    public int getDispositivoloT() {
        return dispositivoloT;
    }

    public void setDispositivoloT(int dispositivoloT) {
        this.dispositivoloT = dispositivoloT;
    }

    public int getCajasRegistradoras() {
        return cajasRegistradoras;
    }

    public void setCajasRegistradoras(int cajasRegistradoras) {
        this.cajasRegistradoras = cajasRegistradoras;
    }
}

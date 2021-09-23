package com.app;

import java.util.Arrays;

public class ListaCliente {
/**Atributos de la Lista de Clientes**/
    private Cliente[] listaCliente;
    private int cantMax;
    private int cantCliente;

    /**Contructor de la Clase
     * @param cantMax cantidad Maxima
     * Recibe los parametros de la catidad maxima que se puede ocupar en esta lista
     */
    public ListaCliente( int cantMax) {
        this.cantMax = cantMax;
        this.listaCliente = new Cliente[cantMax];
        this.cantCliente = cantCliente;
    }

    /** Metooo: agregar Clientes en la lista
     * @param cliente
     * @return
     */
    public boolean agregaCliente(Cliente cliente){
        if (this.cantCliente < this.cantMax){
            listaCliente[cantCliente]=cliente;

            cantCliente ++;
            return true;
        }
        else{
            return false;
        }
    }

    /**Metodo: Busca CLientes desde el parametro Rubro
     * @param rubro
     * @return
     */
    public Cliente buscarClienteRubro(String rubro){
        for (int i = 0; i < this.cantCliente; i++) {
            if(this.listaCliente[i].getRubro().equalsIgnoreCase(rubro)){
                return this.listaCliente[i];
            }
        }
        return null;
    }

    /**Metodo: Busca Clientes desde el parametro identificador
     * @param identificador
     * @return
     */
    public Cliente buscarClienteIdentificador(String identificador){
        for (int i = 0; i < this.cantCliente; i++) {
            if(this.listaCliente[i].getRubro().equalsIgnoreCase(identificador)){
                return this.listaCliente[i];
            }
        }
        return null;
    }



    /**@return Retorna los atritbutos de esta Clase
     */
    @Override
    public String toString() {
        return "ListaCliente[" +
                "listaCliente=" + Arrays.toString(listaCliente) +
                ", cantMax=" + cantMax +
                ", cantCliente=" + cantCliente +
                ']';
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Cliente[] listaCliente) {
        this.listaCliente = listaCliente;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantCliente() {
        return cantCliente;
    }

    public void setCantCliente(int cantCliente) {
        this.cantCliente = cantCliente;
    }
}

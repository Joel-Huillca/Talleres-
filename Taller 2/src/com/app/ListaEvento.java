package com.app;

import java.util.Arrays;

public class ListaEvento {
    /**Atributos de la Lista de Eventos**/
    private Evento[] listaEvento;
    private int cantMax;
    private int cantEventos;
    /**Contructor de la Clase
     * @param cantMax cantidad Maxima
     * Recibe los parametros de la catidad maxima que se puede ocupar en esta lista Eventos
     */
    public ListaEvento(int cantMax) {
        this.cantMax = cantMax;
        this.cantEventos = cantEventos;
        this.listaEvento = new Evento[cantMax];
    }

    /**Metodo: Agrega un Evento a la Lista de eventos
     * @param evento
     * @return
     */
    public boolean agregaEvento(Evento evento) {
        if (cantEventos < this.cantMax) {
            listaEvento[cantEventos] = evento;

            cantEventos++;
            return true;

        } else return false;

    }

    /**@return Retorna los atritbutos de esta Clase
     */
    @Override
    public String toString() {
        return  Arrays.toString(listaEvento)
                ;
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */

    public Evento[] getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(Evento[] listaEvento) {
        this.listaEvento = listaEvento;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantEventos() {
        return cantEventos;
    }

    public void setCantEventos(int cantEventos) {
        this.cantEventos = cantEventos;
    }
}

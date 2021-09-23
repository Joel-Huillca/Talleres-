package com.app;

public class Evento {
    /**Declaramos los Atributos de esta clase*/
    private String fecha;
    private String idCliente;
    private String idVulnerabilidad;
    private String plataforma;
    private ListaEvento listaEvento;

    /** Construstor:
     *
     * @param fecha La fecha del Evento
     * @param idCliente El identificador de clientes
     * @param idVulnerabilidad El identificador de vulnerabilidades
     * @param plataforma la plataforma [linux, windows, mac, múltiple y otro.]
     */
    public Evento(String fecha, String idCliente, String idVulnerabilidad, String plataforma) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idVulnerabilidad = idVulnerabilidad;
        this.plataforma = plataforma;
        //this.listaEvento = new ListaEvento();
    }

    /**
     * @return todos los atributos de esta clase Evento
     */
    @Override
    public String toString() {
        return "[" +
                "fecha=" + fecha +
                ", idCliente=" + idCliente +
                ", idVulnerabilidad= " + idVulnerabilidad +
                ", plataforma=" + plataforma +
                "]";
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdVulnerabilidad() {
        return idVulnerabilidad;
    }

    public void setIdVulnerabilidad(String idVulnerabilidad) {
        this.idVulnerabilidad = idVulnerabilidad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public ListaEvento getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(ListaEvento listaEvento) {
        this.listaEvento = listaEvento;
    }
}

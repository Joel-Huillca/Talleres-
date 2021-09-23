package com.app;

public class Vulnerabilidad {
    /**Declaramos los Atributos de esta clase*/
    private String identificador;
    private String tipo;
    private String fecha;

    /**Contructor de la Clase Vulnerabilidad
     *
     * @param identificador Identificador de vulnerabilidades
     * @param tipo Tipo de vulnerabilidad
     * @param fecha Fecha de registro encontrada
     */
    public Vulnerabilidad(String identificador, String tipo, String fecha) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.fecha = fecha;
        //this.listaEventos = new ListaEvento();
    }
    /**@return todos los atributos de esta clase Evento*/
    @Override
    public String toString() {
        return "Vulnerabilidad [" +
                "identificador= " + identificador + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +

                ']';
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}

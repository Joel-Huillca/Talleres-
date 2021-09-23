package com.app;

public class ListaVulnerabilidad {
    /**Atributos de la Lista de Vulnerabilidades**/
    private Vulnerabilidad [] listaVuln;
    private int cantMax;
    private int cantVuln;

    /**Contructor de la Clase
     * @param cantMax cantidad Maxima
     * Recibe los parametros de la catidad maxima que se puede ocupar en esta lista
     */
    public ListaVulnerabilidad( int cantMax) {
        this.cantMax = cantMax;
        this.cantVuln = cantVuln;
        this.listaVuln = new Vulnerabilidad[cantMax];
    }
    /**METODO: Agregar Vulnerabilidad a la lista de vulnerabilidades
     * @param vulnerabilidad
     * @return
     */
    public boolean agregarVulnerabilidad(Vulnerabilidad vulnerabilidad){
        if(this.cantMax == this.cantVuln){
            return false;
        }

        if (cantVuln< cantMax){
            listaVuln[cantVuln] = vulnerabilidad;
            cantVuln++;
            return true;
        }else return false;

    }

    /**METODO: busca Vulnerabilidad por el parametro identificador
     * @param identificador
     * @return
     */
    public Vulnerabilidad buscarVulnerabilidad(String identificador){

        for (int i = 0; i < cantVuln; i++) {
            if (listaVuln[i].getIdentificador().equalsIgnoreCase(identificador)) {
                return this.listaVuln[i];
            }
        }
        return null;
    }

    /**Metodo: obtener vulnerabilidad por el parametro posicion
     *(Este meotodo no se logro a ocupar)
     * @param posicion
     * @return
     */
    public Vulnerabilidad ObtenerVulnerabilidad(int posicion){
        if (posicion < 0 || posicion >= this.cantVuln) {
            return null;
        }
        return this.listaVuln[posicion];
    }
    /**
     * Son para llamar y modificar
     * get() y Set()
     */
    public Vulnerabilidad[] getListaVuln() {
        return listaVuln;
    }

    public void setListaVuln(Vulnerabilidad[] listaVuln) {
        this.listaVuln = listaVuln;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantVuln() {
        return cantVuln;
    }

    public void setCantVuln(int cantVuln) {
        this.cantVuln = cantVuln;
    }
}

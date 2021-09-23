package com.app;

/**
 * Esta la clase Padre la que contiene a:
 * class Gastronomia
 * class Banco
 * class Fabrica
 * class Retail
 */
public abstract class  Cliente {
    /**Declaramos los Atributos de esta clase Clientes
     */
    private String Identificador;
    private String nombre;
    private String rubro;
    private float riesgo;

    /**Este es el constructor de la clase Cliente
     *
     * @param identificador Numero de identificador
     * @param nombre Nombre del Cliente
     * @param rubro Rubro de la empresa
     */
    public Cliente(String identificador, String nombre, String rubro) {
        this.Identificador = identificador;
        this.nombre = nombre;
        this.rubro = rubro;
    }

    /**Se crea este metodo para que hereden las otras clases hijas
     * @return Factor de riesgo
     */
    public abstract float calularRiesgo();

    /** @return Los atributos de esta clase*/
    @Override
    public String toString() {
        return "Cliente{" +
                "Identificador='" + Identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rubro='" + rubro + '\'' +
                ", riesgo=" + riesgo +
                '}';
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public float getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(float riesgo) {
        this.riesgo = riesgo;
    }
}

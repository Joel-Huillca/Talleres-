package com.app;

public interface SistemaSeguridad {

    public String [] obtenerCLienteRubro (String rubro);
    public void obtenerCLiente ();
    public void obtenerVulnerabilidad(String identificador, String tipo, String fecha);
    public boolean agregarVulnerabilidad(String identificador, String tipo, String fecha);
    public void obtenerEventos();

    public boolean agregarEvento(String fecha, String idCliente, String idVulnerabilidad, String plataforma);
    public boolean agregarGastronomia(String identificador, String nombre, String rubro, int clientePorHora, int dispositivoloT, int cajasRegistradoras);
    public boolean agregarBanco(String identificador, String nombre, String rubro, int clientePorHora, int bovedas, int presupuestoSeguridad);
    public boolean agregarClienteFabrica(String identificador, String nombre, String rubro, int piezaPorHora, int ingresoPorHora, int dispositivoloT);
    public boolean agregarClienteRetalil(String identificador, String nombre, String rubro, int clientePorHora, int ingresoPorHora, int PresupuestoSeguridad);

    public void obtenerRubrosMasVulnerables();
    public void obtenerRubrosMenosVulnerables();
    public float obtenerPorcentajeloTGastronomia();
    public String[] obtenerBancosMayorPresupuestoSeguridad();






}

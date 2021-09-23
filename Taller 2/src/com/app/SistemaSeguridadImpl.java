package com.app;

import ucn.ArchivoEntrada;
import ucn.Registro;
import ucn.StdOut;

import java.io.IOException;
import java.util.Scanner;


public class SistemaSeguridadImpl implements SistemaSeguridad {
    /**Declaramos los Atributos de esta implemnts*/
    private ListaVulnerabilidad listaVulnerabilidad;
    private ListaCliente listaCliente;
    private ListaEvento listaEvento;

    /**Constructor de la CLase Impl*/
    public SistemaSeguridadImpl() {
        //Se sobredimensiono las listas
        this.listaVulnerabilidad = new ListaVulnerabilidad(999);
        this.listaCliente = new ListaCliente(999);
        this.listaEvento = new ListaEvento(999);
    }

    /**
     * Son para llamar y modificar
     * get() y Set()
     */
    public ListaVulnerabilidad getListaVulnerabilidad() {
        return listaVulnerabilidad;
    }

    public void setListaVulnerabilidad(ListaVulnerabilidad listaVulnerabilidad) {
        this.listaVulnerabilidad = listaVulnerabilidad;
    }

    public ListaCliente getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ListaCliente listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ListaEvento getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(ListaEvento listaEvento) {
        this.listaEvento = listaEvento;
    }

    /**
     * Obtiene Cliente por pantalla y arroja los datos
     * @param rubro
     * @return
     */
    @Override
    public String[] obtenerCLienteRubro(String rubro) {

        /**
         //listaCliente[0] = ;
         Cliente nuevoCLiente = listaCliente.getListaCliente()[0];

         for (int i = 0; i < listaEvento.getCantEventos(); i++) {
         Evento evento_x = listaEvento.getListaEvento()[i];
         StdOut.println(evento_x.getIdVulnerabilidad());
         }

         StdOut.println(nuevoCLiente.getNombre());
         */


        //Banco banco = new Banco(identificadorCliente,nombreCliente,rubro,numeroClienteHora_B, numeroClienteBoveda, presupuestoSeguridad_B);
        //Cliente x2 = (Cliente) banco; //trato al banco como si fuera un cliente

        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese el RUBRO:     ");
        String rubroPorPantalla=teclado.next();

        listaCliente.buscarClienteRubro(rubroPorPantalla);

        Cliente nuevoCliente = this.listaCliente.buscarClienteRubro(rubroPorPantalla);
        if(nuevoCliente == null){
            StdOut.println("El rubro no existe");
            return null;
        }

        for (int i = 0; i < listaCliente.getCantCliente(); i++) {
            Cliente cliente = listaCliente.getListaCliente()[i];
            if (rubroPorPantalla.equalsIgnoreCase(cliente.getRubro())) {
                StdOut.println("Numero Identificador: "+cliente.getIdentificador()+"\nNombre Cliente:       "+cliente.getNombre()+"\nRubro:                "+cliente.getRubro()+"\nFactorRiesgo:         "+cliente.getRiesgo());

                //Esto es un adicional
                StdOut.println(listaCliente.buscarClienteRubro(rubroPorPantalla));
            }
        }
        return new String[0] ;
    }

    /**
     * Obtien clientes
     */
    @Override
    public void obtenerCLiente() {
        for (int i = 0; i < listaCliente.getCantCliente(); i++) {
            Cliente cliente = listaCliente.getListaCliente()[i];
            StdOut.println("_____________________");
            StdOut.println("Numero Identificador: "+cliente.getIdentificador()+"\nNombre Cliente:       "+cliente.getNombre()+"\nRubro:                "+cliente.getRubro()+"\nFactorRiesgo:         "+cliente.getRiesgo());
        }listaCliente.toString();
    }

    /**
     * Metodo Obtiene vulnerabilidad imprime por pantalla
     * @param identificador
     * @param tipo
     * @param fecha
     */
    @Override
    public void obtenerVulnerabilidad(String identificador, String tipo, String fecha) {
        for (int i = 0; i <listaVulnerabilidad.getCantVuln() ; i++) {
            Vulnerabilidad vulnerabilidad = listaVulnerabilidad.getListaVuln()[i];
            StdOut.println("_____________________________________");
            StdOut.println("Identificador: "+vulnerabilidad.getIdentificador()+"\nTipo Vulnerabilidad: "+vulnerabilidad.getTipo()+"\nFecha: "+vulnerabilidad.getFecha());
        }
    }

    /**
     * Agrega al sistema una nueva vulnerabilidad
     * @param identificador
     * @param tipo
     * @param fecha
     * @return
     */
    @Override
    public boolean agregarVulnerabilidad(String identificador, String tipo, String fecha) {


        Vulnerabilidad aux = this.listaVulnerabilidad.buscarVulnerabilidad(identificador);

        if (aux == null){
            //StdOut.println(" **** ERROR ****");
            //return false;
            Cliente cliente = listaCliente.buscarClienteIdentificador(identificador);

            Vulnerabilidad vulnerabilidad = new Vulnerabilidad(identificador, tipo, fecha);
            return listaVulnerabilidad.agregarVulnerabilidad(vulnerabilidad);



        }else {
            StdOut.println("**Error**");
            return false;
        }

        /**
         * Imprime por pantalla los eventos
         */
    }
    @Override
    public void obtenerEventos() {
        for (int i = 0; i <listaEvento.getCantEventos() ; i++) {
            Evento evento = listaEvento.getListaEvento()[i];
            StdOut.println(evento.toString());
        }
    }
//No se puedo usar adecuadamente
    @Override
    public boolean agregarEvento(String fecha, String idCliente, String idVulnerabilidad, String plataforma) {
        return false;
    }
    @Override
    public boolean agregarGastronomia(String identificador, String nombre, String rubro, int clientePorHora, int dispositivoloT, int cajasRegistradoras) {
        return false;
    }
    @Override
    public boolean agregarBanco(String identificador, String nombre, String rubro, int clientePorHora, int bovedas, int presupuestoSeguridad) {
        return false;
    }
    @Override
    public boolean agregarClienteFabrica(String identificador, String nombre, String rubro, int piezaPorHora, int ingresoPorHora, int dispositivoloT) {
        return false;
    }
    @Override
    public boolean agregarClienteRetalil(String identificador, String nombre, String rubro, int clientePorHora, int ingresoPorHora, int PresupuestoSeguridad) {
        return false;
    }


    /**
     * obtiene rubro mayorr
     */
    @Override
    public void obtenerRubrosMasVulnerables() {
        /*** //IMPRIME el FACTOR de riesgo por RUBRO:
        Cliente nuevoCliente = listaCliente.buscarClienteRubro("fabrica");
        StdOut.println(nuevoCliente.calularRiesgo());**/

        //Se agrega a la lista
        float[] listaRubros = new float[4];//Son 4 rubros
        Cliente rubroGastronomia = listaCliente.buscarClienteRubro("gastronomia");
        listaRubros[0] = rubroGastronomia.calularRiesgo();
        Cliente rubroBanco = listaCliente.buscarClienteRubro("banco");
        listaRubros[1] = rubroBanco.calularRiesgo();
        Cliente rubroFabrica = listaCliente.buscarClienteRubro("fabrica");
        listaRubros[2] = rubroFabrica.calularRiesgo();
        Cliente rubroRetail = listaCliente.buscarClienteRubro("retail");
        listaRubros[3] = rubroRetail.calularRiesgo();

        //Se saca el Mayor
        int posMayor = -1;
        float rubroMayor = Float.MIN_VALUE;//tiene un valor aproximado de 5e-324

        for (int i = 0; i < listaRubros.length; i++) {
            if (rubroMayor < listaRubros[i]) {
                posMayor = i;
                rubroMayor = listaRubros[i];
            }
        }

        //vamos a comparar los datos sacados de la lista mayor con dato MAYOR e imprimirlo por pantalla
        float auxG = rubroGastronomia.calularRiesgo();
        float auxB = rubroBanco.calularRiesgo();
        float auxF = rubroFabrica.calularRiesgo();
        float auxR = rubroRetail.calularRiesgo();

        StdOut.println("Rurbro(s) más Vulnerable(s)");
        if (auxG == rubroMayor){
            StdOut.println("- Gastronomia");
        }
        if (auxB == rubroMayor){
            StdOut.println("- Banco");
        }
        if (auxF == rubroMayor){
            StdOut.println("- Fabrica");
        }
        if (auxR == rubroMayor){
            StdOut.println("- Retail");
        }

        //StdOut.println("Rubro G.: "+auxG+"\n"+"Rubro B.: "+auxB+"\n"+"Rubro F.: "+auxF+"\n"+"Rubro R.: "+auxR+"\n" );

    }
    /**
     * obtiene rubro menor
     */
    @Override
    public void obtenerRubrosMenosVulnerables() {
        //Se agrega a la lista
        float[] listaRubros = new float[4];//Son 4 rubros
        Cliente rubroGastronomia = listaCliente.buscarClienteRubro("gastronomia");
        listaRubros[0] = rubroGastronomia.calularRiesgo();
        Cliente rubroBanco = listaCliente.buscarClienteRubro("banco");
        listaRubros[1] = rubroBanco.calularRiesgo();
        Cliente rubroFabrica = listaCliente.buscarClienteRubro("fabrica");
        listaRubros[2] = rubroFabrica.calularRiesgo();
        Cliente rubroRetail = listaCliente.buscarClienteRubro("retail");
        listaRubros[3] = rubroRetail.calularRiesgo();

        //Se saca el Menor
        int posMenor = -1; //Saca la posicion Menor
        float rubroMenor = Float.MAX_VALUE; //Toma un valor muy alto

        for (int i = 0; i < listaRubros.length; i++) {
            if (rubroMenor > listaRubros[i]) {
                posMenor = i;
                rubroMenor = listaRubros[i];
            }
        }

        //vamos a comparar los datos sacados de la lista creada con el dato menor y imprimirlo por pantalla
        float auxG = rubroGastronomia.calularRiesgo();
        float auxB = rubroBanco.calularRiesgo();
        float auxF = rubroFabrica.calularRiesgo();
        float auxR = rubroRetail.calularRiesgo();

        StdOut.println("Rurbro(s) menos Vulnerable(s)");
        if (auxG == rubroMenor){
            StdOut.println("- Gastronomia");
        }
        if (auxB == rubroMenor){
            StdOut.println("- Banco");
        }
        if (auxF == rubroMenor){
            StdOut.println("- Fabrica");
        }
        if (auxR == rubroMenor){
            StdOut.println("- Retail");
        }
        //StdOut.println("Rubro G.: "+auxG+"\n"+"Rubro B.: "+auxB+"\n"+"Rubro F.: "+auxF+"\n"+"Rubro R.: "+auxR+"\n" );
    }

    @Override
    public float obtenerPorcentajeloTGastronomia() {
        /*** 4.3 Porcentaje de clientes con dispositivos IoT en el rubro de gastronomía: debe mostrar el porcentaje de
         clientes con dispositivos IoT con respecto al total de clientes, solamente para el rubro de gastronomía.
         *///Son 4 rubros y solo dos de ellos tienen dipositivo loT : "Gastronomia" y "Fabrica"


        Cliente gastronmia = listaCliente.buscarClienteRubro("gastronomia");





        return 0;
    }



    @Override
    public String[] obtenerBancosMayorPresupuestoSeguridad() {



        return new String[0];
    }


    /**
     * LEctura de Archivos
     * @throws IOException
     */

    public void leerArchivoVulneravilidad() throws IOException {
        ArchivoEntrada arch = new ArchivoEntrada("vulnerabilidades.txt");
        while(!arch.isEndFile()){
            Registro linea = arch.getRegistro();
            String identificador =linea.getString();
            String tipoVulnerabilidad =linea.getString();
            String fechaRiesgo =linea.getString();

            Vulnerabilidad vulnerabilidad = new Vulnerabilidad(identificador,tipoVulnerabilidad,fechaRiesgo);
            listaVulnerabilidad.agregarVulnerabilidad(vulnerabilidad);

        }//fin de la lectura
    }

    public void leerArchivosEventos() throws IOException {
        /** //Esto nos entrega la fecha Actual. Si existe una nueva vulnerabilidad se colocara la fecha de hoy
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String fechaHoy = formatter.format(date);
         **/
        ArchivoEntrada arch = new ArchivoEntrada("eventos.txt");

        while(!arch.isEndFile()){
            Registro linea = arch.getRegistro();
            String fecha =linea.getString();
            String identificadorCliente =linea.getString();
            String identificadorVulnerabilidad =linea.getString();
            String plataforma =linea.getString();

            if (plataforma.equals("linux") || plataforma.equals("windows") || plataforma.equals("mac") || plataforma.equals("multiple") || plataforma.equals("otro") ) {

                Evento evento = new Evento(fecha,identificadorCliente,identificadorVulnerabilidad,plataforma);
                listaEvento.agregaEvento(evento);
               /**
                for (int i = 0; i < listaVulnerabilidad.getCantVuln(); i++) {
                    Vulnerabilidad vuln_x = listaVulnerabilidad.getListaVuln()[i];

                    if (identificadorVulnerabilidad.equals(vuln_x.getIdentificador())) { // identificadorVulnerabilidad txt = vulnerabilidadEventos[i]

                        //Recien agregamos a la lista de vulnerabilidades
                        Evento evento2 = new Evento(fecha,identificadorCliente,identificadorVulnerabilidad,plataforma);
                        listaEvento.agregaEvento(evento2);
                    }else{
                        //camniarlo la fecha del txt a la fecha de hoy _-_ luego agregarlo a la LISTA de Vulnerabilidades
                        //fecha = fechaHoy;
                    }

                }**/

            }

        }//fin de la lectura

    }
    /**
     * LEctura de Archivos
     * @throws IOException
     */
    public void leerArchivoCliente() throws IOException {        //CLIENTE>>
        ArchivoEntrada arch = new ArchivoEntrada("clientes.txt");
        while(!arch.isEndFile()){
            Registro linea = arch.getRegistro();
            String identificadorCliente =linea.getString();
            String nombreCliente =linea.getString();
            String rubro =linea.getString();
            switch (rubro){
                case "gastronomia":
                    int numeroClienteHora_G = linea.getInt();
                    int numeroDispositivoloT_G =linea.getInt();
                    int numeroCajasRegistradoras=linea.getInt();
                    Gastronomia gastronomia = new Gastronomia(identificadorCliente,nombreCliente,rubro, numeroClienteHora_G,numeroDispositivoloT_G,numeroCajasRegistradoras);
                    listaCliente.agregaCliente(gastronomia);//Agregamos a la Lista de Cliente
                    /** YA no es necesario _-_
                    int x = numeroDispositivoloT_G*numeroDispositivoloT_G;
                    float factor= (numeroClienteHora_G*numeroCajasRegistradoras)+ x;

                    //gastronomia.setRiesgo(factor);
                     **/



                    break;
                case "banco":
                    int numeroClienteHora_B = linea.getInt();
                    int numeroClienteBoveda =linea.getInt();
                    int presupuestoSeguridad_B=linea.getInt();

                    Banco banco = new Banco(identificadorCliente,nombreCliente,rubro,numeroClienteHora_B, numeroClienteBoveda, presupuestoSeguridad_B);
                    listaCliente.agregaCliente(banco);

                    //sacar el Factor de Riesgo
                    //banco.setRiesgo(1);//introducir Factor = x



                    //Cliente x2 = (Cliente) banco; //trato al banco como si fuera un cliente
                                              //Si quieres llamar al Banco tiene que colocarlo al revez: Banco x2 = (Banco) x; algo similar a esto _-_



                    break;
                case "fabrica":
                    int piezasHora = linea.getInt();
                    int ingresoPorHora =linea.getInt();
                    int numeroDispositivoloT_F=linea.getInt();
                    Fabrica fabrica = new Fabrica(identificadorCliente,nombreCliente,rubro,piezasHora,ingresoPorHora,numeroDispositivoloT_F);
                    listaCliente.agregaCliente(fabrica);
                    break;

                case "retail":
                    int numeroClienteDia = linea.getInt();
                    int ingresoNetoHora =linea.getInt();
                    int presupuestoSeguridad_R=linea.getInt();
                    Retail retail = new Retail(identificadorCliente, nombreCliente, rubro, numeroClienteDia,ingresoNetoHora,presupuestoSeguridad_R);
                    listaCliente.agregaCliente(retail);
                    break;
            }


        }//fin de la lectura

    }











}

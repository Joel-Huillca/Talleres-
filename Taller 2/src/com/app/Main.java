package com.app;

import ucn.StdIn;
import ucn.StdOut;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    /**
     * Esta es el Main donde incia todo el programa
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)throws IOException {


        SistemaSeguridadImpl sistema = new SistemaSeguridadImpl();
        menuPrincipal(sistema);

    }

    /**
     * Este es un metodo de menuPrincipal Cuya principal funcion es entregar un menu para el USUARIO
     * @param sistema
     * @throws IOException Es se ocupa debido a la lectura de Archivos
     */
        public static void menuPrincipal(SistemaSeguridadImpl sistema)throws IOException {

        //Esto es para obtener la Fecha Actual
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String fechaHoy = formatter.format(date);


        sistema.leerArchivoCliente();
        sistema.leerArchivosEventos();
        sistema.leerArchivoVulneravilidad();

        boolean fin = false;
        while(!fin){       //Para que siempre este enecendido

            StdOut.println("\n___________BIENVENIDO____________         [Fecha:"+fechaHoy+"]");
            StdOut.println("_______Sistema de Seguridad______" );
            StdOut.println("[1] Cliente \n[2] Vulnerabilidad\n[3] Eventos\n[4] Estadisticas\n[5] Salir" );
            StdOut.print("> Elija una Opcion: ");
            String iniciar = StdIn.readString();

            while (!iniciar.equals("1") && !iniciar.equals("2") && !iniciar.equals("3") && !iniciar.equals("4") && !iniciar.equals("5")) {
                StdOut.println(">> Vuelva a Intentarlo <<");
                StdOut.println("[1] Cliente \n[2] Vulnerabilidad\n[3] Eventos\n[4] Estadisticas\n[5] Salir" );
                StdOut.print("> Elija una Opcion: ");
                iniciar = StdIn.readString();
            }
            switch (iniciar) {
                case "1":
                    StdOut.println("[1] Desplegar Cliente de un espesifico\n[2] Desplegar todos");
                    String opcion1 = StdIn.readString();
                     switch (opcion1){
                         case "1":
                             sistema.obtenerCLienteRubro("");
                             break;
                         case "2":
                             sistema.obtenerCLiente();
                             break;
                     }
                     break;//default:
                       //  StdOut.println("    ***Vuelva a intentarlo***");
                case "2":
                    StdOut.println("[1] Desplegar Vulnerabilidad\n[2] Agregar Vulnerabilidad");
                    String opcion2 = StdIn.readString();
                    switch (opcion2){
                        case "1":
                            sistema.obtenerVulnerabilidad("","","");
                            break;
                        case "2":
                            StdOut.print("Identificador: ");
                            String identificador= StdIn.readString();
                            StdOut.print("Tipo: ");
                            String tipo = StdIn.readString();
                            StdOut.print("Fecha: ");
                            String fecha= StdIn.readString();
                            sistema.agregarVulnerabilidad(identificador,tipo,fecha);
                            break;
                    }
                    break;
                case "3":
                    sistema.obtenerEventos();
                    break;
                case "4":
                    StdOut.println("[1] Rubro(s) más vulnerables\n[2] Rubro(s) con menos vulnerabilidades\n[3] Porcentaje de cliente con deispositivoloT en el rubro Gastronomia\n[4] Mostrar banco con mayor presupuesto de seguridad");
                    String opcion3 = StdIn.readString();
                    switch (opcion3){
                        case "1":
                            sistema.obtenerRubrosMasVulnerables();
                            break;
                        case "2":
                            sistema.obtenerRubrosMenosVulnerables();
                            break;
                        case "3":
                            sistema.obtenerPorcentajeloTGastronomia();

                            break;
                        case "4":
                            sistema.obtenerBancosMayorPresupuestoSeguridad();
                            break;
                    }


                    break;
                case "5":

                    StdOut.println("\n*******************************");
                    StdOut.println("***[A finalizado el sistema]***");
                    fin = true;//cierra el sistema
            }


        }

    }


}

package pkg1.pkg1c.aed.utiles;

import java.util.ArrayList;
import java.util.List;
import pkg1.pkg1c.aed.modelo.Vehiculo;
import pkg1.pkg1c.aed.modelo.Camion;
import pkg1.pkg1c.aed.modelo.Turismo;

public class Listar {

    public static String mostrar(List<Vehiculo> listaVehiculos){
        
       String listaVehiculosTextArea = "";
        int totalCoches = 0;
        int totalCochesAlquilados = 0;
        int totalCamiones = 0;
        int totalCamionesAlquilados = 0;
        
        //-------------------------------------------
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo instanceof Turismo) {
                totalCoches++;
                if(vehiculo.isAlquilado()){
                    totalCochesAlquilados++;
                }
            }

            if (vehiculo instanceof Camion) {
                totalCamiones++;
                if(vehiculo.isAlquilado()){
                    totalCamionesAlquilados++;
                }
            }
        }
        //-------------------------------------------
        
        listaVehiculosTextArea = String.format("--> Total coches : %s\n--> Total coches alquilados : %s\n--> Total camiones : %s\n--> Total camiones alquilados: %s", 
                totalCoches,
                totalCochesAlquilados, 
                totalCamiones, 
                totalCamionesAlquilados);
        
        /*listaVehiculosTextArea = "Total coches : "+ totalCoches+
                                    "\n Total coches alquilados: " + totalCochesAlquilados+
                                        "\n Total camiones: " + totalCamiones+
                                            "\n Total camiones alquilados: " + totalCamionesAlquilados;*/

        return listaVehiculosTextArea;
    }
    
    public static String mostarListaVehiculosAtributos(List<Vehiculo> listaVehiculos){
        
        String listaVehiculosAtributosTextArea="";
        
        for (Vehiculo vehiculo : listaVehiculos) {
            
            if(vehiculo instanceof Turismo){
                listaVehiculosAtributosTextArea += vehiculo.mostrarInformacion();
            }else{
                listaVehiculosAtributosTextArea += vehiculo.mostrarInformacion();
            }
        }
        
        listaVehiculosAtributosTextArea+="\n\n\n######RESUMEN#######"
                        +"\n"+ Listar.mostrar(listaVehiculos);
        
        return listaVehiculosAtributosTextArea;
    }
}
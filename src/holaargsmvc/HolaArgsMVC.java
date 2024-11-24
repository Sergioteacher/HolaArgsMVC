/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holaargsmvc;

import holaargsmvc.unControl.ParaMiControl;
import holaargsmvc.unModelo.MisEstructuras;
import holaargsmvc.unaVista.UnaVista;

/**
 *
 * @author Sergio Teacher
 */
public class HolaArgsMVC {

    /**
     * @param args array con los parámetros de inicio del ejecutable
     */
    public static void main(String[] args) {

        UnaVista Ventanita;
        MisEstructuras MisDatos;

        System.out.println("Iniciando HolaArgsMVC ...");

        Ventanita = new UnaVista();
        MisDatos = new MisEstructuras();

        if(args.length == 0){
            System.out.println("Sin parámetros");
            MisDatos.setCadenita("Un Título muy largo en tiempo de ejecución");
        }else {
            System.out.println("con " + args.length + " parámetros.");
            MisDatos.setCadenita(args[0]);
            if(args.length >= 2){
                MisDatos.setMiColor(args[1]);
                System.out.println(args[1]);
            }
            if(args.length >= 3){
                MisDatos.setEstado(args[2]);
            }
        }

        ParaMiControl Controlando = new ParaMiControl(Ventanita, MisDatos);

        Controlando.iniciando();
    }
    
}

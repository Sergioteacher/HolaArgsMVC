/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holaargsmvc.unControl;
    
import holaargsmvc.unModelo.MisEstructuras;
import holaargsmvc.unaVista.UnaVista;
import java.awt.Color;


/**
 *
 * @author Sergio Teacher
 */
public class ParaMiControl {

    private UnaVista Vent;
    private MisEstructuras LosDatos;

    public ParaMiControl(UnaVista Vent, MisEstructuras LosDatos) {
        this.Vent = Vent;
        this.LosDatos = LosDatos;
    }

/**
* Un método para agrupar acciones.
*/
public void iniciando(){
    Vent.setTitle(LosDatos.getCadenita());
    switch (LosDatos.getMiColor()){
        case "negro":
        Vent.getjPanelCentral().setBackground(Color.BLACK);
        break;
        case "blanco":
        Vent.getjPanelCentral().setBackground(Color.WHITE);
        break;
    default:
        System.out.println("No se carga color.");
        Vent.getjPanelCentral().setBackground(Color.red);
    }

    if(LosDatos.getEstado() == ""){
        Vent.sms("Iniciando la vista ...");
    }else {
        Vent.sms(LosDatos.getEstado());
    }

    Vent.setVisible(true);
}
    
}

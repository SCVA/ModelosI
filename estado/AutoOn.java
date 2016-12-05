/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class AutoOn extends Auto{
    
    AutoOn(){
        this.motorEncendido=true;
        this.motorReposo=false;
        this.bateriaEncendida=true;
        this.energiaAccesorios=true;
        this.rpmMotor=800;
    }
    
    public void getEstado(){
        Muestra muestra= new MuestraConsola();
        AdapterBooleanString adapter= new AdapterBooleanString();
        muestra.mostrar("Estado del auto:");
        muestra.mostrar("Motor Encendido:"+adapter.adaptarBoolean(this.motorEncendido));
        muestra.mostrar("Motor en Reposo:"+adapter.adaptarBoolean(this.motorReposo));
        muestra.mostrar("Batería Encendida:"+adapter.adaptarBoolean(this.bateriaEncendida));
        muestra.mostrar("Energía disponible para Accesorios:"+adapter.adaptarBoolean(this.energiaAccesorios));
        muestra.mostrar("Revoluciones(rpm) del Motor:"+this.rpmMotor+"(rpm)");
    }
}

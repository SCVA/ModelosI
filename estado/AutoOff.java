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
public class AutoOff extends Auto{

    public AutoOff() {
        this.motorEncendido=false;
        this.motorReposo=false;
        this.bateriaEncendida=false;
        this.energiaAccesorios=false;
        this.rpmMotor=0;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class AutoReal extends Auto {

    public AutoReal(String referencia, String codigoTarjeta, String pinAcceso) {
        this.referencia= referencia;
        this.codigoTarjeta= codigoTarjeta;
        this.pinAcceso= pinAcceso;
    }
    
    public void acceder(){
        Muestra muestra= new MuestraConsola();
        muestra.mostrar("Ha ingresado satisfactoriamente al vehículo:"+ this.referencia);
    }
}

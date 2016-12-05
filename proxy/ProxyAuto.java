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
public class ProxyAuto extends Auto {

    private AutoReal autoReal;
    
    public ProxyAuto(String referencia, String codigoTarjeta, String pinAcceso) {
        this.referencia= referencia;
        autoReal= new AutoReal(referencia,codigoTarjeta,pinAcceso);
    }

    public void acceder(String codT, String pin){
        Muestra muestra= new MuestraConsola();
        
        if(codT.equals(autoReal.codigoTarjeta)){
            muestra.mostrar("Código de Tarjeta aceptado");
            if(pin.equals(autoReal.pinAcceso)){
                muestra.mostrar("Pin de Acceso aceptado");
                autoReal.acceder();
            }
            else{
                muestra.mostrar("Pin de Acceso inválido");
            }
        }
        else{
            muestra.mostrar("Código de Tarjeta inválido");
        }
        
        
    }
    
}

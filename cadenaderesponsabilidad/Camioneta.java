/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidad;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class Camioneta extends Auto {
    final double PESOMAX=800;

    public Camioneta(String referencia) {
        super(referencia);
    }

    @Override
    public void caracteristicas(double carga) {
        
        if(carga<=PESOMAX){
            Muestra muestra = new MuestraConsola();
            muestra.mostrar("El auto designado para la entrega es la camioneta: "+this.referencia);
            muestra.mostrar("Carga Máxima:"+PESOMAX+"Kg");
            muestra.mostrar("Carga actual(Kg):"+carga);
            muestra.mostrar("Carga actual(Lb):"+carga*2);
        }else{
            superior.caracteristicas(carga);
        }
        
    }
}

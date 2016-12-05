/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class PruebaBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muestra muestra = new MuestraConsola();
        Auto auto;
        DirectorAuto director = new DirectorAuto();
        director.builder= new AutoGas();
        
        auto=director.construir();
        
        muestra.mostrar("El depósito del auto es:"+auto.getDeposito().getTipoDeposito());
        muestra.mostrar("El motor del auto es:"+auto.getMotor().getTipoMotor());
        
        director.builder= new AutoGasolina();
        auto=director.construir();
        
        muestra.mostrar("El depósito del auto es:"+auto.getDeposito().getTipoDeposito());
        muestra.mostrar("El motor del auto es:"+auto.getMotor().getTipoMotor());
        
        director.builder= new AutoElectrico();
        auto=director.construir();
        
        muestra.mostrar("El depósito del auto es:"+auto.getDeposito().getTipoDeposito());
        muestra.mostrar("El motor del auto es:"+auto.getMotor().getTipoMotor());
    }
    
}

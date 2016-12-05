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
public class PruebaCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muestra muestra = new MuestraConsola();
        
        Auto moto= new Motocicleta("Moto123ABC");
        Auto carro= new Carro("Carro321HJK");
        Auto camioneta= new Camioneta("Camioneta678KLM");
        Auto camion= new Camion("Camion367PLK");
        
        moto.setSuperior(carro);
        carro.setSuperior(camioneta);
        camioneta.setSuperior(camion);
        
        double[] cargas= {80,300,600,1000,7000};
        
        for(double carga:cargas){
            muestra.mostrar("\nPara la carga: "+carga+", Kg se presentan las siguientes características: ");
            
            moto.caracteristicas(carga);
        }
    }
    
}

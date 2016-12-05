/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class PruebaComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muestra muestra= new MuestraConsola();
        Tractomula tractomula = new Tractomula("ABCDEF123");
        Auto carro1= new Carro("C1NJK");
        Auto carro2= new Carro("C2HUO");
        Auto camioneta1= new Camioneta("CT1OPL");
        
        tractomula.agregar(carro1);
        tractomula.agregar(carro2);
        tractomula.agregar(camioneta1);
        
        muestra.mostrar("La referencia del primer vehiculo en la tractomula es: " +tractomula.getAutos().get(0).getReferencia());
        muestra.mostrar("La referencia del segundo vehiculo en la tractomula es: " +tractomula.getAutos().get(1).getReferencia());
        muestra.mostrar("La referencia del tercer vehiculo en la tractomula es: " +tractomula.getAutos().get(2).getReferencia());
        
        tractomula.remover("C1NJK");
        muestra.mostrar("La referencia del primer vehiculo en la tractomula es: " +tractomula.getAutos().get(0).getReferencia());
        
    }

    
    
}

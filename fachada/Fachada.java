/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import Muestras.Muestra;
import Muestras.MuestraConsola;
import java.awt.Color;

/**
 *
 * @author HOME_2
 */
public class Fachada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muestra muestra = new MuestraConsola();
        Auto carroGasolina= new Carro(new MotorGasolina(),new DepositoGasolina());
        ModuloPintado pintado= new ModuloPintado();
        ModuloTanqueado tanqueado= new ModuloTanqueado();
        
        carroGasolina= pintado.pintarAuto(carroGasolina, Color.yellow);
        carroGasolina= tanqueado.tanquearAuto(carroGasolina, 500);
        
        muestra.mostrar(carroGasolina.getColor());
        muestra.mostrar(carroGasolina.getCombustible());
    }
    
}

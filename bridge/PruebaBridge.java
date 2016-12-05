/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import Muestras.Muestra;
import Muestras.MuestraConsola;

/**
 *
 * @author HOME_2
 */
public class PruebaBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muestra muestra= new MuestraConsola();
        Auto carroElectrico= new Carro(new MotorElectrico(), new DepositoElectrico());
        
        carroElectrico.getDeposito().getTipoDeposito();
        carroElectrico.getMotor().getTipoMotor();
        
        muestra.mostrar("El depósito del carro es: "+carroElectrico.getDeposito().getTipoDeposito());
        muestra.mostrar("El motor del carro es: "+carroElectrico.getMotor().getTipoMotor());
        
        Auto camionAGasolina= new Camion(new MotorGasolina(), new DepositoGasolina());
        
        muestra.mostrar("El depósito del camión es: "+camionAGasolina.getDeposito().getTipoDeposito());
        muestra.mostrar("El motor del camión es: "+camionAGasolina.getMotor().getTipoMotor());
        
        
    }
    
}

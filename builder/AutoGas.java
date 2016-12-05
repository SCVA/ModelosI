/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author HOME_2
 */
public class AutoGas extends BuilderAuto {

    @Override
    public Auto buildAuto() {
        Auto autoGas = new Auto(new MotorGas(),new DepositoGas());
         return autoGas;
    }
    
    
    
}

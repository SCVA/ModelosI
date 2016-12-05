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
public class AutoElectrico extends BuilderAuto {

    @Override
    public Auto buildAuto() {
        Auto autoElectrico = new Auto(new MotorElectrico(),new DepositoElectrico());
         return autoElectrico;
    }
    
   
    
}

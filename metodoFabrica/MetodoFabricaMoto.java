/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoFabrica;

/**
 *
 * @author SEBASTIAN
 */
public class MetodoFabricaMoto extends MetodoFabricaCarroceria {

    public Carroceria crearCarroceria() {
        return new CrrceriaMoto();
    }
    
}

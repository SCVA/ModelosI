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
public class PruebaMetodoFabrica {

    static MetodoFabricaCarroceria fabricarCarroceria;
    static Carroceria carroceria;
    
    public static void main(String[] args) {
        int opcion=0;
        
        
        switch(opcion){
            case 1:
                fabricarCarroceria = new MetodoFabricaCarro();
                break;
            case 2:
                fabricarCarroceria = new MetodoFabricaMoto();
                break;
            case 3:
                fabricarCarroceria = new MetodoFabricaCamion();
                break;
            default:
                break;
        }
        carroceria = fabricarCarroceria.crearCarroceria();
    }
    
}

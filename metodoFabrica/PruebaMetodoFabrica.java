/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoFabrica;

import generadorEntradaSalida.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaMetodoFabrica {

    static MetodoFabricaCarroceria fabricarCarroceria;
    static Carroceria carroceria;
    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;
    
    public static void main(String[] args) {
        int opcion=0;
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        adaptadorNumero = new AdaptadorStringInteger();
        generadorInOut.mostrar("Digite la opcion para fabricar: 1.Carro 2.Moto 3.Camion ");
        opcion = adaptadorNumero.getInteger(generadorInOut.getCargador());
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
        generadorInOut.mostrar("Construyo un "+carroceria.getTipo());
    }
}

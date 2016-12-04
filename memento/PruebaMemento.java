/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.awt.Color;
import pesoLigero.*;
import generadorEntradaSalida.*;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaMemento {

    static GenerarInOut generadorInOut;
    
    public static void main(String[] args) {
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        GestorColor gestor = new GestorColor();
        Auto auto = new AutoOn();
        auto.setColor(Color.yellow);
        generadorInOut.mostrar("El color de su auto actualmente es: "+auto.getColor());
        gestor.setMemento(new MomentoColor(auto.getColor()));
        auto.setColor(Color.red);
        generadorInOut.mostrar("El color de su auto se cambio a: "+auto.getColor());
        auto.setColor(gestor.obtenerColor());
        generadorInOut.mostrar("Lamentamos el error, el color de su auto se reestablecio");
        generadorInOut.mostrar("El color de su auto actualmente es: "+auto.getColor());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import generadorEntradaSalida.*;
import java.util.ArrayList;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaSingleton {

    static GenerarInOut generadorInOut;
    static TargetInteger adaptadorNumero;

    public static void main(String[] args) throws InterruptedException {
        int cantUsuarios = 0;
        generadorInOut = new GenerarInOut(new FabricaGrafico());
        adaptadorNumero = new AdaptadorStringInteger();
        generadorInOut.mostrar("Prestamo de Autos por mantenimiento");
        generadorInOut.mostrar("Digite el numero de usuarios, recuerde que solo tenemos 3 autos para prestamo en el momento: ");
        cantUsuarios = adaptadorNumero.getInteger(generadorInOut.getCargador());
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for (int i = 0; i < cantUsuarios; i++) {
            usuarios.add(new Usuario());
            usuarios.get(i).run(AutoPrestado.getAutoPrestado(), 1000);
            generadorInOut.mostrar("El usuario " + (i + 1) + " esta usando el auto " + usuarios.get(i).obtenerNombreAuto());
        }
    }

}

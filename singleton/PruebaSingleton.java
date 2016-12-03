/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author SEBASTIAN
 */
public class PruebaSingleton{
    
    public static void main(String[] args) throws InterruptedException {
        int cantUsuarios = 5;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for(int i = 0; i<cantUsuarios; i++){
            usuarios.add(new Usuario());
            usuarios.get(i).run(AutoPrestado.getAutoPrestado(), 1000);
            System.out.println("Prestamos Hechos: "+(i+1));
        }
    }
    
}

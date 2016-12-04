/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author SEBASTIAN
 */
public class Usuario extends Thread{
    
    AutoPrestado autoReposicion;
    
    public void run(AutoPrestado autoReposicion, int tiempoPrestamo) throws InterruptedException {
        sleep(tiempoPrestamo);
        this.autoReposicion = autoReposicion;
        autoReposicion.setEstadoLibre(true);
    }
    
    public String obtenerNombreAuto(){
        return autoReposicion.getNombre();
    }
    
}

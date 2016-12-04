/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorEntradaSalida;

/**
 *
 * @author SEBASTIAN
 */
public class GenerarInOut {
    /*
        Declaracion de Objetos
    */
    private FabricaAbstractaInOut fabrica;
    private Muestra impresora;
    private Carga cargador;
    
    public GenerarInOut(FabricaAbstractaInOut tipofabrica){
        fabrica = tipofabrica;
        impresora = fabrica.generarMuestra();
        cargador = fabrica.generarCarga();
    }
    
    public void mostrar(String mensaje){
        impresora.mostrar(mensaje);
    }
            
    public String cargar(){
        return cargador.cargar();
    }        

    public Muestra getImpresora() {
        return impresora;
    }

    public Carga getCargador() {
        return cargador;
    }
    
}

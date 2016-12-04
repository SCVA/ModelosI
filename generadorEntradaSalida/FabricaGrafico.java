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
public class FabricaGrafico extends FabricaAbstractaInOut{
    
    /*
        Metodos Creacion Clases Abstractas
    */
    
    public Muestra generarMuestra() {
        return new MuestraGrafico();
    }

    public Carga generarCarga() {
        return new CargaGrafico();
    }
    
}

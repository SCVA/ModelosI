/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorEntradaSalida;
;

/**
 *
 * @author SEBASTIAN
 */
public class AdaptadorStringInteger extends TargetInteger{
    
    public Integer getInteger(Carga cargador) {
        Integer numero;
        numero = Integer.parseInt(cargador.cargar());
        return numero;
    }
    
}

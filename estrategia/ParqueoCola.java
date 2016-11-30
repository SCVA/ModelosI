/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategia;

/**
 *
 * @author SEBASTIAN
 */
public class ParqueoCola extends MovmtoParqueo {

    public int parquear(int posActual) {
        return posActual-1;
    }
    
}

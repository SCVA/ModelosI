/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorEntradaSalida;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class CargaConsola extends Carga{
    /*
        Metodo Obtener
    */
    public String cargar (){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

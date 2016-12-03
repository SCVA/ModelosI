/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import pesoLigero.Auto;
import pesoLigero.Freno;

/**
 *
 * @author SEBASTIAN
 */
public class AutoPrestado extends Auto{

    private static ArrayList<AutoPrestado> autos = new ArrayList<AutoPrestado>();
    private static int contadorAutos = 3; // Por politicas Empresariales
    private static int contadorUsados = 0;
    private static boolean estadoLibre;
    
    private AutoPrestado (){
        this.estadoLibre = false;
    }
    
    public synchronized static AutoPrestado getAutoPrestado() throws InterruptedException{
        for(int i=0;i<contadorAutos;i++){
            if(dimension(i)||i>=autos.size()){
                autos.add(i, new AutoPrestado());
                System.out.print(" - Nuevo Auto");
                contadorUsados++;
                return autos.get(i);
            }
            else{
                if(contadorUsados==contadorAutos){
                    while(comprobarEstados()){}
                    for(int j=0;j<contadorAutos;j++){
                        if(autos.get(j).estadoLibre){
                            return autos.get(j);
                        }
                    }
                }
            }
        }
        return new AutoPrestado();
    }
    
    public static boolean dimension(int i){
        if(i<autos.size()){
            if(autos.get(i)==null){
                return true;
            }
        }
        return false;
    }
    
    public static boolean comprobarEstados(){
        for(int i=0;i<contadorAutos;i++){
            if(autos.get(i).estadoLibre){
                return false;
            }
        }
        return true;
    }

    public boolean isEstadoLibre() {
        return estadoLibre;
    }

    public void setEstadoLibre(boolean estadoLibre) {
        this.estadoLibre = estadoLibre;
    }
    
    public boolean pruebaFrenos(Freno freno) {
        throw new UnsupportedOperationException("No aplicable");
    }

    public void ejecutarEstado() {
        throw new UnsupportedOperationException("No aplicable");
    }
    
    public Object clone() throws CloneNotSupportedException {
    	throw new CloneNotSupportedException("No aplicable"); 
    }
}

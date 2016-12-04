package pruebas;

import entradaSalida.FabricaConsola;
import entradaSalida.FabricaEntradaSalida;
import entradaSalida.Salida;
import observadores.Auto;
import observadores.Observador;
import observadores.ObservadorAuto;

public class PruebaObserver {
	public static void main(String arg[]){
		FabricaEntradaSalida fabricaInOut = new FabricaConsola();
		Salida salida= fabricaInOut.generarSalida();
		
		Auto auto = new Auto();
		Observador observadorAuto = new ObservadorAuto(auto, salida);
		
		auto.setRendimiento(10);
		auto.setAceleracion(10.1);
		auto.setVelocidad(20.3);
		auto.setPosicion(30.4);
	}
}

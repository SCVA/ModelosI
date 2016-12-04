package pruebas;

import entradaSalida.FabricaConsola;
import entradaSalida.FabricaEntradaSalida;
import entradaSalida.Salida;
import visitadores.Auto;
import visitadores.Camion;
import visitadores.Moto;
import visitadores.Taxi;
import visitadores.Visitante;
import visitadores.VisitanteImpuesto;
import visitadores.VisitanteImpuestoFestivo;

public class PruebaVisitor {
	public static void main(String arg[]){
		FabricaEntradaSalida fabricaInOut = new FabricaConsola();
		Salida salida= fabricaInOut.generarSalida();
		
		Auto taxi = new Taxi(250);
		Auto camion = new Camion(300);
		Auto moto = new Moto(100);
		
		Visitante visitante = new VisitanteImpuesto();
		
		salida.imprimir("IMPUESTO NORMAL:\n");
		salida.imprimir("Taxi "+taxi.aceptarVisita(visitante)+"$");
		salida.imprimir("Camion "+camion.aceptarVisita(visitante)+"$");
		salida.imprimir("Moto "+moto.aceptarVisita(visitante));
		
		visitante = new VisitanteImpuestoFestivo();
		
		salida.imprimir("IMPUESTO ESPECIAL:\n");
		salida.imprimir("Taxi "+taxi.aceptarVisita(visitante)+"$");
		salida.imprimir("Camion "+camion.aceptarVisita(visitante)+"$");
		salida.imprimir("Moto "+moto.aceptarVisita(visitante)+"$");
	}
}

package pruebas;

import agregados.Auto;
import agregados.Iterador;
import agregados.Lista;
import agregados.ListaAutos;
import agregados.ListaAutosPorMarca;
import entradaSalida.FabricaConsola;
import entradaSalida.FabricaEntradaSalida;
import entradaSalida.Salida;

public class PruebaIterador {
	public static void main(String arg[]){
		FabricaEntradaSalida fabricaInOut = new FabricaConsola();
		Salida salida= fabricaInOut.generarSalida();
		Lista lista = new ListaAutos();
		String opcion = "2";
		
		switch(opcion){
		case "1":
			break;
		case "2":
			lista = new ListaAutosPorMarca("Chevrolet");
			break;
		}
		
		lista.aniadir(new Auto("Chevrolet","2005"));
		lista.aniadir(new Auto("Ford","1970"));
		lista.aniadir(new Auto("Ford","2000"));
		lista.aniadir(new Auto("Nissan","1994"));
		
		Iterador iterador = lista.crearIterador();
		
		salida.imprimir("Autos Registrados:\n");
		
		while(!iterador.haTerminado()){
			salida.imprimir("Marca: " + iterador.actual().getMarca());
			salida.imprimir("Modelo: "+ iterador.actual().getModelo()+"\n");
			iterador.siguiente();
		}
	}
}

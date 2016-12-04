package pruebas;

import decoradores.Accesorio;
import decoradores.Auto;
import decoradores.CarroEstandar;
import decoradores.DecoradorAutoConAccesorios;
import decoradores.DecoradorAutoDescuento;
import entradaSalida.FabricaConsola;
import entradaSalida.FabricaEntradaSalida;
import entradaSalida.Salida;

public class PruebaDecorador {
	public static void main(String arg[]){
		FabricaEntradaSalida fabricaInOut = new FabricaConsola();
		Salida salida= fabricaInOut.generarSalida();
		Auto autoSinAccesorios = new CarroEstandar(300);
		Accesorio camaraTrasera = new Accesorio(10);
		Auto autoConAccesorios = new DecoradorAutoConAccesorios(autoSinAccesorios, camaraTrasera);
		Auto autoConDescuento = new DecoradorAutoDescuento(autoConAccesorios);
		salida.imprimir("El precio del auto sin accesorios es "+autoSinAccesorios.getPrecio()+"$");
		salida.imprimir("El precio del auto con accesorios es "+autoConAccesorios.getPrecio()+"$");
		salida.imprimir("El precio del auto con descuento de temporada es "+autoConDescuento.getPrecio()+"$");
	}
}

package pruebas;

import entradaSalida.FabricaConsola;
import entradaSalida.FabricaEntradaSalida;
import entradaSalida.Salida;
import motor_dispensador.Deposito;
import motor_dispensador.FabricaElectrica;
import motor_dispensador.FabricaGasolina;
import motor_dispensador.FabricaPartes;
import motor_dispensador.Motor;

public class PruebaPlantilla {
	public static void main(String arg[]){
		FabricaEntradaSalida fabricaInOut = new FabricaConsola();
		Salida salida= fabricaInOut.generarSalida();
		FabricaPartes fabricaPartes = new FabricaGasolina();
		Deposito deposito = fabricaPartes.crearDeposito();
		Motor motor = fabricaPartes.crearMotor();
		
		//Se carga el deposito de gasolina
		deposito.cargar(10000);
		//Se realiza el movimiento
		motor.realizarMovimiento(deposito, 10);
		motor.realizarMovimiento(deposito, 20);
		
		salida.imprimir("La posicion es " + motor.getPosicion());
		salida.imprimir("Quedaron " + deposito.getEnergiaRestante() + " unidades de gasolina en el deposito");
		
		fabricaPartes = new FabricaElectrica();
		
		motor = fabricaPartes.crearMotor();
		deposito = fabricaPartes.crearDeposito();
		
		//Se carga el deposito de gasolina
		deposito.cargar(10000);
		//Se realiza el movimiento
		motor.realizarMovimiento(deposito, 10);
		motor.realizarMovimiento(deposito, 20);
		
		salida.imprimir("La posicion es " + motor.getPosicion());
		salida.imprimir("Quedaron " + deposito.getEnergiaRestante() + " unidades de energia en el deposito");
	}
}

package pruebas;

import motor_dispensador.Deposito;
import motor_dispensador.FabricaElectrica;
import motor_dispensador.FabricaGasolina;
import motor_dispensador.FabricaPartes;
import motor_dispensador.Motor;

public class PruebaFabricaAbstracta {
	static FabricaPartes fabrica;
	static Deposito deposito;
	static Motor motor;
	
	public static void main(String arg[]) {
		int opcion = 0;

		switch (opcion) {
			case 1:
				fabrica = new FabricaGasolina();
				break;
			case 2:
				fabrica = new FabricaElectrica();
				break;
			default:
				break;
		}
		
		deposito = fabrica.crearDeposito();
		motor = fabrica.crearMotor();
	}
}

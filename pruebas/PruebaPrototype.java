package pruebas;

import java.util.ArrayList;

import auto.Auto;
import motor_dispensador.Deposito;
import motor_dispensador.FabricaElectrica;
import motor_dispensador.FabricaPartes;
import motor_dispensador.Motor;

//Clonación de un auto electrico
public class PruebaPrototype {
	static FabricaPartes fabrica = new FabricaElectrica();
	static Deposito deposito;
	static Motor motor;
	static Auto auto;
	
	public static void main(){
		deposito = fabrica.crearDeposito();
		motor = fabrica.crearMotor();
		auto = new Auto(motor, deposito);
		ArrayList<Auto> copias = new ArrayList<Auto>();
		
		//Se hacen 10 copias
		for(int i = 0; i < 10; i++){
			copias.add(auto.clonar());
		}
	}
}

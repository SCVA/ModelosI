package motor_dispensador;

public class FabricaGasolina extends FabricaPartes{
	public FabricaGasolina(){
		
	}
	
	@Override
	public Deposito crearDeposito() {
		dispensador = new DepositoGasolina();
		return dispensador;
	}

	@Override
	public Motor crearMotor() {
		motor = new MotorGasolina();
		return motor;
	}
}

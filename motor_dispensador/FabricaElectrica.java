package motor_dispensador;

public class FabricaElectrica extends FabricaPartes{
	public FabricaElectrica(){
		
	}
	
	@Override
	public Deposito crearDeposito() {
		dispensador = new DepositoElectrico();
		return dispensador;
	}

	@Override
	public Motor crearMotor() {
		motor = new MotorElectrico();
		return motor;
	}
}

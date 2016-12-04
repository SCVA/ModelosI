package motor_dispensador;

public abstract class FabricaPartes {
	protected Deposito dispensador;
	protected Motor motor;
	
	public FabricaPartes(){
		
	}
	
	public abstract Deposito crearDeposito();
	public abstract Motor crearMotor();
}

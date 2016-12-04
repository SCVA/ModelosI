package motor_dispensador;

public class MotorElectrico extends Motor{
	private boolean conectado = false;
	
	public MotorElectrico(){
		
	}
	
	@Override
	public void encender(Deposito deposito) {
		if(deposito.comprobarEnergia(10)){
			deposito.restarEnergia(10);
			conectado = true;
			encendido = true;
		}
	}

	@Override
	public void mover(Deposito deposito, int distancia) {
		if(encendido && conectado && deposito.comprobarEnergia(distancia*5)){
			deposito.restarEnergia(distancia*5);
			posicion += distancia;
		}
	}

	@Override
	public void apagar() {
		encendido = false;
		conectado = false;
	}

	@Override
	public Motor clonar() {
		return new MotorElectrico();
	}
}

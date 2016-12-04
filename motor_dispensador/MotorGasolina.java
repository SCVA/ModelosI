package motor_dispensador;

public class MotorGasolina extends Motor{
	public MotorGasolina(){
		
	}
	
	public void encender(Deposito deposito) {
		if(deposito.comprobarEnergia(20)){
			deposito.restarEnergia(20);
			encendido = true;
		}
	}

	@Override
	public void mover(Deposito deposito, int distancia) {
		if(encendido && deposito.comprobarEnergia(distancia*10)){
			deposito.restarEnergia(distancia*10);
			posicion += distancia;
		}
	}

	@Override
	public void apagar() {
		encendido = false;
	}

	@Override
	public Motor clonar() {
		return new MotorGasolina();
	}
}

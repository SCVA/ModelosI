package motor_dispensador;

public class DepositoGasolina extends Deposito{
	public DepositoGasolina(){
		
	}

	@Override
	public void cargar(int cantidad) {
		energiaPrincipal += cantidad;
	}

	@Override
	public void restarEnergia(int cantidad) {
		if(comprobarEnergia(cantidad)){
			energiaPrincipal -= cantidad;
		}
	}
	
	@Override
	public boolean comprobarEnergia(int cantidad) {
		if(cantidad<energiaPrincipal){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public Deposito clonar() {
		return new DepositoGasolina();
	}

	@Override
	public int getEnergiaRestante() {
		return energiaPrincipal;
	}
}

package motor_dispensador;

public class DepositoElectrico extends Deposito{
	private int energiaReserva;
	
	public DepositoElectrico(){
		
	}
	
	public DepositoElectrico(int energiaPrincipal,int energiaReserva){
		this.energiaPrincipal = energiaPrincipal;
		this.energiaReserva = energiaReserva;
	}
	
	@Override
	public void cargar(int cantidad) {
		energiaPrincipal += cantidad;
		energiaReserva = 10;
	}

	@Override
	public void restarEnergia(int cantidad) {
		if(comprobarEnergia(cantidad)){
			if(energiaPrincipal>=cantidad){
				energiaPrincipal-=cantidad;
			}else{
				energiaReserva -= (cantidad-energiaPrincipal);
				energiaPrincipal = 0;
			}
		}
	}
	
	@Override
	public boolean comprobarEnergia(int cantidad) {
		if(cantidad<(energiaReserva+energiaPrincipal)){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public Deposito clonar() {
		return new DepositoElectrico();
	}

	@Override
	public int getEnergiaRestante() {
		return energiaReserva+energiaPrincipal;
	}
}

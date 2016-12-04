package motor_dispensador;

public abstract class Deposito {
	protected int energiaPrincipal;
	
	public Deposito(){
		
	}
	
	public abstract void cargar(int cantidad);
	
	public abstract void restarEnergia(int cantidad);
	
	public abstract boolean comprobarEnergia(int cantidad);
	
	public abstract int getEnergiaRestante();
	
	public abstract Deposito clonar();
}

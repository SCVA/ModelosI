package motor_dispensador;

public abstract class Motor {
	protected boolean encendido = false;
	protected int posicion = 0;
	
	public Motor(){
		
	}
	
	public final void realizarMovimiento(Deposito deposito, int distacia){
		encender(deposito);
		mover(deposito, distacia);
		apagar();
	}
	
	protected abstract void encender(Deposito deposito);
	protected abstract void mover(Deposito deposito, int distancia);
	protected abstract void apagar();
	
	public abstract Motor clonar();

	public boolean isEncendido() {
		return encendido;
	}

	public int getPosicion() {
		return posicion;
	}
}

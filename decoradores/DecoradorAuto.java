package decoradores;

public abstract class DecoradorAuto extends Auto {
	Auto referenciaAuto;
	
	public DecoradorAuto(){
		
	}

	@Override
	public abstract double getPrecio();
}

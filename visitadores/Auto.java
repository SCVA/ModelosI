package visitadores;

public abstract class Auto {
	protected double precio;
	
	public Auto(){
		
	}
	
	public abstract double aceptarVisita(Visitante visitante);
	
	public double getPrecio(){
		return precio;
	}
}

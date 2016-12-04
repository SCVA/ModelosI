package visitadores;

public class Camion extends Auto{
	public Camion(){
		
	}
	
	public Camion(double precio){
		this.precio = precio;
	}

	@Override
	public double aceptarVisita(Visitante visitante) {
		return visitante.visit(this);
	}
}

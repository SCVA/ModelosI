package visitadores;

public class Taxi extends Auto{
	public Taxi(){
		
	}
	
	public Taxi(double precio){
		this.precio = precio;
	}

	@Override
	public double aceptarVisita(Visitante visitante) {
		return visitante.visit(this);
	}

}

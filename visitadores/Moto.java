package visitadores;

public class Moto extends Auto{
	public Moto(){
		
	}
	
	public Moto(double precio){
		this.precio = precio;
	}

	@Override
	public double aceptarVisita(Visitante visitante) {
		return visitante.visit(this);
	}
}

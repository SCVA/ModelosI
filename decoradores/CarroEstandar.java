package decoradores;

public class CarroEstandar extends Auto{
	public CarroEstandar(double precio){
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return precio;
	}
}

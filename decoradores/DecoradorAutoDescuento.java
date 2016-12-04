package decoradores;

public class DecoradorAutoDescuento extends DecoradorAuto{
	public DecoradorAutoDescuento(){
		
	}
	
	public DecoradorAutoDescuento(Auto auto){
		referenciaAuto = auto;
	}

	@Override
	public double getPrecio() {
		return referenciaAuto.getPrecio()*0.9;
	}
}

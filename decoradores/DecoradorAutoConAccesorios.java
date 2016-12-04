package decoradores;

public class DecoradorAutoConAccesorios extends DecoradorAuto{
	private Accesorio accesorio;
	
	public DecoradorAutoConAccesorios(){
		
	}
	
	public DecoradorAutoConAccesorios(Auto auto, Accesorio accesorio){
		referenciaAuto = auto;
		this.accesorio = accesorio;
	}

	@Override
	public double getPrecio() {
		return referenciaAuto.getPrecio()+accesorio.getPrecio();
	}
}

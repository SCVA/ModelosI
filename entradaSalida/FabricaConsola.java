package entradaSalida;

public class FabricaConsola extends FabricaEntradaSalida{

	public FabricaConsola(){
		
	}
	
	@Override
	public Entrada generarEntrada() {
		entrada = new EntradaConsola();
		return entrada;
	}

	@Override
	public Salida generarSalida() {
		salida = new SalidaConsola();
		return salida;
	}

}

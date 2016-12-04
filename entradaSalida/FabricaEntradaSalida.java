package entradaSalida;

public abstract class FabricaEntradaSalida {
	protected Entrada entrada;
	protected Salida salida;
	
	public FabricaEntradaSalida(){
		
	}
	
	public abstract Entrada generarEntrada();
	public abstract Salida generarSalida();
}

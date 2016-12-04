package entradaSalida;

public class SalidaConsola extends Salida{

	public SalidaConsola(){
		
	}
	
	@Override
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
	
}

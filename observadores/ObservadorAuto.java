package observadores;

import entradaSalida.Salida;

public class ObservadorAuto implements Observador{
	private int rendimiento = 0;
	private double aceleracion = 0;
	private double velocidad = 0;
	private double posicion = 0;
	
	private Sujeto auto;
	private Salida salida;
	
	public ObservadorAuto(){
		
	}
	
	public ObservadorAuto(Sujeto auto, Salida salida){
		this.auto = auto;
		this.salida = salida;
		this.auto.adscribir(this);
	}
	
	@Override
	public void actualizar(int rendimiento, double ac, double vel, double pos) {
		this.rendimiento = rendimiento;
		this.aceleracion = ac;
		this.velocidad = vel;
		this.posicion = pos;
		mostrarCambio();
	}
	
	public void mostrarCambio(){
		salida.imprimir("Se ha presentado un cambio: \n");
		salida.imprimir("Rendimiento = "+rendimiento+"%");
		salida.imprimir("Aceleracion = "+aceleracion+" (m/s^2)");
		salida.imprimir("Velocidad = "+velocidad+" (m/s)");
		salida.imprimir("Posicion = "+posicion+" (m)\n");
	}
}

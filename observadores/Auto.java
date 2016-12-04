package observadores;

import java.util.ArrayList;

public class Auto implements Sujeto{
	private int rendimiento = 0;
	private double aceleracion = 0;
	private double velocidad = 0;
	private double posicion = 0;
	
	private ArrayList<Observador> observadores;
	
	public Auto(){
		observadores = new ArrayList<Observador>();
	}
	
	@Override
	public void adscribir(Observador observador) {
		observadores.add(observador);
	}
	
	@Override
	public void quitar(Observador observador) {
		observadores.remove(observador);
	}
	
	@Override
	public void notificar() {
		for(Observador observador: observadores){
			observador.actualizar(rendimiento, aceleracion, velocidad, posicion);
		}
	}

	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
		notificar();
	}

	public void setAceleracion(double aceleracion) {
		this.aceleracion = aceleracion;
		notificar();
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		notificar();
	}

	public void setPosicion(double posicion) {
		this.posicion = posicion;
		notificar();
	}
	
	
}

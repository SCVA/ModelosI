package visitadores;

public abstract class Visitante {
	public abstract double visit(Moto moto);
	public abstract double visit(Taxi taxi);
	public abstract double visit(Camion camion);
}

package visitadores;

public class VisitanteImpuesto extends Visitante{

	@Override
	public double visit(Moto moto) {
		return moto.getPrecio()*(1.20);
	}

	@Override
	public double visit(Taxi taxi) {
		return taxi.getPrecio()*(1.30);
	}

	@Override
	public double visit(Camion camion) {
		return camion.getPrecio()*(1.50);
	}
	
}

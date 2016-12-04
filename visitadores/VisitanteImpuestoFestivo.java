package visitadores;

public class VisitanteImpuestoFestivo extends Visitante{

	@Override
	public double visit(Moto moto) {
		return moto.getPrecio()*(1.05);
	}

	@Override
	public double visit(Taxi taxi) {
		return taxi.getPrecio()*(1.20);
	}

	@Override
	public double visit(Camion camion) {
		return camion.getPrecio()*(1.30);
	}

}

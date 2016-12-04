package agregados;

import java.util.ArrayList;

public class IteradorListaAutos implements Iterador{
	
	private ArrayList<Auto> autos;
	private int indice;
	
	public IteradorListaAutos(ArrayList<Auto> autos){
		this.autos = autos; 
		primero();
	}
	
	@Override
	public void primero() {
		indice = 0;
	}

	@Override
	public void siguiente() {
		indice++;
	}

	@Override
	public Auto actual() {
		return autos.get(indice);
	}

	@Override
	public boolean haTerminado() {
		if(indice>=autos.size()){
			return true;
		}else{
			return false;
		}
	}
}

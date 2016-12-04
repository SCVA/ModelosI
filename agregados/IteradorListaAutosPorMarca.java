package agregados;

import java.util.ArrayList;

public class IteradorListaAutosPorMarca implements Iterador{
	private ArrayList<Auto> autos;
	private String marcaBuscada;
	private int indice;
	
	public IteradorListaAutosPorMarca(ArrayList<Auto> autos, String marca){
		this.autos = autos; 
		marcaBuscada = marca;
		primero();
	}
	
	@Override
	public void primero() {
		indice = 0;
		while(!haTerminado()&&actual()==null){
			indice++;

		}
	}

	@Override
	public void siguiente() {
		indice ++;
		while(!haTerminado()&&actual()==null){
			indice++;
		}
	}

	@Override
	public Auto actual() {
		String marca = autos.get(indice).getMarca();
		if(marca.equals(marcaBuscada)){
			return autos.get(indice);
		}
		return null;
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

package agregados;

import java.util.ArrayList;

public class ListaAutosPorMarca extends Lista{
	private ArrayList<Auto> listaAutos = new ArrayList<Auto>();
	private String marcaBuscada;
	
	public ListaAutosPorMarca(){
		
	}
	
	public ListaAutosPorMarca(String marca){
		marcaBuscada = marca;
	}

	@Override
	public Iterador crearIterador() {
		return new IteradorListaAutosPorMarca(listaAutos, marcaBuscada);
	}
	
	@Override
	public void aniadir(Auto auto) {
		listaAutos.add(auto);
	}
}

package agregados;

import java.util.ArrayList;

public class ListaAutos extends Lista{
	private ArrayList<Auto> listaAutos = new ArrayList<Auto>();
	
	public ListaAutos(){
		
	}

	@Override
	public Iterador crearIterador() {
		return new IteradorListaAutos(listaAutos);
	}
	
	@Override
	public void aniadir(Auto auto) {
		listaAutos.add(auto);
	}
}

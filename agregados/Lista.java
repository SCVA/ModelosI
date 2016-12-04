package agregados;

public abstract class Lista {
	public Lista(){
		
	}
	
	public abstract Iterador crearIterador();
	
	public abstract void aniadir(Auto auto);
}

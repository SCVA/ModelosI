package observadores;

public interface Sujeto {
	public void adscribir(Observador observador);
	public void quitar(Observador observador);
	public void notificar();
}

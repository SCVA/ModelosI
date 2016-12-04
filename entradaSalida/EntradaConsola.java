package entradaSalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaConsola extends Entrada{

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public String capturar() {
		String auxiliar = "";
		try {
			auxiliar = entrada.readLine();
		} catch (IOException e) {
		}
		return auxiliar;
	}

}

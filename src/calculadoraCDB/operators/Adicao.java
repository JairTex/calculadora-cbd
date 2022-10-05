package calculadoraCDB.operators;

import java.util.List;

public class Adicao extends Operacao{ 
	public static double adicionar(List<Double> valoresASomar) {
		double resultado = 0;
		for (double valor : valoresASomar) {
			resultado += valor;
		}
		return resultado;
	}
	
}

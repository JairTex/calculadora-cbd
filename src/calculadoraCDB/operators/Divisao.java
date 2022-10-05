package calculadoraCDB.operators;

import java.util.List;

public class Divisao extends Operacao{
	public static double dividir(List<Double> valoresADividir) {
		double resultado = valoresADividir.get(0);
		
		for (double valor : valoresADividir) {
			if(valor != resultado) {
				resultado /= valor;
			}
		}
		
		return resultado;
	}

}

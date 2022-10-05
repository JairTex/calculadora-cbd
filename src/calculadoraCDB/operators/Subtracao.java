package calculadoraCDB.operators;

import java.util.List;

public class Subtracao extends Operacao{
	public static double subtrair(List<Double> valoresASubtrair) {
		double resultado = valoresASubtrair.get(0);
		
		for (double valor : valoresASubtrair) {
			if(valor != resultado) {
				resultado -= valor;
			}
		}
		
		return resultado;
	}
}

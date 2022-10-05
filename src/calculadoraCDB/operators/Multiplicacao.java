package calculadoraCDB.operators;

import java.util.List;

public class Multiplicacao extends Operacao{
	public static double multiplicar(List<Double> valoresAMultiplicar) {
		double resultado = 1;
		for (double valor : valoresAMultiplicar) {
			resultado *= valor;
		}
		return resultado;
	}
}

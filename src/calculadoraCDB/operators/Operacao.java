package calculadoraCDB.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacao {
	public static List<Double> receberValores(){
		List<Double> valores = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double valorUm =  sc.nextDouble();
		
		System.out.println("Digite outro numero: ");
		double valorDois = sc.nextDouble();
		
		valores.add(valorUm);
		valores.add(valorDois);
		
		sc.close();
		
		return valores;
		
	} 
	
}

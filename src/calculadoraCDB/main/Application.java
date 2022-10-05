package calculadoraCDB.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculadoraCDB.operators.Adicao;
import calculadoraCDB.operators.Divisao;
import calculadoraCDB.operators.Multiplicacao;
import calculadoraCDB.operators.Subtracao;

public class Application {	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n---------- MENU PRINCIPAL ----------\n"
						+ " 1 ) Adição\n"
						+ " 2 ) Subtração\n"
						+ " 3 ) Multiplicação\n"
						+ " 4 ) Divisão\n"
						+ " 5 ) Sair\n");
		System.out.println("------------------------------------\n");
		
		int option = Integer.parseInt(sc.nextLine());
		
		switch (option) {
		case 1: {
			try {
				double resultado = Adicao.adicionar(Adicao.receberValores());
				System.out.println("O resultado da adição é " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Apenas numeros são permitidos!\n" + e);
			}
			break;
			
		}
		case 2: {
			try {
				double resultado = Subtracao.subtrair(Subtracao.receberValores());
				System.out.println("O resultado da subtração é " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Apenas numeros são permitidos!\n" + e);
			}
			break;
			
		}
		case 3: {
			try {
				double resultado = Multiplicacao.multiplicar(Multiplicacao.receberValores());
				System.out.println("O resultado da multiplicação é " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Apenas numeros são permitidos!\n" + e);
			}
			break;

		}
		case 4: {
			try {
				double resultado = Divisao.dividir(Divisao.receberValores());
				System.out.println("O resultado da divisão é " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Apenas numeros são permitidos!\n" + e);
			} 
			break;
			
		}
		case 5: {
			break;
		}
		default:
			System.out.println("Selecione uma opção válida");
		}
		sc.close();
	}

}

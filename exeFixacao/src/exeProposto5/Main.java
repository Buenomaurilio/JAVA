package exeProposto5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O C�DIGO DA PE�A1: ");
		int peca1 = sc.nextInt();
		System.out.println("DIGITE O N�MERO DE PE�AS1: ");
		int numP1 = sc.nextInt();
		System.out.println("DIGITE O VALOR UNIT�RIO DA PE�A1: ");
		float valor1 = sc.nextFloat();
		System.out.println("DIGITE O C�DIGO DA PE�A2: ");
		int peca2 = sc.nextInt();
		System.out.println("DIGITE O N�MERO DE PE�AS2: ");
		int numP2 = sc.nextInt();
		System.out.println("DIGITE O VALOR UNIT�RIO DA PE�A2: ");
		float valor2 = sc.nextFloat();
		
		
		float soma = valor1 * numP1 + valor2 * numP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",soma);
	
		sc.close();
	}

}

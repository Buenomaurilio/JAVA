package exeProposto2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Raio:");
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double Area = pi * (raio * raio);
		
		System.out.printf("A= %.4f", Area);
		
		sc.close();
	}

}

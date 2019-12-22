package exeProposto4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O NÚMERO DO FUNCIONÁRIO: ");
		int NUMBER = sc.nextInt();
		System.out.println("DIGITE  O NÚMERO DE HORAS TRABALHADAS: ");
		float horasT = sc.nextFloat();
		System.out.println("DIGITE O VALOR POR HORA: ");
		float pHora = sc.nextFloat();
		
		float salary = horasT * pHora; 
		
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f", salary);
		sc.close();
	}

}

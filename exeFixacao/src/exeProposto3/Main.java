package exeProposto3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE OS VALORES: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		 
		
		System.out.println("DIFERECA = " + diferenca);
		sc.close();
	}

}

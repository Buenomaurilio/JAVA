package flutuante;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		java.util.Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		System.out.println("Voc� digitou: " + x);
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rect = new rectangle();
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", rect.area());
		System.out.printf("PERIMETER = %.2f\n", rect.perimetr());
		System.out.printf("DIAGONAL = %.2f", rect.diagonal());
		
		
		sc.close();

	}

}

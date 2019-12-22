package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("name: ");
		student.name = sc.nextLine();
		System.out.println("Nota1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Nota2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Nota3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f\n" + student.finalGrade());
		
		sc.close();
	}

}

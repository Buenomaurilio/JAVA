import java.util.Locale;
import java.util.Scanner;
public class exe1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int x = sc.nextInt();
		
		if (x >= 0 ) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}

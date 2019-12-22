import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int COD = sc.nextInt();
		Double QNT = sc.nextDouble();
		
		double   TOTAL = 0;
		
		if ( COD == 1) {
			TOTAL = QNT * 4.0;
		}
		if (COD == 2) {
			TOTAL = QNT * 4.5;
		}
		if (COD == 3) {
			TOTAL = QNT * 5.0;
		}
		if (COD == 4) {
			TOTAL = QNT * 2.0;
		}
		if (COD == 5) {
			TOTAL = QNT * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f\n",TOTAL);
		
		
		sc.close();
	}

}

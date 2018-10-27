package programskaResenja;
import java.util.Scanner;

// Program izracunava hipotenuzu pravouglog trougla 

public class Hipotenuza {

	public static void main (String args []) {
		double x, y, z;
		
		Scanner tastatura = new Scanner (System.in);
		System.out.println("Program izracunava hipotenuzu pravouglog trougla!");
		System.out.println("Unesite duzinu prve katete: ");
		x = tastatura.nextInt();
		System.out.println("Unesite duzinu druge katete ");
		y = tastatura.nextInt();
		z = Math.sqrt (x * x + y * y);
		System.out.print("Hipotenuza pravouglog trougla je:");
		System.out.printf("%8.2f\n", z);
	}
}

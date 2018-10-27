package programskaResenja;
// Program izracunava obim i povrsinu kruga na osnovu unetog poluprecnika


import java.util.Scanner;

public class PiOkruga {

	public static void main(String args[]) {
		
		double Povrsina, Obim;
		
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Program izracunava povrsinu i obim kruga");
		System.out.println("Unesite duzinu poluprecnika kruga: ");
		double r = tastatura.nextDouble();

		Povrsina = r * r * Math.PI;
		Obim = 2 * r * Math.PI;
		System.out.println("Obim kruga je: ");
		System.out.println(Obim);
		System.out.println("Povrsina kruga je: ");
		System.out.println(Povrsina);

	}
}

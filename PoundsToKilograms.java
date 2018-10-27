package programskaResenja;
// program konvertuje pounds u kilograme
import java.util.Scanner;

public class PoundsToKilograms {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println ("Program konvertuje pounds u kilograme!");
		System.out.print("Unesite broj u pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * 0.454;
		System.out.print(pounds + " pounds je " + kilograms + " kilograma");
	}
}

package programskaResenja;
import java.util.Scanner;
public class Ostatak {

	public static void main (String args []) {
		Scanner tastatura = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.println("Program racuna ostatak nakon odredjenog vremena");
		
		System.out.println("Unesite koliko imate kafe na stanju u gramima");
		x = tastatura.nextInt();
		System.out.println("Koliko prodate kafe na tokom jednog dana?");
		y = tastatura.nextInt();
		z = x - (y * 20); 
		System.out.println("Posle 20 dana ostace vam kafe " + z);
		
		
	}
}

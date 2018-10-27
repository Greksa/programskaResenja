package programskaResenja;

import java.util.Scanner;

//Program izracunava aritmeticku sredinu unetih brojeva

public class AritmetickaSredina {

	public static void main(String args[]) {
		long pocetnoV, zavrsnoV, protekloV;
		pocetnoV = System.currentTimeMillis();
		Scanner tastatura = new Scanner(System.in);
		int x, y, z, sum;

		System.out.println("Program izracunava aritmeticku sredinu 3 uneta broja");
		System.out.println("Unesite prvi broj: ");
		x = tastatura.nextInt();
		System.out.println("Unesite drugi broj: ");
		y = tastatura.nextInt();
		System.out.println("Unesite treci broj: ");
		z = tastatura.nextInt();
		sum = (x + y + z) / 3;
		System.out.println("Aritmeticka sredina je: " + sum);
		zavrsnoV = System.currentTimeMillis();
		protekloV = (zavrsnoV - pocetnoV) / 1000;
		System.out.println();
		System.out.print("Vreme za izvrsenje programa u sekundama je: ");
		System.out.println(protekloV);
       
	}
}

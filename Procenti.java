package programskaResenja;

import java.util.Scanner;

public class Procenti {

	public static void main(String[] args) {
		Scanner tastatura = new Scanner(System.in);
		Double x, y, z;
		System.out.println("Program racuna zeljeni procenat unetog broja");
		System.out.println("Unesite vas broj: ");
		x = tastatura.nextDouble();
		System.out.println("Unesite zeljeni procenat");
		y = tastatura.nextDouble();
		z = x * (y / 100f);
		System.out.println("Vas rezultat je broj: ");
		System.out.println(z);

	}

}

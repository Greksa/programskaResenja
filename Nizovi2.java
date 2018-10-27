package programskaResenja;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Program zahteva od korisnika da unese velicine 2D niza
// Zatim ga ispunjava nasumicnim/random vrednostima - brojevima
// Stampa zbir brojeva ispod glavne dijagonale
public class Nizovi2 {

	public static void main(String... args) {
		// Scanner za unos velicine 2D niza
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite velicinu niza : ");
		int rows = scanner.nextInt();
		int columns = rows;
		int[][] matrix = new int[rows][rows];
		Random random = new Random();

		System.out.println("Nasumicni/random brojevi su :");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);

			}
		}

		for (int[] a : matrix) {

			System.out.println(Arrays.toString(a));

		}

		// Ovo je logika koja sabira elemente ispod glavne dijagonale
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i < rows; i++) {
			for (int j = i - 1; j >= 0; j--) {

				sum = matrix[i][j] + sum;

			}

		}

		System.out.println("\nDobijena matrica izgleda ovako : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Zbir elemenata ispod glavne dijagonale je: " + sum);

	}
}


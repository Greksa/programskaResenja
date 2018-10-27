package programskaResenja;

//** PROGRAM CRTA FIGURU, n=5 **//
public class Figura1 {

	static void print_figura(int n) {
		int x, y;
		for (x = 1; x <= n; x++) {
			for (y = 1; y <= n; y++) {

				if (x == 1 || x == n || y == 1 || y == n || x == y || y == (n - x + 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		int kolona = 5;
		print_figura(kolona);
	}
}

package programskaResenja;
// Metoda koja za broj ispisuje njegovu alfabetnu vrednost 
public class NaAlfabet {

	public static String getCharForNumber(int i) {

		// vraca 0 ako je unos los!
		if (i < 0) {
			return null;
		}

		// transformise u bazu od 26!
		String s = Integer.toString(i, 26);

		char[] characters = s.toCharArray();

		String result = "";
		for (char c : characters) {
			// konvertuje bazu od 26 karaktera nazad na bazu od 10 int!
			int b = Integer.parseInt(Character.valueOf(c).toString(), 26);
			// dodaje ASCII vrednost krajnjem rezultatu!
			result += String.valueOf((char) (b + 'A'));
		}

		return result;

	}

}

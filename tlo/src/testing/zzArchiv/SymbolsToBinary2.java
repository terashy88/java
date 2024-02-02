package testing.zzArchiv;
/*
 * Programmname:      SymbolsToBinary
 * Programmzweck:     Eingabe beliebiger Zeichen, welche zum Ascii- und zum Binärcode umgerechnet werden.
 * Version:           2.0
 * Datum:             10.10.2022
 * Autor:             Valentin Lenz
 */

public class SymbolsToBinary2 {

	public static void main(String[] args) {

		String eingabeToString;
		String binary = "";
		int laenge;

		System.out.print("Geben Sie eine beliebige Zeichenreihe ein: ");
		eingabeToString = System.console().readLine();

		laenge = eingabeToString.length();

		char[] digits = eingabeToString.toCharArray();

		System.out.print("\n\tUTF-8:\tASCII:\tBinär: \n\n");

		for (int i = 0; i < laenge; i++) {
			int s = digits[i];

			if (s < 100 && s > 9) {
				System.out.print(" \t" + digits[i] + "\t " + s);
			}
			if (s > 99) {
				System.out.print(" \t" + digits[i] + "\t" + s);
			}
			if (s < 10 && s > 0) {
				System.out.print(" " + digits[i] + "\t  " + s);
			}

			while (s >= 0) {
				if (s == 0) {
					for (int count = binary.length(); count < 8; count++) {
						binary = "0" + binary;
					}
					System.out.print("\t" + binary + "\n");
					binary = "";
					break;
				}
				if (s == 1) {
					binary = "1" + binary;
					for (int count = binary.length(); count < 8; count++) {
						binary = "0" + binary;
					}
					System.out.print("\t" + binary + "\n");
					binary = "";
					break;
				}
				if (s % 2 == 0) {
					binary = "0" + binary;
					s = s / 2;
				}
				if (s % 2 == 1) {
					binary = "1" + binary;
					s = (s - 1) / 2;
				}
			}
		}
	}
}

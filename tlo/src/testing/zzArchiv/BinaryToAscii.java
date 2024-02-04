package testing.zzArchiv;
/*
 * Programmname:      BinaryToAscii
 * Programmzweck:     Eingabe eines beliebigen, Unsigned, Binärcodes, welcher zum Asciicode umgerechnet wird.
 * Version:           1.0
 * Datum:             11.10.2022
 * Autor:             Valentin Lenz
 */

public class BinaryToAscii {

	public static void main(String[] args) {

		String eingabe = "";
		double count = 0;
		int i = 0;

		System.out.print("Geben Sie einene Beliebig langen Binär Code ein: ");
		eingabe = System.console().readLine();

		char[] digits = eingabe.toCharArray();
		int laenge = eingabe.length();
		double power = Math.pow(2, laenge) / 2;

		while (power > 0) {
			if (digits[i] == '1') {
				count = count + power;
				// System.out.print(count + "\t" + power + "\n");
				i++;
			} else {
				i++;
			}
			if (power == 1) {
				System.out.println("Eingabe als Ascii Code: " + (int) count);
				break;
			}
			power = power / 2;
		}
	}
	// Zeit: 50 min 46 sec
}

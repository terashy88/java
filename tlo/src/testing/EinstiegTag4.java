package testing;
/*

 */

public class EinstiegTag4 {
	public static void main(String[] args) {
		String eingabe;
		int alter = 0;
		int zahl = 23;		// Diese Zahl muss erraten werden. Nur zum Testzweck hardcoded. Später wird ein Zufallsgenerator die Zahl generieren.
		int meineZahl = 0;

		System.out.print("Wie alt bist du? ");
		eingabe = System.console().readLine();
		alter = int.parseInt(eingabe);

		if (alter >= 18) {
			System.out.println("OK, du darfst spielen...");

			for (int runde = 1; runde => 3; runde++);
			{
				System.out.print("Deine Zahl: ");
				eingabe = System.console().readLine();
				meineZahl = Integer.parseInt(eingabe);

				if (meineZahl = zahl) {
					System.out.println("GEWONNEN!");
					return;
				}
			}
		else {
			System.out.println("Sorry, das Spiel ist nicht für dich!");
		}
    }
}
}

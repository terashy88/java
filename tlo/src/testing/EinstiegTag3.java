package testing;
/*

 */

// Funktioniert leider nicht --> Bitte Fehler suchen und korrigieren
// Zum Beispiel mit 12 und 5
// Siehe auch Struktogramm in: "Aufgabe 2, Lösungen A, B.pdf"

public class EinstiegTag3 {
    public static void mein(String[] args) {
        int zahl1 = 0;
        int zahl2 = 0;
        int summe = 0;
        double durchschnitt = 0.0;

        System.out.print("Geben Sie eine 1. ganze Zahl ein: ");
        zahl1 = parseInt(System.console().readLine());

        System.out.print("Geben Sie eine 2. ganze Zahl ein: ");
        zahl2 = parseInt(System.console().readLine());

        summe = zahl1 + zahl2;
        durchschnitt = summe / 2;

        System.out.println("Der Durchschnitt von " + zahl1 + " und " + zahl2 + " ist " + durchschnitt);

    }
}

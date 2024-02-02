package testing;
// Teil 2 nicht als Lösung, da einfacher als dieser:

public class Aufgabe19_T3 {

    public static void main(String[] args) {

        // Variablen und deren Datentypen definieren/deklarieren und Wertzuweisen
        // (initialisieren)
        double betrag = 0.0; // Startbetrag
        double zins = 0.0; // Zins in Prozent
        int laufzeit = 0; // Laufzeit in Jahren

        // Variablen und deren Datentypen definieren/deklarieren
        String betragAsString;
        String zinsAsString;
        String laufzeitAsString;

        /*
         * Datentypen:
         * int --> Ganzzahlen Bsp. 100
         * double --> Zahl mit Dezimalstellen Bsp. 3.56 Bsp. 6.0
         * float --> Zahl mit Dezimalstellen (weniger genau als double)
         * boolean --> Nur zwei mögliche Werte Bsp. wahr oder falsch (true oder false)
         * char --> 1x Zeichen (Buchstaben/Ziffer/Sonderzeichen) Bsp. 'A' Bsp. '3' Bsp.
         * '%'
         * String --> Zeichenkette (mehrere Zeichen) Bsp. "Hallo Welt 2"
         */

        // Benutzereingabe verlangen/abfragen
        System.out.print("Angangsbetrag > ");
        betragAsString = System.console().readLine(); // betragAsString ist eine Variable
        betrag = Double.parseDouble(betragAsString);

        System.out.print("Jahreszins in % > ");
        zinsAsString = System.console().readLine();
        zins = Double.parseDouble(zinsAsString);

        System.out.print("Laufzeit in J > ");
        laufzeitAsString = System.console().readLine();
        laufzeit = Integer.parseInt(laufzeitAsString);

        System.out.println("Jahre \tGuthaben"); // \t = Tabulatorzeichen
        System.out.println("----- \t--------");

        // Zeile 42 --> 46 = Schleife
        for (int jahr = 0; jahr <= laufzeit; jahr++) { // jahr++ = inkrementieren). Kurzform für jahr = jahr + 1
                                                       // Schöner aber nicht prüfungsrelevant: System.out.format("%2d
                                                       // %13.2f\n", jahr, betrag);
            System.out.println("" + jahr + "\t" + betrag);
            betrag = betrag * (1 + zins / 100);
        }
    }
}

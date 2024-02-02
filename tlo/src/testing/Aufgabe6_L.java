package testing;

public class Aufgabe6_L {
    public static void main(String[] args) {
        double pi = 3.14159265; // Wird weiter unten gebraucht.
        double resultat1 = 35 * 2 * (3 - 5) / (4 - 5); // Auf "Nummer sicher gehen" und als double deklarieren
        double resultat2 = 4 * 3 / 8.0;
        // double resultat2 = 4*3/8d;
        // double resultat2 = (double) 4*3/8;
        // Trick mit 8.0 erklären oder 8d oder mit casting (wie in diesem Beispiel)
        double resultat3 = 3 * (4 - (2 * 2)) / pi;
        double resultat4 = 2 * ((3 + 5) * (4 - 6) - 2) + 25;
        double resultat5 = 1 + 2 + 3 + (-5) + 0.5;

        System.out.println(resultat1); // 140.0
        System.out.println(resultat2); // 1.5
        System.out.println(resultat3); // 0.0
        System.out.println(resultat4); // -11.0
        System.out.println(resultat5); // 1.5

        // Zusatzinfo: Die Zahl PI "kennt" Java auch:
        System.out.println(Math.PI);
    }
}

package testing;

public class Aufgabe18 {
    public static void main(String[] args) {
        // Mit for-Schleife (Originalaufgabe)
        for (int zeile = 1; zeile <= 10; zeile++) { // >= <= aber weder so => noch so =<
            System.out.println("Zeile " + zeile);
        }

        // Variante mit do ... while
        int zeile = 1; // int löschen und sehen was passiert.
        do {
            System.out.println("Zeile " + zeile);
            zeile = zeile + 1; // oder zeile++
        } while (zeile <= 10);

        // Variante mit while ...
        zeile = 1; // ohne int Deklaration, da schon weiter oben (Zeile 9) gemacht.
        while (zeile <= 10) {
            System.out.println("Zeile " + zeile);
            zeile = zeile + 1; // oder zeile++
        }
    }
}

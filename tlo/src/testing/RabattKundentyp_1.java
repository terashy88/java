package testing;

public class RabattKundentyp_1 {

    public static void main(String[] args) {

        String eingabe; // Deklaration
        double betrag = 0.0; // Deklaration + Initialisierung
        char kundentyp;

        System.out.print("Rechnungsbetrag: ");
        eingabe = System.console().readLine();
        betrag = Double.parseDouble(eingabe);

        System.out.print("Kundentyp eingeben (A/B/C): ");
        eingabe = System.console().readLine();
        kundentyp = eingabe.charAt(0);

        if (betrag >= 1000 && kundentyp == 'A') {
            System.out.println("Total: CHF " + betrag * 0.95);
        }

        if (betrag >= 1000 && kundentyp == 'B') {
            System.out.println("Total: CHF " + betrag * 0.97);
        }

        if (betrag >= 1000 && kundentyp == 'C') {
            System.out.println("Total: CHF " + betrag);
        }

        if (betrag < 1000) {
            System.out.println("Total: CHF " + betrag);
        }
    }
}

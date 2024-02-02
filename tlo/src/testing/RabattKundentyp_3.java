package testing;
// Variante von Version 2

public class RabattKundentyp_3 {

    public static void main(String[] args) {

        String eingabe;
        double betrag = 0.0;
        char kundentyp = 'C';

        System.out.print("Rechnungsbetrag: ");
        eingabe = System.console().readLine();
        betrag = Double.parseDouble(eingabe);

        System.out.print("Kundentyp eingeben (A/B/C): ");
        eingabe = System.console().readLine();
        kundentyp = eingabe.charAt(0);

        if (betrag >= 1000 && (kundentyp == 'A' || kundentyp == 'a')) {
            System.out.println("Total: CHF " + betrag * 0.95);
        } else if (betrag >= 1000 && (kundentyp == 'B' || kundentyp == 'b')) {
            System.out.println("Total: CHF " + betrag * 0.97);
        } else {
            System.out.println("Total: CHF " + betrag);
        }
    }
}

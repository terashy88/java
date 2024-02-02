package testing;

public class RabattKundentyp_2 {

    public static void main(String[] args) {

        String eingabe;
        double betrag;
        char kundentyp;

        System.out.print("Rechnungsbetrag: ");
        eingabe = System.console().readLine();
        betrag = Double.parseDouble(eingabe);

        System.out.print("Kundentyp eingeben (A/B/C): ");
        eingabe = System.console().readLine();
        kundentyp = eingabe.charAt(0);

        if (betrag >= 1000) {
            if (kundentyp == 'A' || kundentyp == 'a') {
                System.out.println("Total: CHF " + betrag * 0.95);
            }
            if (kundentyp == 'B' || kundentyp == 'b') {
                System.out.println("Total: CHF " + betrag * 0.97);
            }
            if (kundentyp == 'C' || kundentyp == 'c') {
                System.out.println("Total: CHF " + betrag);
            }
        } else {
            System.out.println("Total: CHF " + betrag);
        }
    }
}

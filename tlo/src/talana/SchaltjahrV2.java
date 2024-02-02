package talana;
/*
 * Schaltjahr oder nicht
 */

public class SchaltjahrV2 {

    public static void main(String[] args) {

        String anzeige = " ist kein Schaltjahr";
        int jahreszahl;

        System.out.print("Schaltjahr oder nicht.\nbitte geben sie ein Testjahr ein:  ");

        String jahr = System.console().readLine();
        jahreszahl = Integer.parseInt(jahr);

        if (jahreszahl % 4 == 0) {
            anzeige = " ist ein Schaltjahr";
        }

        if (jahreszahl % 100 == 0) {
            anzeige = " ist kein Schaltjahr";
        }

        if (jahreszahl % 400 == 0) {
            anzeige = " ist ein Schaltjahr";
        }

        System.out.println(jahreszahl + anzeige);
    }
}

package talana;

public class Schaltjahr {

    public static void main(String[] args) {

        String anzeige = " ist kein Schaltjahr";
        int jahreszahl;

        System.out.println("Sehen wir mal ob ein bestimmtes Jahr ein Schaltjahr ist oder nicht..");
        System.out.println("Welches Jahr soll es sein?..");
        String jahr = System.console().readLine();
        jahreszahl = Integer.parseInt(jahr);

        if (jahreszahl % 4 == 0) {
            anzeige = " ist Schaltjahr";
            if (jahreszahl % 100 == 0) {
                anzeige = " ist kein Schaltjahr";
                if (jahreszahl % 400 == 0) {
                    anzeige = " ist Schaltjahr";
                }
            }
        }
        System.out.println(jahreszahl + anzeige);
    }
}

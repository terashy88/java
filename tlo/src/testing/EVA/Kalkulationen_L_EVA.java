package testing.EVA;

public class Kalkulationen_L_EVA {
    public static void main(String[] args) {
        int zahl_1 = 0;
        int zahl_2 = 0;

        int summe = 0;
        int differenz = 0;
        int produkt = 0;
        double quotient = 0.0;

        // EINGABEN
        System.out.print("Geben Sie eine ganze Zahl ein: ");
        zahl_1 = Integer.parseInt(System.console().readLine());
        System.out.print("Geben Sie nochmals eine ganze Zahl ein: ");
        zahl_2 = Integer.parseInt(System.console().readLine());

        // VERARBEITUNG
        summe = zahl_1 + zahl_2;
        differenz = zahl_1 - zahl_2;
        produkt = zahl_1 * zahl_2;
        quotient = (double) zahl_1 / zahl_2;

        // AUSGABEN
        System.out.println("Summe von " + zahl_1 + " und " + zahl_2 + " = " + summe);
        System.out.println("Differenz zwischen " + zahl_1 + " und " + zahl_2 + " = " + differenz);
        System.out.println("Produkt von " + zahl_1 + " und " + zahl_2 + " = " + produkt);
        System.out.println("Quotient " + zahl_1 + " durch " + zahl_2 + " = " + quotient);
    }
}

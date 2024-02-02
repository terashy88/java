package testing.EVA;

public class Kalkulationen_L {
    public static void main(String[] args) {
        int zahl_1 = 0; // oder als double deklarieren, dann ist das Problem mit dem Datentyp auf Zeilen
                        // 26 bzw. 28 nicht mehr da. Aufgabe verlangt aber Ganzzahlen!
        int zahl_2 = 0;

        int summe = 0;
        int differenz = 0;
        int produkt = 0;
        double quotient = 0.0;

        System.out.print("Geben Sie eine ganze Zahl ein: ");
        zahl_1 = Integer.parseInt(System.console().readLine());

        System.out.print("Geben Sie nochmals eine ganze Zahl ein: ");
        zahl_2 = Integer.parseInt(System.console().readLine());

        summe = zahl_1 + zahl_2;
        System.out.println("Summe von " + zahl_1 + " und " + zahl_2 + " = " + summe);

        differenz = zahl_1 - zahl_2;
        System.out.println("Differenz zwischen " + zahl_1 + " und " + zahl_2 + " = " + differenz);

        produkt = zahl_1 * zahl_2;
        System.out.println("Produkt von " + zahl_1 + " und " + zahl_2 + " = " + produkt);

        quotient = (double) zahl_1 / zahl_2;
        // Oder:
        quotient = 1.0 * zahl_1 / zahl_2;

        System.out.println("Quotient " + zahl_1 + " durch " + zahl_2 + " = " + quotient);
    }
}

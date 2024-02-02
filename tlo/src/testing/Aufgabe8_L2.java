package testing;

public class Aufgabe8_L2 {
    public static void main(String[] args) {
        double laenge = 0.0;
        double breite = 0.0;
        double hoehe = 0.0;
        double volumen = 0.0;

        System.out.println("   +-----+");
        System.out.println("  /     /| h");
        System.out.println(" +-----+ +");
        System.out.println(" |     |/ l");
        System.out.println(" +-----+");
        System.out.println("    b");
        System.out.println("Berechnung des Volumens eines Quaders:\n");

        // EINGABEN
        System.out.print("Bitte L\u00e4nge in m eingeben > "); // \u00e4 = ä wird richtig ausgegeben, egal ob diese
                                                               // Datei mit ISO-8859-15 oder UTF-8 codiert ist
        String laengeAsStr = System.console().readLine();
        laenge = Double.parseDouble(laengeAsStr);

        System.out.print("Bitte Breite in m eingeben > ");
        String breiteAsStr = System.console().readLine();
        breite = Double.parseDouble(breiteAsStr);

        System.out.print("Bitte Höhe in m eingeben > ");
        String hoeheAsStr = System.console().readLine();
        hoehe = Double.parseDouble(hoeheAsStr);

        // VERARBEITUNG
        // Berechnungen der Werte
        volumen = laenge * breite * hoehe;

        // AUSGABE
        System.out.println("Volumen: " + volumen);

        // For Interessierte:
        System.out.format("\nVolumen:  %10.2f m\u00b3 \n", volumen); // 10 kleiner machen und beobachten!
        // see also: https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html

    }
}

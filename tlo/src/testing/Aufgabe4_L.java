package testing;
/* Lösung für DBU */

public class Aufgabe4_L {
    public static void main(String[] args) {
        /*
         * Versuchen Sie experimentell herauszufinden, wie gross die Wertebereiche des
         * Datentypes "int" ist. Notieren Sie wie der Compiler reagiert, wenn Sie einen
         * Wert zuweisen, der nicht zulässig ist. Zum Beispiel, eine Zahl mit
         * Dezimalstellen.
         */

        /* Diese Zuweisungen sind unproblematisch */
        int testInt1 = 20;
        int testInt2 = 2147483647;
        int testInt3 = -192;
        // int testInt4 = 4147483647; // The literal 4147483647 of type int is out of range
        // int testInt5 = 2147483648; // The literal 2147483648 of type int is out of range
        // int testInt6 = 23.6; // Type mismatch: cannot convert from double to int

        /*
         * Fortgeschritte: Bitte erst lösen, wenn alle Übungen in dieser Datei gelöst
         * sind. Gibt es einen Weg, nachfolgenden Wert zu speichern? 5200100999
         */
        long testInt7 = 5200100999L;

        /*
         * Betrachten Sie nachfolgenden Wertzuweisungen. A) Überlegen Sie, wie die
         * Ausgabe in der Konsole aussehen sollten. B) Ergänzen Sie das Programm mit den
         * notwendigen Befehlen, um Ihre Annahmen aus dem Punkt A zu verifizieren. C)
         * Starten Sie das Programm und notieren Sie Ihre Beobachtungen/Festellungen.
         * Gibt es "komische", unerwartete Bildschirmausgaben?
         */

        float testFloat1 = 2.2F; // 2.2
        float testFloat2 = 56.123456789123456789F; // 56.123455
        float testFloat3 = 5612.34567891234567.89F; // 5612.3457


        double testDouble1 = 2.2; // 2.2
        double testDouble2 = 2.2d; // 2.2
        double testDouble3 = 56.123456789123456789; // 56.12345678912346
        double testDouble4 = 56.123456789123456789d; // 56.12345678912346

        /*
         * Versuchen Sie es auch ohne das d am Schluss und vergleichen Sie die Ausgaben
         * in der Konsole
         */
        double testDouble5 = -0.2d; // -0.2

        /* Ausgaben am Bildschirm */
        System.out.println("int:");
        System.out.println(testInt1);
        System.out.println(testInt2);
        System.out.println(testInt3);
        // testInt4 kann nicht initialisiert werden
        // testInt5 kann nicht initialisiert werden
        // testInt6 kann nicht initialisiert werden

        System.out.println("\nLong integer:");
        System.out.println(testInt7);

        System.out.println("\nfloat:");
        System.out.println(testFloat1);
        System.out.println(testFloat2);
        System.out.println(testFloat3);

        System.out.println("\ndouble:");
        System.out.println(testDouble1);
        System.out.println(testDouble2);
        System.out.println(testDouble3);
        System.out.println(testDouble4);
        System.out.println(testDouble5);

        // int if = 3;		// geht nicht, weil "if" ist ein Schlüsselwort (reserviertes Wort)
        // System.out.println("fi: " + if);
    }

}

package testing;

public class Aufgabe4 {

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
    // int testInt4 = ; // unzulässiger Wert Ihrer Wahl zuweisen
    // int testInt5 = ; // unzulässiger Wert Ihrer Wahl zuweisen
    // int testInt6 = ; // unzulässiger Wert Ihrer Wahl zuweisen

    /*
     * Fortgeschritte: Bitte erst lösen, wenn alle Übungen in dieser Datei gelöst
     * sind. Gibt es einen Weg, nachfolgenden Wert zu speichern? 5200100999
     */
    // int testInt7 = 5200100999;

    /*
     * Betrachten Sie nachfolgenden Wertzuweisungen. A) Überlegen Sie, wie die
     * Ausgabe in der Konsole aussehen sollten. B) Ergänzen Sie das Programm mit den
     * notwendigen Befehlen, um Ihre Annahmen aus dem Punkt A zu verifizieren. C)
     * Starten Sie das Programm und notieren Sie Ihre Beobachtungen/Festellungen.
     * Gibt es "komische", unerwartete Bildschirmausgaben?
     */

    float testFloat1 = 2.2F;
    float testFloat2 = 56.123456789123456789F;
    float testFloat3 = 5612.3456789123456789F;

    double testDouble1 = 2.2;
    double testDouble2 = 2.2d;
    double testDouble3 = 56.123456789123456789;
    double testDouble4 = 56.123456789123456789d;

    /*
     * Versuchen Sie es auch ohne das d am Schluss und vergleichen Sie die Ausgaben
     * in der Konsole
     */
    double testDouble5 = -0.2d;

    /* Ausgaben am Bildschirm */
    System.out.println("int:");
    System.out.println(testInt1);
    System.out.println(testInt2);
    System.out.println(testInt3);

    System.out.println("\nfloat:");

    System.out.println("\ndouble:");

    // int if = 3;
    // System.out.println("fi: " + if);
  }
}

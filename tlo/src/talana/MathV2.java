package talana;

public class MathV2 {
    public static void main(String[] args) {

        double pi = 3.14159265;
        double resultat1 = 35 * 2 * (3 - 5) / (4 - 5); // Auf "Nummer sicher gehen" und als double deklarieren
        double resultat2 = 4 * 3 / 8.0;
        double resultat3 = 3 * (4 - (2 * 2)) / pi;
        double resultat4 = 2 * ((3 + 5) * (4 - 6) - 2) + 25;
        double resultat5 = 1 + 2 + 3 + (-5) + 0.5;

        System.out.println(resultat1); // 140.0
        System.out.println(resultat2); // 1.5
        System.out.println(resultat3); // 0.0
        System.out.println(resultat4); // -11.0
        System.out.println(resultat5); // 1.5

        // System.out.println(Math.PI);
        System.out.print(pi + " == ");
        System.out.println(StrictMath.PI);

    }
}

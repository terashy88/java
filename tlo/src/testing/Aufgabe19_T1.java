package testing;

public class Aufgabe19_T1 {

    public static void main(String[] args) {
        int reihe = 0;
        int schritte = 0;
        int ausgabe = 0;

        System.out.print("Welche Zahlenreihe moechten Sie haben? > ");
        reihe = Integer.parseInt(System.console().readLine());

        System.out.print("Wie viele Schritte sollen berechnet werden? > ");
        schritte = Integer.parseInt(System.console().readLine());

        System.out.print(reihe + "er-Reihe\n----------\n");

        for (int i = 1; i <= schritte; i++) {
            ausgabe = ausgabe + reihe;
            System.out.println(ausgabe);
        }
    }
}

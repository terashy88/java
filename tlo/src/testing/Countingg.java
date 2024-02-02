package testing;

public class Countingg {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int sum = 0;

        System.out.print("Welche Zahlenreihe moechten Sie haben? > ");
        a = Integer.parseInt(System.console().readLine());

        System.out.print("Wie viele Schritte sollen berechnet werden? > ");
        b = Integer.parseInt(System.console().readLine());

        System.out.print(a + "er-Reihe\n----------\n");

        for (int i = 1; i <= b; i++) {
            sum = sum + a;
            System.out.println(sum);
        }
    }
}

package testing;

import java.util.Scanner;

/**
 *
 */
public class UserInput {

    public static void main(String[] args) {

        // String to Integer input
        System.out.println("Give me a readline input:..");
        String A = System.console().readLine();
        int newA = Integer.parseInt(A); // string to Integer

        System.out.println("This is your readLine Output: " + newA);

        System.out.println("now give me a scanne line input:..");
        Scanner scanner = new Scanner(System.in);
        String newB = scanner.nextLine();

        System.out.println("This is your Scanner Output: " + newB);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is Your Name?.. ");
        String name = scanner.nextLine();
        System.out.println("You said your name is: " + name + "!");

        System.out.print("Welche Zahlenreihe möchten Sie haben? > ");
        a = Integer.parseInt(System.console().readLine());

        System.out.println("Wie viele Schritte sollen berechnet werden? > ");
    }
}

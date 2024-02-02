package testing;

import java.util.Scanner;

// import java.util.Scanner;

/**
 * test
 */
public class Input {

    public static void main(String[] args) {
        // String to Integer input

        System.out.println("Give me a readline input:..");
        String A = System.console().readLine();
        int newA = Integer.parseInt(A); // string to Integer

        System.out.println("This is your readLine Output: " + newA);

        // todo find autoinmport
        // --need import java.util.Scanner;
        System.out.println("Now give me a scanne line input:..");
        Scanner B = new Scanner(System.in);
        String newB = B.nextLine();

        System.out.println("This is your Scanner Output: " + newB);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "!");
        return;
    }
}

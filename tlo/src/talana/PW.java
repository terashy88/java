package talana;

import java.util.Scanner;

public class PW {

    public static void main(String[] args) {

        int pw = 12;
        int input;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Let's Guess the Password are, else: ");
            input = scanner.nextInt();

            if (input != pw) {
                for (int i = 2; i > 0; i--) {
                    System.out.println("well " + input + " is not correct..");
                    System.out.println("you wanna try again? \n You have " + i + " try..");
                    input = scanner.nextInt();
                }

            }
        }

        if (input != pw) {
            System.out.println("well " + input + " is not correct, you are not allowed!..");
            return;
        } else {
            System.out.println("Welcome! you may pass..");
        }
        System.out.println("passing..");
    }
}

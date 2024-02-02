package testing;

import java.util.Scanner;

public class CaseStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 1 to 3..");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("You did not press anything from 1 to 3..");
                return;
        }
    }
}

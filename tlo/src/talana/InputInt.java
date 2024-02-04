package talana;

import java.util.Scanner;

public class InputInt {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Wie alt bist du? ");
            int i = scan.nextInt();

            System.out.println("Du bist " + i + " Jahre alt!");
        }

    }
}

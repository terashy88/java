package talana;

import java.util.Scanner;

public class DiscountRabatt {

    public static void main(String[] args) {

        int discount = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("You can get discount,\nWhat group of Costumer are you?");
            System.out.print("A, B, or C: ");

            String input = sc.next();
            char n = input.charAt(0);

            switch (n) {
                case 'A':
                case 'a':
                    discount = 5;
                    break;
                case 'B':
                case 'b':
                    discount = 3;
                    break;
                case 'C':
                case 'c':
                    discount = 2;
                    break;
                default:
                    discount = 0;
            }

            System.out.println("Costumer: " + n + " --> discount: " + discount);
        }
    }

}

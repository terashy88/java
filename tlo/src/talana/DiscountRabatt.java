package talana;

import java.util.Scanner;

public class DiscountRabatt {

    public static void main(String[] args) {

        int Discount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("You can get Discount,\nWhat group of Costumer are you?");
        System.out.print("A, B, or C: ");

        String input = sc.next();
        char n = input.charAt(0);

        switch (n) {
            case 'A':
            case 'a':
                Discount = 5;
                break;
            case 'B':
            case 'b':
                Discount = 3;
                break;
            case 'C':
            case 'c':
                Discount = 2;
                break;
            default:
                Discount = 0;
        }

        System.out.println("Costumer: " + n + " --> Discount: " + Discount);
    }

}

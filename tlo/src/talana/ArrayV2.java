package talana;

import java.util.Scanner;

public class ArrayV2 {

    public static void main(String[] args) {

        String[] names = { "susi", "lana", "mary", "claire", "sophie" };
        int[] number = { 4, 6, 1, 8 };

        System.out.println(names[3] + " " + number[1]);

        System.out.println("And here is another array way..");
        String[] names2 = new String[5];
        names2[0] = "jesi";
        names2[1] = "meli";
        names2[2] = "rosi";
        names2[3] = "shary";
        names2[4] = "lori";

        int[] num2 = new int[5];

        num2[0] = 2;
        num2[1] = 4;
        num2[2] = 6;
        num2[3] = 8;

        System.out.println(names2[2] + " " + names2[3] + " " + num2[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number? ");
        num2[4] = scanner.nextInt(); // user input

        System.out.println("Your number is " + num2[4]);
    }
}

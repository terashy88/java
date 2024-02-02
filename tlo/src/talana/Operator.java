package talana;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("hi, give me a number for a: ");
        int a = scanner.nextInt();
        System.out.print("now give me a number for b: ");
        int b = scanner.nextInt();

        System.out.println("your numbers was " + a + " and " + b + " so.. ");

        if (a < b) {
            System.out.println(a + " a is smaller then " + b + " b");
        }
        if (a > b) {
            System.out.println(a + " a is bigger then " + b + " b");
        }

        if (a <= b) {
            System.out.println(a + " a is smaller are Equal to " + b + " b");
        }
        if (a >= b) {
            System.out.println(a + " a is bigger are Equal to " + b + " b");
        }
        if (a == b) {
            System.out.println(a + " a and " + b + " b  are Equal");
        }
        if (a != b) { // <> also not Equal
            System.out.println(a + " a and " + b + " b are not Equal");
        }
    }
}

package testing;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, a = 22;

        System.out.println("hi, we are counting to " + a + "!..");

        System.out.print("from where are we want start?:..");
        i = scanner.nextInt();

        while (i < a) {
            System.out.println(i);
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

        if (i > a) {
            System.out.println("you are not in the range..");
        } else {
            System.out.println("here we go..");
        }
    }
}

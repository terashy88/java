package talana;

import java.util.Scanner;

public class ForLoopCount {

    public static void main(String[] args) {
s
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("We are counting from one number to the other");
            System.out.print("what is your first number? ");
            int n = scanner.nextInt();
            System.out.print("okay, what is your second number? ");
            int n2 = scanner.nextInt();

            if (n < n2) {

                for (int i = n; i <= n2; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(66);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            } else {
                for (int i = n; i >= n2; i--) {

                    System.out.println(i);
                    try {
                        Thread.sleep(66);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

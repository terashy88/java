package talana;

import java.util.Scanner;

public class ForLoopCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How much do you want me to count? ");
        int a = scanner.nextInt();

        for (int i = 0; i <= a; i++) {
            System.out.println(i);
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}

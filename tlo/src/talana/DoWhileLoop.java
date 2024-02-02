package talana;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much do you want to count? ");
        int a = scanner.nextInt();

        int i = 0;
        System.out.println("Counting.. " + a);
        do {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (i <= a);

        System.out.println("done");
    }

}

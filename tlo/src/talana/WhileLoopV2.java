package talana;

import java.util.Scanner;

public class WhileLoopV2 {

    public static void main(String[] args) {

        int i;
        int a;

        System.out.println("While The Number not being reach, we are counting!..");
        System.out.println("from where are we want to start?:.. \n");

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        System.out.println("where should we stop?.. \n");
        Scanner scanner2 = new Scanner(System.in);
        a = scanner2.nextInt();
        System.out.println("counting");

        while (i <= a) {
            System.out.println(i);
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        while (i >= a) {
            System.out.println(i);
            try {
                Thread.sleep(66);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }

        if (i == a) {
            System.out.println("error..");
        } else {
            System.out.println("here we go..");
        }
    }
}

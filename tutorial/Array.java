import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        String[] names = {"susi", "lana", "mary", "claire", "sophie"};
        int[] number = {4, 6, 1, 8};

        System.out.println(names[3] + " " + number[1]);

        System.out.println("And here is another array way..");
        String[] names2 = new String[5];
        names2[0] = "jesi";
        names2[1] = "meli";
        names2[2] = "rosi";
        names2[3] = "shary";
        names2[4] = "lori";

        int[] number2 = new int[5];

        number2[0] = 2;
        number2[1] = 4;
        number2[2] = 6;
        number2[3] = 8;

        System.out.println(names2[2] + " " + names2[3] + " " + number2[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number? ");
        number2[4] = scanner.nextInt(); // user input

        System.out.println("Your number is " + number2[4]);
    }
}

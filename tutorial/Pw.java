import java.util.Scanner;

public class Pw {

    // todo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pw = 12;
        int input;

        System.out.print("Guess the Password are, else: ");
        input = scanner.nextInt();

        if (input != pw) {
            for (int i = 3; i > 0; i--) {
                System.out.println("well " + input + " is not correct..");
                System.out.println("you wanna try again? \n You have " + i + " try..");
                input = scanner.nextInt();
            }
        } else {
            System.out.println("Welcome! you may pass..");
            return;
        }
        if (input != pw) {
            System.out.println("well " + input + " is not correct, you are not allowed!..");
            return;
        }
    }
}

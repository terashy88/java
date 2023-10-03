import java.util.Scanner;

public class IfStatmentAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("hi, how old are you?");
        a = scanner.nextInt();
        if (a < 4 && a > 0) {
            System.out.println(a + " so you most be a baby..");
        } else if (a < 13 && a >= 4) {
            System.out.println(a + " so you most be a kid..");
        } else if (a < 18 && a >= 13) {
            System.out.println(a + " so you most be a teenager..");
        } else if (a >= 18 && a < 111) {
            System.out.println(a + " so you most be a adult..");
        } else {
            System.out.println("Yes, I guess " + a + " that is not right..");
        }
    }
}

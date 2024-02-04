package talana;

import java.util.Scanner;

/**
 *
 */
public class UserInput {

    public static void main(String[] args) {

        System.out.println("Scanner <something> = new Scanner(System.in);");
        System.out.println("Is needed to import: import java.util.Scanner;");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("<scanner.> is needed to get a list of scanner.next..");
            // double l = scanner.nextDouble();
            // int j = scanner.nextInt();

            // Alternativ String to Integer input
            System.out.println("Give me a readline input:..");
            System.out.println("only accept Int, and error output for String");
            String a = System.console().readLine();
            int newA = Integer.parseInt(a); // string to Integer

            System.out.println("This is your readLine Output in Int: " + newA);
            System.out.print("test g:  ");
            // String g = scanner.nextLine();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("String A = System.console().readLine();");
        System.out.println("don't import: \nimport java.util.Scanner; ");
    }
}

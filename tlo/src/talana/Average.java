package talana;
/*

 */

public class Average {
    public static void main(String[] args) {

        System.out.println("We are going to take the average of two number");
        System.out.print("what is your first number? ");
        double n1 = Double.parseDouble(System.console().readLine());

        System.out.print("and what is your second number? ");
        double n2 = Double.parseDouble(System.console().readLine());

        double sum = n1 + n2;
        double average = sum / 2;

        System.out.println("The average of " + n1 + " and " + n2 + " is " + average);

    }
}

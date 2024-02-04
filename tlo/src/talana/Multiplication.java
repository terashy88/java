package talana;

public class Multiplication {

    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;

        System.out.println("Multiplication Row");
        System.out.print("Which row should we take? ");
        a = Integer.parseInt(System.console().readLine());

        System.out.print("And how much step should we count? ");
        b = Integer.parseInt(System.console().readLine());

        System.out.print(a + " multiplication\n----------\n");

        for (int i = 1; i <= b; i++) {
            sum = sum + a;
            System.out.println(sum);
        }
    }
}

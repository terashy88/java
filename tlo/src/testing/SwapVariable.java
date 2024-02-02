package testing;

public class SwapVariable {
    public static void main(String[] args) {

        int a = 1, b = 5;
        System.out.println(a + " and " + b + " swapping the value of a and b");

        int swap = a;
        a = b;
        b = swap;
        System.out.println("so now a is: " + a + " and b is: " + b);
    }
}

package talana;

public class SwappingValue {

    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        System.out.println("swapping the value from  a and b..");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("swapping now...");

        int swap = a;
        a = b;
        b = swap;

        System.out.println(" so a is now = " + a);
        System.out.println("and b is now = " + b);
    }
}

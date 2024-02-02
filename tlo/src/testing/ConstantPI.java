package testing;

public class ConstantPI {
    public static void main(String[] args) {
        // Declare constant to not allow a value of a variable to change
        final double PI = 3.14;

        // PI = 4; // Error: cannot modify a const variable
        System.out.println(PI);
    }
}

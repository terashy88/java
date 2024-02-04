package talana;

public class InputStringToInt {
    public static void main(String[] args) {

        String n1 = "4";
        String n2 = "5";
        double n3 = 5.5;
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);

        int sum = n11 + n22;
        String sum2 = n1 + n2;

        double sum3 = Double.parseDouble(n1) + n3;

        System.out.println(sum);
        System.out.println(sum2 + " = wrong");
        System.out.println("double: " + sum3);
    }
}

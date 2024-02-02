package testing;

import java.util.Arrays;

public class ArraysOld {
    /*
     *
     * @param args
     */

    public static void main(String[] args) {

        // int[] numbers = new int[3]; // set Array slots amount
        // String[] name = new String[3]; // set Array slots amount
        int[] numbers = { 1, 2, 5 }; // ! use this instead
        String[] name = { "Susanne", "Claire", "Sabi" }; // ! use this instead

        // numbers[0] = 1;
        // numbers[1] = 3;
        // numbers[2] = 5;

        // name[0] = "Meli";
        // name[1] = "Ines";
        // name[2] = "magret";

        System.out.println("Arrays in Integer");
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);
        System.out.println();

        System.out.println("Arrays in String");
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);
        System.out.println(name[1]);

    }

}

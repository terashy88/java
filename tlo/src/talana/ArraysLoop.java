package talana;

import java.util.Arrays;

public class ArraysLoop {

    public static void main(String[] args) {

        String[] num = { "Jesi", "Nadia", "Lea", "Lana" };

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.print(" ..line length " + num.length + "  ");
        System.out.print(Arrays.toString(num) + "   ");
        System.out.print(" " + num[2] + "  \n");

        /*
         * //! don't use this
         * System.out.println(num[0]);
         * System.out.println(num[1]);
         * System.out.println(num[2]);
         * System.out.println(num[3]);
         */
    }
}

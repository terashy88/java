package testing;

import java.io.File;

public class Dddds {

    public static void main(String... args) {

        Input sc = new Input(new File("temperatur.txt"));
        int[] temp = new int[12];
        int counter = 0;
        while (sc.hasNextLine()) {
            temp[counter] = sc.nextLine();
            counter++;
        }

        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }

        double snitt = (sum / temp.length);
        System.out.println("The average temperature is " + snitt);
    }
}

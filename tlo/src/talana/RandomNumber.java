package talana;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(88) + 1;

        System.out.println(number);
        System.out.println();
    }
}

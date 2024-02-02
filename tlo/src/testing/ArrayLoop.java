package testing;

public class ArrayLoop {
    public static void main(String[] args) {

        // todo
        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (math.random() * 10) + 1;
            // "java.util.Random.nextInt()"

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + ", ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.println(number + ", ");
        }
    }
}

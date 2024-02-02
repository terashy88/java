package testing;

public class Sort {

    public static void main(String... args) {
        int[] array = new int[] { 4, 6, 2, 7, 5, 8, 9, 3, 1 };
        System.out.println(java.util.Arrays.toString(array));

        // hier wird sortiert
        java.util.Arrays.sort(array);

        System.out.println(java.util.Arrays.toString(array));
    }
}

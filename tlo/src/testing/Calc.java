package testing;

/**
 * Calc
 */
public class Calc {

    public static void main(String[] args) {

    }

    String ar = System.console().readLine();
    int arr = Integer.parseInt(ar);

    public int findMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    // find minimum element in the array
    public int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i])
                min = arr[i];
        }
        return min;
    }
}

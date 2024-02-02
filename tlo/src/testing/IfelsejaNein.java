package testing;

/**
 * test
 */
public class IfelsejaNein {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
        if (a > b) {
            c = a + b;
            System.out.println("ja");
        } else {
            c = a - b;
            System.out.println("nein");
        }
        return;
    }
}

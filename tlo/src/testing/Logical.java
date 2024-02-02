package testing;

public class Logical {
    // Logical Operators
    public static void main(String[] args) {

        boolean warm = true;
        boolean cold = false;
        System.out.println(warm);
        System.out.println(cold);
        System.out.println(warm && cold);
        System.out.println(warm || cold); // are "both are..."
        System.out.println(!(warm || cold)); // ! "turns true are false" example: Is not a student...
        // deepcode ignore CopyPasteError: <please 2specify a reason of ignoring this>
        System.out.println(warm == warm); // equal to..
        System.out.println(warm == cold);
        return;
    }
}

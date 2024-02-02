package talana;

// Logical Operators

public class Logical {

    public static void main(String[] args) {

        boolean warm = true;
        boolean cold = false;

        System.out.println("boolean warm = " + warm);
        System.out.println("boolean cold = " + cold);

        System.out.println("warm && cold = " + (warm && cold));
        System.out.println("warm || cold = " + (warm || cold)); // are "both are..."
        System.out.println("!(warm || cold) = " + (!(warm || cold))); // ! "turns true are false" example: Is not a
                                                                      // student...
        // deepcode ignore CopyPasteError: <please 2specify a reason of ignoring this>
        System.out.println("warm == warm = " + (warm == warm)); // equal to..
        System.out.println("warm != warm = " + (warm != warm)); // not equal to..
    }
}

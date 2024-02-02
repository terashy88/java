package testing;

public class CaseStatement2 {

    public static void main(String[] args) {
        // switch Statement Gender check

        System.out.println("Hello so what are you?");
        System.out.println("1. Female");
        System.out.println("2. Male");
        System.out.println("3. I don't know");
        String gender = System.console().readLine();

        do {
            switch (gender) {
                case "1":
                    System.out.println("So you are a Female!..");
                    return;
                case "2":
                    System.out.println("So you are a Man!..");
                    break;
                case "3":
                    System.out.println("You prefer not to say?..");
                    return;
                default:
                    System.out.println("So you are not a Human?");
                    System.out.println("Are you wan't to try again?");
                    System.out.println("else quit out with Q ");
                    gender = System.console().readLine();
            }
        } while (gender.equals("q") && gender.equals("Q"));

        if (gender.equals("q") && gender.equals("Q")) {
            System.out.println("okay then, bye bye..");
        }
    }
}

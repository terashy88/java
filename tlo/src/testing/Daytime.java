package testing;

public class Daytime {

    public static void main(String[] args) {

        int hour = 17;
        if (hour < 12)

            System.out.println("Guten Morgen");
        else if (hour <= 16)
            System.out.println("Guten Nachmittag");
        else
            System.out.println("Guten Abend");
    }
}

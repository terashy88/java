package talana;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("The date is: " + now.getDayOfMonth() + "." + now.getMonthValue() + "." + now.getYear());
        System.out.println("The date is: " + java.time.LocalDate.now());

        int hour = 17;

        if (hour < 12)
            System.out.println("Guten Morgen");
        else if (hour <= 16)
            System.out.println("Guten Nachmittag");
        else
            System.out.println("Guten Abend");
    }

}

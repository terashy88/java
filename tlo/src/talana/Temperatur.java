package talana;

/*
Wetterbericht von 3 Ortschaften
Richard Derico
*/
public class Temperatur {

    public static void main(String[] args) {

        String[] ort = { "Zürich", "Bern", "Basel" };

        short tempZurich = ((22 + 31 + 15 + 10 + 16) / 5);
        short tempBern = ((15 / 2 + 6 / 2 + -3) / 5);
        short tempBasel = ((5 + 6 + 7 + 10 + 10) / 5);

        System.out.println("Here is the Weather Prognose of the last Week from 3 City\n");

        System.out.println("In " + ort[0] + " the average Temperatur is " + tempZurich + "°C.");
        System.out.println("In " + ort[1] + " the average Temperatur is " + tempBern + "°C.");
        System.out.println("In " + ort[2] + " the average Temperatur is " + tempBasel + "°C.");

    }
}

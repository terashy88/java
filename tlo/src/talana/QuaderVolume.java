package talana;

import java.util.Scanner;

public class QuaderVolume {

	public static void main(String[] args) throws InterruptedException {

		System.out.println();
		System.out.println("  +------+");
		System.out.println(" /      /| h");
		System.out.println("+------+ +");
		System.out.println("|      |/  l");
		System.out.println("+------+");
		System.out.println("   b" + "\n");

		System.out.println("hi, We are getting the Volume of a Quader;..");
		Thread.sleep(999);
		System.out.println("Please give me the Length of this Quader in Meters:..");
		try (Scanner scanner = new Scanner(System.in)) {
			double l = scanner.nextDouble();

			System.out.println(" Bitte geben Sie die Breite an!\n");
			double b = scanner.nextDouble();

			System.out.println(" Bitte geben Sie die Höhe an!\n");
			double h = scanner.nextDouble();

			System.out.println("The Volume of the Quader is: " + (l * b * h + " m\u00b3"));
		}
	}
}

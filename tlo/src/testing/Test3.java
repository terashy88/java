package testing;

import java.io.File;
import java.util.Scanner;

/**
 * Test3
 */
public class Test3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(new File("temperatur.txt"));

    int[] temp = new int[12];
    int counter = 0;

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      temp[counter] = Integer.ParseInt(line);
      counter++;
    }

    int sum = 0;

    for (int i = 0; i < temp.length; i++) {
      sum += temp[i];

    }

    double snitt = (sum / temp.length);

    System.out.println("The average temperature is " + snitt);
  }
}

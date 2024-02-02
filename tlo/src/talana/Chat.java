package talana;

import java.util.Scanner;

public class Chat {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Hi, what is your name? ");
      String name = scanner.nextLine();

      System.out.print("And where are you from, " + name + "? ");
      String location = scanner.nextLine();
      System.out.println("So you are from " + location + ", ah.");

      System.out.print("..how old are you, " + name + "? ");
      int age = scanner.nextInt();
      while (age > 110 || age <= 0) {
        System.out.println("Ya I guess your are not " + age);
        System.out.print("..try again " + name + "!.. ");
        age = scanner.nextInt();
      }
      age += 3;

      System.out.println("Ya, that's pretty nice. I'm " + age
          + ", but sadly I'm not in your area. Maybe we can meet sometime in the future...");
    }
  }
}

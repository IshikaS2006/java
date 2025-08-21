package q6;

import java.util.Scanner;

public class q6_main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scn.nextInt();
    q6 obj = new q6();
    boolean isLeapYear = obj.checkLeapYear(year);
    System.out.println("The year " + year + " is " + (isLeapYear ? "a leap year." : "not a leap year."));

  }
}

package q1;

import java.util.Scanner;

public class q1_main {
  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    q1 obj = new q1();
    int result = obj.sum(num);
    System.out.println("The sum is: " + result);
    scn.close();
  }
}

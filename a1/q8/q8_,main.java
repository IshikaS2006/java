package q8;

import java.util.Scanner;

public class q8_main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num =scn.nextInt();
    q8 obj = new q8();
    String result = obj.pattern1(num);
    System.out.print(result);
  }
}

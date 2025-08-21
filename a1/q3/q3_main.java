package q3;

import java.util.Scanner;

public class q3_main {
  public static void main(String[] args) {
    int n = 100;
    q3 obj = new q3();

    int result = obj.primeCount(n);
    System.out.println("Number of prime numbers up to " + n + " is: " + result);
    scn.close();
  }
}

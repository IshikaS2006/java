package q7;
import java.util.Scanner;

public class q7_main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    q7 obj = new q7();
    boolean result = obj.isArmstrong(num);
    System.out.println("The number " + num + " is " + (result ? "an Armstrong number." : "not an Armstrong number."));
  }
}

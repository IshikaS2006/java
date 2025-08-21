package q5;

import java.util.Scanner;

public class q5_main {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner (System.in);
    System.out.print("Enter num1: ");
    int num1= scn.nextInt();
    System.out.print("Enter num2: ");
    int num2= scn.nextInt();
    System.out.print("Enter num3: ");
    int num3= scn.nextInt();
    q5 obj= new q5();
    int result = obj.greatest(num1, num2, num3);
    System.out.println("Greatest of three numbers is: " + result);
    scn.close();
  }
}

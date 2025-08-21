package q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = scn.nextInt();
        System.out.print("Enter num2: ");
        int b = scn.nextInt();
        System.out.print("Enter num3: ");
        int c = scn.nextInt();
        System.out.print("Enter num4: ");
        int d = scn.nextInt();

        q2_main obj = new q2_main();
        int average = obj.avg(a, b, c, d);
        int total = obj.total(a, b, c, d);

        System.out.println("The average is: " + average);
        System.out.println("The total is: " + total);

        scn.close();
    }
}

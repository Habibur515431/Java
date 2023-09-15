 
package basic;

import java.util.Scanner;

public class SwapingTwoNumberInBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        
        a =(a ^ b);
        b =(a ^ b);
        a =(a ^ b);
        
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        
    }
}

package practice;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
       Scanner cs = new Scanner(System.in);
        
        int a = cs.nextInt();
        System.out.println("Enter the first number:" + a);
        
        char ch = cs.next().charAt(0);
        System.out.println(ch);
        
        double d = cs.nextDouble();
        System.out.println("Enter the number: " + d);
        
    }
    
}

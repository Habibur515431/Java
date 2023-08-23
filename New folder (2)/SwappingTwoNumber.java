package basic;

public class SwappingTwoNumber {
     public static void main(String[] args) {
         int a = 20;
         int b = 25;
         
         swap(a, b);
     }
         public static void swap(int a, int b){
         int temp = a;
         a = b;
         b = temp;
         System.out.println("value of a: " + a);
         System.out.println("value of b: " + b);
         
         }         
    }


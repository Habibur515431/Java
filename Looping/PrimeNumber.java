package basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
       boolean isPrime = true;
       for(int i = 2; i <= n-1; i++){
        if(n%i == 0){
        isPrime = false;
        break;
        }
       }
        if(isPrime){
            System.out.println("Prime");
        }
       else{
            System.out.println("Not prime");
        }
    }
}

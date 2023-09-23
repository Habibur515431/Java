
package basic;
//https://dimikoj.com/profile/89n3?habib31
import java.util.*;

public class EvenOddProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
          }
        }
    }
}

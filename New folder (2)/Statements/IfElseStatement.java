package basic;


public class IfElseStatement {
         /* 
        if (condition){
          statement--1;
         }
        else{
         statement--2;
        }
        */
         
    public static void main(String[] args) {
          int age = 17;
          if (age >= 18){
              System.out.println("you are a voter.");
          }
          else{
             System.out.println("outside of the statement.");
          }
    }
}

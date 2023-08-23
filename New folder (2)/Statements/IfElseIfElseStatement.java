package basic;

public class IfElseIfElseStatement {
    /*
       if(condition 1){
      statement 1;
    }
    else if(condition 2){
      statement 2;
    }
    else if(conditon 3){
    statement 3;
    }
    .
    .
    n
    else{
    statement n;
    }
    */
    public static void main(String[] args) {
        int mark = 100;
        if (mark > 100 || mark < 0){
           System.out.println("Invalid marks");
        }
       else if (mark >= 80){
           System.out.println("A+");
        }
        else if(mark >= 70){
            System.out.println("A");
        }
          else if(mark >= 60){
            System.out.println("A-");
        }
        else if(mark >= 50){
            System.out.println("B");
        }
        else if(mark >= 40){
            System.out.println("C");
        }
        else if(mark >= 33){
            System.out.println("D"); 
        }
        else{
            System.out.println("F");
        }

        }
    }


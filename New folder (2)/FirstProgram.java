package basic;

public class FirstProgram {
    public static void main(String[] args){
        FirstProgram obj1 = new FirstProgram();
         String name = obj1.getName();
         String address = obj1.getAddress();
         int age = obj1.getAge();
         
         System.out.println("My name is " + name + ".");
        System.out.println("My address is " + address + ".");
        System.out.println("My age is " + age + "." );
    }  
    public String getName(){
        return "Habibur";
    }
    public String getAddress(){
          return "Thakurgaon";
    }
    public int getAge(){
        return 20;}
}

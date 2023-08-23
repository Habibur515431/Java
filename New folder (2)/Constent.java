package basic;

public class Constent {
    
    private String address;
    
    public void getPresentAddress(){
      address = "Thakurgaon, Bangladesh";
      System.out.println("present address: " + address);
    }
    public void getPermanentAddress(){
       address = "Bogura, Bangladesh";
       System.out.println("Permanent address: " + address);
    }
 public static void main (String[] args){
    Constent obj = new Constent();
     obj.getPresentAddress();
     obj.getPermanentAddress();
     
     String name = "habibur";
     int age = 20;
     float salary = 40000;
     
     System.out.println(name);
     System.out.println(age);
     System.out.println(salary);
 }
}

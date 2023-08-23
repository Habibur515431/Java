package basic;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        String name = "Monday";
        switch(name){
            case "saturday":
                System.out.println("Today is saturday.");
                break;
                
            case "Sunday":
                System.out.println("Today is sunday.");
                break;
                
            case "Monday":
                System.out.println("Today is Monday.");
                break;
                
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
                
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
                
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
                
            case "Friday":
                System.out.println("Today is Friday.");
                break;
                
            default:
                System.out.println("Today is unknown.");
                
        }
    }
}

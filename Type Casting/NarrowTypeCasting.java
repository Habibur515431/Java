package basic;

public class NarrowTypeCasting {
    public static void main(String[] args) {
        int num = 400;
        short s = (short)num;
        byte b = (byte)num;
        
      //System.out.println("Binary representation of num: " + Integer.toBinaryString(num));
        System.out.println("Value: " + num);
        System.out.println("Value: " + s);
        System.out.println("Value: " + b);
    }
}

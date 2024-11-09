import java.util.*;

class Gen1 <T>{
    T ob;
    Gen1(T cons){
        ob = cons;
    }
    T getob(){
        return ob;
    }
    void showtype(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}
public class GenDemo1 {
    public static void main(String[] args) {
        Gen1 <String> str1 = new Gen1 <String> ("Hello!!!");
        String st = str1.getob();
        System.out.println(st);
        System.out.println();
        Gen1 <Double> dob1;
        dob1 = new Gen1 <Double>(17.8);
//        int v = dob1.getob(); // Error double instead of int
        double d1 = dob1.getob();
        System.out.println("Value of dob is "+d1);
        dob1.showtype();
        System.out.println();
        Gen1<Byte> bob1 = new Gen1<>(Byte.valueOf((byte) 0));
        bob1.showtype();
//        Gen1 <Byte> bob2;
//        bob2 = new Gen1 <Byte> (Byte.valueOf((byte)0));
        System.out.println();
        Gen1 <Integer> fob1;
        fob1 = new Gen1 <Integer> (11);
        int i = fob1.getob();
        System.out.println("Value of fob1 is "+i);
        fob1.showtype();
    }
}

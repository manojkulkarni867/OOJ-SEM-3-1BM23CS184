import java.util.*;

class Gen2 <P, Q>{
    P ok1;
    Q ok2;
    Gen2(P ok1, Q gen){
        this.ok1 = ok1;
        ok2 = gen;
    }
    P first(){
        return ok1;
    }
    Q second(){
        return ok2;
    }
    void showtype(){
        System.out.println("First Parameter: "+ok1.getClass().getName()+"\nSecond Parameter: "+ok2.getClass().getName());
    }
}
public class GenDemo2 {
    public static void main(String[] args) {
        Gen2 <Double, Integer> ob1 = new Gen2<>(18.7, 10);
        System.out.println("Argument 1= "+ob1.first()+"\nArgument 2= "+ob1.second());
        ob1.showtype();
    }
}

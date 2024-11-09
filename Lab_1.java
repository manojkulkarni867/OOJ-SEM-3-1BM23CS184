import java.util.*;

// Quadratic Equation
public class Lab_1 {
    public static void main(String args[]){
        int a,b,c;
        float r1,r2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c :");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int disc = (b*b)-(4*a*c);
        if (disc>0)
        {
            System.out.println("Real and distinct roots");
            r1 = (float)((-b)+(disc*0.5))/(2*a);
            r2 = (float)((-b)-(disc*0.5))/(2*a);
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else if (disc==0)
        {
            System.out.println("Real and equal");
            r1 = (float)((-b)+(disc*0.5))/(2*a);
            r2 = (float)((-b)-(disc*0.5))/(2*a);
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else if (disc<0)
        {
            System.out.println("Imaginary Roots ");
            r1 = (float)(-b)/(2*a);
            r2 = (float)(disc)/(2*a);
            System.out.println("Root 1 = "+r1+" "+(+r2)+"i");
            System.out.println("Root 2 = "+r1+" "+(-r2)+"i");
        }
        else
        {
            System.out.println("Error Calculating the Result");
        }
        }
    }

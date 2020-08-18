import java.util.*;
public class interest{
    private static double principle, time, rate, n;
    private static void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        principle = sc.nextDouble();
        System.out.println("Enter time:");
        time = sc.nextDouble();
        System.out.println("Enter number of times one pays in the period:");
        n = sc.nextDouble();
        System.out.println("Enter Rate:");
        rate = sc.nextDouble();
    }
    private static void compute(){
        double money = principle*(Math.pow((1+(rate/(n*100))), time*n));
        System.out.println("Compound Interest: "+ money);
    }
    public static void main(String args[]){
        get();
        compute();
    }
}
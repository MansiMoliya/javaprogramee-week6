package javaprogramweek6;

import java.util.Scanner;

public class Pro13_calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value:");
        double a=sc.nextDouble();
        System.out.println("Enter 2nd value:");
        double b=sc.nextDouble();
        System.out.println("Enter 3rd value:");
        double c=sc.nextDouble();
        calculate(a,b,c);
        sc.close();
    }
    public static void calculate(double a,double b,double c){
        double ans = a + b + c/3;
        System.out.println("Average number: "+ans);
    }
}

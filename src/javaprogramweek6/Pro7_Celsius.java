package javaprogramweek6;

import java.util.Scanner;

public class Pro7_Celsius {
    static double a;
    public static void celsius(double f){
       a=(f-32)*5/9;
        System.out.println("Celsius temperature is:"+a+"°C");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature value:");
        double b=sc.nextDouble();
        celsius(b);
        sc.close();
    }
}

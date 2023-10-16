package javaprogramweek6;

import java.util.Scanner;

public class Pro6_Radius {
    static double PI, r;

    public static void radius(double a) {
        PI = 22;
        a = PI * r * r / 7;
        System.out.println("Area of circle is:" + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of the circle:");
        r = sc.nextDouble();
        radius(r);
        sc.close();
    }

}

package javaprogramweek6;

import java.util.Scanner;

public class Pro8_Triangle {
    static float area;
    public static void triangle(float b,float h){
        area=(b*h)/2;
        System.out.println("Triangle value is:"+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of width:");
        float b=sc.nextFloat();
        System.out.println("Enter Value of height:");
        float h=sc.nextFloat();
        triangle(b,h);
        sc.close();

    }
}

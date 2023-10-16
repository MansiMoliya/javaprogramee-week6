package javaprogramweek6;

import java.util.Scanner;

public class Pro5_Calculator {
    static int  ans, a, b;

    public static void addition(int x, int y) {
        ans = x + y;
        System.out.println("Addition is: " + ans);
        // return x;
        // return x;
    }

    public static void subtraction(int x, int y) {
        ans = x - y;
        System.out.println("Subtraction is: " + ans);
    }

    public void multiplication(int x, int y) {
        ans = x * y;
        System.out.println("Multiplication is:" + ans);
    }

    public void division(float x, float y) {
        float ans = x / y;
        System.out.println("division is:" + ans);
    }

    public static void main(String[] args) {
        // int a,b,c;
        Pro5_Calculator obj = new Pro5_Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value a:");
        a = sc.nextInt();
        System.out.println("please enter the value b:");
        b = sc.nextInt();
        addition(a, b);

        subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
        sc.close();
    }
}

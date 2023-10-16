package javaprogramweek6;

import java.util.Scanner;

public class Pro18_TestData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        testData(n1, n2);
    }

    public static void testData(int n1, int n2) {
        System.out.println("Addition two number " + n1 + "+ " + n2 + "= " + (n1 + n2));
        System.out.println("subtraction two number " + n1 + "- " + n2 + "= " + (n1 - n2));
        System.out.println("Multiplication two number " + n1 + "* " + n2 + "= " + (n1 * n2));
        System.out.println("Division two number " + n1 + "/ " + n2 + "= " + (n1 / n2));
        System.out.println("Remainder of two number " + n1 + "mod " + n2 + "= " + (n1 % n2));

    }
}

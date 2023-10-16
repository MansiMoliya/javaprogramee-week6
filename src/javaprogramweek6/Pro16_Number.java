package javaprogramweek6;

import java.util.Scanner;

public class Pro16_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String n1 = sc.nextLine();
        System.out.println("Please enter second binary number");
        String n2 = sc.nextLine();
        number(n1,n2);
        sc.close();
    }
    public static void number(String n1,String n2){
        int a= Integer.parseInt(n1,2);
        int b=Integer.parseInt(n2,2);
        int sum=a+b;
        System.out.println("Addition is : "+Integer.toBinaryString(sum));

   /*
        String b1,b2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st binary no. : ") ;
        b1=sc.next();
        System.out.println("Enter 2nd binary no. : ") ;
        b2=sc.next();
        int num1=Integer.parseInt(b1,2);
        int num2=Integer.parseInt(b2,2);
        int sum=num1+num2;
        System.out.println("Additon is : "+Integer.toBinaryString(sum));*/
    }
}

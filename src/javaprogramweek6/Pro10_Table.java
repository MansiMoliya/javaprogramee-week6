package javaprogramweek6;

import java.util.Scanner;

public class Pro10_Table {
    public static void table(int a){
        for (int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=sc.nextInt();
        table(a);
        sc.close();

    }
}

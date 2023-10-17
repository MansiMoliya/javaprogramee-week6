package javaprogramweek6;

import java.util.Scanner;

public class Pro10_Table {
    public static void table(int num, int i) {
        //  for (int i=1;i<=10;i++){
        //    System.out.println(a+"*"+i+"="+a*i)

        System.out.println(num + "*" + i + "=" + num * i);

    }
    public static void print(int num) {
        table(num,1);
        table(num,2);
        table(num,3);
        table(num,4);
        table(num,5);
        table(num,6);
        table(num,7);
        table(num,8);
        table(num,9);
        table(num,10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = sc.nextInt();
        print(a);
        sc.close();

    }
}

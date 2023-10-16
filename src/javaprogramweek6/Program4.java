package javaprogramweek6;

public class Program4 {
    int a=10;
    String b="SQL";
    static int c=20;
    static String d="Python";
    public void inMethod(){
        System.out.println(Program4.c);
        System.out.println(Program4.d);
        System.out.println(a);
        System.out.println(b);
    }
    public static void statMethod(){
        System.out.println(c);
        System.out.println(d);
       Program4 obj=new Program4();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public static void main(String[] args) {
        Program4 obj1=new Program4();
        statMethod();
        obj1.inMethod();
    }
}

package javaprogramweek6;

public class Program1 {
    int a =10;
    String name="Programme";

    public void instanceMethod(){
        System.out.println(a);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Program1 obj=new Program1();
        obj.instanceMethod();
    }
}

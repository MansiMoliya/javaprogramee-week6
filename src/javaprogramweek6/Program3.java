package javaprogramweek6;

public class Program3 {
    int a =10;
    static  String add ="abc";
    public void instMe(){
        System.out.println(a);
        System.out.println(Program3.add);
    }
    public static void staticMe(){
        Program3 obj=new Program3();
        System.out.println(obj.a);
        System.out.println(add);
    }

    public static void main(String[] args) {
        Program3 ob=new Program3();
        staticMe();
        ob.instMe();

    }
}

package Exp5.p2;
import Exp5.p1.Class1;

public class Class2 {
    
    public static void main(String[] args) {
        
        Class1 obj = new Class1();

        System.out.println(obj.x);
        // System.out.println(obj.y);
        // System.out.println(obj.z);
        // System.out.println(obj.a);

        obj.m1();
        // obj.m2();
        // obj.m3();
        // obj.m4();   
    }
}

class Uma extends Class1{

    public static void main(String[] args) {
        
        Uma obj = new Uma();

        System.out.println(obj.x);
        // System.out.println(obj.y);
        System.out.println(obj.z);
        // System.out.println(obj.a);

        obj.m1();
        // obj.m2();
        obj.m3();
        // obj.m4();   
    }
}

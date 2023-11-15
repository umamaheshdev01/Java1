package Exp7;

public class Test {

    public static void main(String[] args) {

        Test3();
        
    }

    static void Test1()
    {
        Derived obj = new Derived();
        obj.print();
    }

    static void Test3()
    {
           Piyush obj = new Piyush();

           Piyush.method1(obj);
           Piyush.method2(obj);
           Piyush.method3(obj);
           Piyush.method4(obj);
    }
    
}

abstract class Base
{
    Base()
    {
        print();
    }

    abstract void print();
}

class Derived extends Base
{
    int value=2;

    void print()
    {
        System.out.println(value);
    }
}


interface One1
{
    void method();
}

class Hero implements One1{

    public void method()  //public
    {
        System.out.println("Hello");
    }

}

interface One
{
    void m1();
    void m2();
}

interface Two
{
    void m3();
    void m4();
}

interface Three
{
    void m5();
    void m6();
}

interface New extends One,Two,Three
{
    void m7();
}

class Piyush extends Uma implements New
{
     public void m7()
     {
        System.out.println("m7");
     }

     public void m6()
     {
        System.out.println("m6");
     }

     public void m5()
     {
        System.out.println("m5");
     }

     public void m4()
     {
        System.out.println("m4");
     }

     public void m3()
     {
        System.out.println("m3");
     }

     public void m2()
     {
        System.out.println("m2");
     }

     public void m1()
     {
        System.out.println("m1");
     }



     public static void method4(One obj)
     {
        obj.m1();
        obj.m2();
     }

     public static void method3(Two obj)
     {
        obj.m3();
        obj.m4();
        
     }

     public static void method2(Three obj)
     {
        obj.m5();
        obj.m6();
     }

     public static void method1(New obj)
     {
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
        obj.m6();
        obj.m7();
     }


}

class Uma{

}
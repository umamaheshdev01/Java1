package Exp6;

public class Test {

    public static void main(String[] args) {

        Test1();
        
    }


    static void Test1()
    {
        C obj = new C();
    }

    static void Test2()
    {

    }

    static void Test3()
    {
        Class2 obj = new Class2();
        obj.m();
        obj.m(1);
        obj.m(true);
        obj.m(1,2);
    }
    
}

class A 
{
    A()
    {
        System.out.println("Class A");
    }
}


class B
{
    B()
    {
        System.out.println("Class B");
    }
}


class C extends A
{
    B obj = new B();
}

class Base
{
    Base(int i)
    {
        System.out.println("I am base class");
    }
}

class Derived extends Base
{
      Derived()
      {
        super(1);
        System.out.println("Default");
      }

      Derived(int i)
      {
        super(i);
        System.out.println("Non-default");
      }
}


class Class1
{
    void m()
    {
        System.out.println("I am method 1");
    }

    void m(int i)
    {
        System.out.println("I am method 2");
    }

    void m(boolean i)
    {
        System.out.println("I am method 3");
    }
}

class Class2 extends Class1
{
     void m(int i,int j)
     {
        System.out.println("I am methdo 4");
     }
}

class Bro{

    final void method()
    {

    }
}

class Sis extends Bro
{
    // void method(); cannot be overrided
}

final class Brother
{

}

class Sister //extends Brother  cannot be inherited
{
    Brother obj = new Brother();

}
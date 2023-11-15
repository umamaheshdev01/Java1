package Week6;

public class Test {

    public static void main(String[] args) {
        
    }

    static void Test1()
    {
        Derived obj = new Derived();
    }

    static void Test2()
    {
          C obj = new C();
    }

    static void Test3()
    {
        Class2 obj = new Class2();
        obj.m();
        obj.m(1);
        obj.m(true);
        obj.m(1,2);
    }


    static void Test4()
    {
       Frog f = new Frog();
       f.habitat();
       f.color();

       Amphibian k = f;
       k.habitat();
       //k.color();  this is error

    }

    static void Test5()
    {
        Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.sleep();
            rodent.run();
        }
    }
    
}

class Base
{
    Base()
    {
        System.out.println("Base class constructor");
    }

}

class Derived extends Base
{
    Derived()
    {
        System.out.println("Derived class constructor");
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


class Amphibian
{
    void habitat()
    {
       System.out.println("Both land and water");
    }
}

class Frog extends Amphibian
{
    void color()
    {
        System.out.println("Green");
    }
}

class Rodent {
    void eat() {
        System.out.println("Rodent is eating.");
    }

    void sleep() {
        System.out.println("Rodent is sleeping.");
    }

    void run() {
        System.out.println("Rodent is running.");
    }
}

class Mouse extends Rodent {

    void eat() {
        System.out.println("Mouse is nibbling on cheese.");
    }

    
    void run() {
        System.out.println("Mouse is scurrying around.");
    }
}

class Gerbil extends Rodent {
    
    void eat() {
        System.out.println("Gerbil is munching on seeds.");
    }

    void run() {
        System.out.println("Gerbil is darting through tunnels.");
    }
}

class Hamster extends Rodent {

    void eat() {
        System.out.println("Hamster is gnawing on its food.");
    }


    void run() {
        System.out.println("Hamster is running in its wheel.");
    }
}


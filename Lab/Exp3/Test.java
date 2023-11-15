package Exp3;

public class Test {

    public static void main(String[] args) {

        Test1();
        Test2();
        Test3();
        
        
    }


    static void Test1()
    {
        Dog obj = new Dog();
        obj.bark();
        obj.bark(true);
        obj.bark(1);
        obj.bark(1,2);
    }

    static void Test2()
    {
        Alexa obj = new Alexa();
    }

    static void Test3()
    {
        Bro obj = new Bro();
    }


    
}


class Dog
{
    void bark()
    {
        System.out.println("Barking");
    }

    void bark(boolean k)
    {
        System.out.println("Howling");
    }

    void bark(int k)
    {
        System.out.println("Shouting");
    }

    void bark(int i,int j)
    {
        System.out.println("Beat Boxing");
    }
}


class Alexa
{
    //default constructor
}

class Bro
{
    Bro()
    {
        this(1);
    }

    Bro(int i)
    {
        System.out.println(i);
    }
}
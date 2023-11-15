package Week2;

public class Test {
    
    public static void main(String[] args) {
        
        // Test1();
        // Test2();
        Test3();
        
    }

    static void Test1()
    {
        Hero obj = new Hero(4, 5);
        System.out.println(obj.x);
        System.out.println(obj.y);
    }

    static void Test2()
    {
        Heroine obj = new Heroine();
        obj.hi();
        obj.hi(1);
        obj.hi(1f);
        obj.hi(1,2);
    }

    static void Test3()
    {
        Salman obj = new Salman();
        obj.Salman();
    }

}

class Hero{

    int x =2;
    int y = 3;
    int f = 45;

    Hero(int x,int y)
    {
         this.x = x;
         this.y = y;       
    }


    static void hello()
    {
        // System.out.println(this.x);   error this cannot be used in static block
    }

}


class Heroine
{
    void hi()
    {
        System.out.println(1);
    }

    void hi(int i)
    {
        System.out.println(2);
    }

    void hi(float i)
    {
        System.out.println(3);
    }

    void hi(int i,int j)
    {
        System.out.println(4);
    }

}

class Salman
{
    Salman()
    {
        System.out.println("Constructor");
    }

    void Salman()
    {
        System.out.println("Method");
    }
}
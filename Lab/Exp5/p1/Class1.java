package Exp5.p1;

public class Class1 {

    public int x =2 ;
    private int y= 3;
    protected int z = 4;
    int a = 10;

    public void m1()
    {
        System.out.println("public");
    }

    private void m2()
    {
        System.out.println("private");
    }

    protected void m3()
    {
        System.out.println("protected");
    }

    void m4()
    {
        System.out.println("default");
    }

    public static void main(String[] args) {

          Class1 obj = new Class1();

          System.out.println(obj.x);
          System.out.println(obj.y);
          System.out.println(obj.z);
          System.out.println(obj.a);

          obj.m1();
          obj.m2();
          obj.m3();
          obj.m4();   // same class

        
    }
    
}


class Friend
{
    public static void main(String[] args) {
        
        Class1 obj = new Class1();

        System.out.println(obj.x);
        // System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.a);

        obj.m1();
        // obj.m2();
        obj.m3();
        obj.m4();   
    }
}
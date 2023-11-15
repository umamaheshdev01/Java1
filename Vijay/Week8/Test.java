package Week8;
import Week8.p1.Class1;

public class Test {

   public static void main(String[] args) {

      Test3();
      Test1();
      
   }

   static void Test1()
   {
      Class1 k = new Class1();
      k.m1();
      k.m2();
      k.m3();
   }

   static void Test3()
   {
          Piyush k = new Piyush();
          Piyush.method1(k);
          Piyush.method2(k);
          Piyush.method3(k);
          Piyush.method4(k);
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
     public void m7()  // while implementing we need to mention public
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



     public static void method1(One obj)
     {
        obj.m1();
        obj.m2();
     }

     public static void method2(Two obj)
     {
        obj.m3();
        obj.m4();
     }

     public static void method3(Three obj)
     {
        obj.m5();
        obj.m6();
     }

     public static void method4(New obj)
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
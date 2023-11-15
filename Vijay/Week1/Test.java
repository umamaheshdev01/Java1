package Week1;

public class Test
{
   public static void main(String[] args) {
    //  Test1();
     Test5();
   }

   static void Test1()
   {
       Uma obj = new Uma();
       Uma obj2 = obj;

       System.out.println(obj.k);
       System.out.println(obj2.k);  //object alliasing
   }

   static void Test5()
   {
      Default obj = new Default();
      System.out.println(obj.a);
      System.out.println(obj.b);
      System.out.println(obj.c);
      System.out.println(obj.k);
      System.out.println(obj.p);
      System.out.println(obj.f);  
   }

   static void Test6()
   {
     int x;  // should be intialisied this is an error
    //  System.out.println(x);
   }
}

class Uma
{
    int k = 3;
}

class Arjun
{
    static int p = 1;
    int q =2;

    static void hello()
    {
        System.out.println(p); //static can be used in static
        // System.out.println(q); //error
    }

    void hi()
    {
        System.out.println(p); // static can be use in instance
        System.out.println(q);
    }
}

class Comments
{
    // Comment 1

    // Comment 2
    // Comment 3
    // Comment 4

   /* Comment 5
    Comment 6
    Comment 7 */ 
    
}

class Default
{
    int a;
    float b;
    boolean c;
    String k;
    char p;
    Object f;
}
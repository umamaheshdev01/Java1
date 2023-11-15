package Exp2;

public class Test {
    
   public static void main(String[] args) {

    Test1();
    Test2();
       
   }

   static void method(String k,String p)
   {
        System.out.println(k==p);
        System.out.println(k!=p);
        System.out.println(k.equals(p));
   }  

   static void Test1()
   {
      String k ="Uma";
      String s = "Mahesh";
      String p = "Uma";

      method(k, p);
      method(k, s);
      method(s, p);
   }


   static void Test2()
   {
          Dog d1 = new Dog("spot","Ruff");
          Dog d2 = new Dog("scruffy","Wruff");

          System.out.println(d1.name+" "+d1.says);
          System.out.println(d2.name+" "+d2.says);

          Dog d3 = d1;

          System.out.println(d1==d3);
          System.out.println(d1.equals(d3));

   }

}


class Dog
{
    String name;
    String says;

    Dog(String n,String s)
    {
        name =n;
        says = s;
    }
}
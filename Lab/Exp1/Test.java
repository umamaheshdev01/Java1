package Exp1;

public class Test {

    public static void main(String[] args) {

        Test1();
        Test2(100);
        Test3();
        Test4();
        
    }

    static void Test1()
    {
        Alias obj = new Alias();
        Alias obj2 = obj;

        System.out.println(obj.i);
        System.out.println(obj2.i);
    }

    static void Test2(int x)
    {
        for(int i=2;i<=x;i++)
        {
            boolean prime = true;

            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    prime = false;
                    break;
                }
            }

            if(prime)
            {
                System.out.println(i);
            }
        }
    }

    static void Test3()
    {
          for(int i=1;i<=4;i++)
          {
            switch(i)
            {
                case 1: System.out.println(1);
                case 2:System.out.println(2);
                case 3 :System.out.println(3);
                case 4 : System.out.println(4);
                default : System.out.println(0);
            }

            System.out.println();
          }

          System.out.println();

          for(int i=1;i<=4;i++)
          {
            switch(i)
            {
                case 1: System.out.println(1);
                        break;
                case 2:System.out.println(2);
                        break;
                case 3 :System.out.println(3);
                        break;
                case 4 : System.out.println(4);
                         break;
                default : System.out.println(0);
            }

            System.out.println();
          }
    }

    static void Test4()
    {
        Hero obj = new Hero();
        System.out.println(obj.s);
    }
    
}

class Alias
{
    float i = 1f;
}

class Hero
{
    String s;
}
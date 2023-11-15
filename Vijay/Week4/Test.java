package Week4;

public class Test {
    
    public static void main(String ... args) { // u can use Strings[]args also

        // Test1(args);
        // Test2(args);
        Test5(10);
        
    }

    static void Test1(String args[])
    {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }

    static void Test2(String... vargs)
    {
        for(int i=0;i<vargs.length;i++)
        {
            System.out.println(vargs[i]);
        }
    }

    static void Test4(int x)
    {
        for(int i=2;i<=x;i++)
        {
            boolean prime = true;

            for(int j=2;j<i/2;j++)
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

    static void Test5(int x)
    {
       for(int i=1;i<=x;i++)
       {
         System.out.print(fib(i)+" ");
       }
    }

    static int fib(int x)
    {
        if(x==1 || x==2)
        {
            return 1;
        }

        return fib(x-1)+fib(x-2);
    }
}

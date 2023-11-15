package Exp4;

public class Test {

    public static void main(String... args) {
        Test1.print();
        all(args);
    }

    static void all(String[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    
}


class Test1
{
    static String s1="Uma";
    static String s2;

    static
    {
       s2="Mahesh";
    }

    static void print()
    {
        System.out.println(s1);
        System.out.println(s2);
    }


}
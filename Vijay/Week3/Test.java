package Week3;

public class Test {
    
    public static void main(String[] args) {

        // Test1();
        // Test2();
        // Test3();
        Test5();
        
    }

    static void main()
    {
        System.out.println("I am dupliacate");
    }

    static void Test1()
    {
        main();
    }

    static void print(int []a)
    {
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    static void Test2()
    {
        print(new int[]{1,2,3,4}); //anonymous array
    }

    static void Test3()
    {
        Pizza a[][]={
            {
                new Pizza(),null,new Pizza()
            },
            {
                new Pizza()
            },
            new Pizza[2]
        };

        System.out.println(a[2][1]);
        System.out.println(a[0][0].cost);
    }

    
    static void Test4()
    {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,0,11}
        };

        System.out.println(min(a));


    }

    static int min(int[][] a)
    {
           int min = a[0][0];

           for(int i=0;i<4;i++)
           {
             for(int j=0;j<3;j++)
             {
                if(a[i][j]<min)
                {
                    min = a[i][j];
                }
             }
           }

           return min;
    }

    static void Test6()
    {
        // int []x = 0;  // cannot convert integer to integer array
    }

    static void Test5()
    {
        int p =4;
        System.out.println(p);
        modifyInt(p);
        System.out.println(p);

        War obj = new War();
        System.out.println(obj.x);
        modifyObj(obj);
        System.out.println(obj.x);


    }

    static void modifyInt(int x)
    {
        x= 30;
    }

    static void modifyObj(War obj)
    {
         obj.x=100;
    }


}


class Pizza
{
    int cost = 100;
}

class War
{
    int x =2;
}
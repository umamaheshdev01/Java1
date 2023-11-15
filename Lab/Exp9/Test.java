package Exp9;

public class Test {
    
    public static void main(String[] args) {

        Test2();
        
    }

    static void Test1()
    {
         try
         {
            throw new Exception("Pheww");
         }
         catch(Exception ex)
         {
            System.out.println("The Exception is "+ex.getMessage());
         }
         finally
         {
            System.out.println("Done");
         }
    }


    static void Test2()
    {
         try
         {
            throw new Custom("Pheww");
         }
         catch(Custom ex)
         {
            System.out.println("The Exception is "+ex.display());
         }
         finally
         {
            System.out.println("Done");
         }
    }
}

class Custom extends Exception
{
    private String msg;

    Custom(String k)
    {
        super(k);
        msg = k;
    }

    public String display()
    {
        return msg;
    }

}
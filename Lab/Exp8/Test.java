package Exp8;

public class Test {

    public static void main(String[] args) {

        Test1();
        
    }
    
    static void Test1()
    {
        Outer obj = new Outer();
        obj.perform();
    }
}


class Outer
{
    private int out;
    private void outer(){
        System.out.println("Outer method");
    }

    public void perform()
    {
        Inner obj = new Inner();
        obj.modify();
        System.out.println(out);
    }

    void access_inner()
    {
       // System.out.println(in); // np access to inner elements
    }


    class Inner
    {
        private int in = 2;
        public void modify()
        {
            out = 1;
            outer();
        }
    }
}
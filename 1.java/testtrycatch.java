class testtrycatch
{
    public static void main(String args[])
    {
        try
        {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("division is:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error due to division"+e);
        }
        System.out.println("rest of the code");
    }
}
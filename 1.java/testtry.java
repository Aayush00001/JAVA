class testtry
{
    public static void main(String []args)
    {
        try{
            int arr[]=new int[5];
            int a=10;
            int b=2;
            int c=a/b;
            System.out.println("division  is:"+c);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error due to division by zero:     -------    "+e);
        }
        catch(ArrayIndexOutOfBoundException ae)
        {
            System.out.println("array index bound        -------   "+ae);
        }
        System.out.println("rest of the code");
    }
}

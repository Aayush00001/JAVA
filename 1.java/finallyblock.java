class finallyblock 
{
    public static void main(String args[])
    {
        try{
            int data=8/0;
            System.out.println(data);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finall block is away executed");
        }
        System.out.println("rest of the code");
    }    
}

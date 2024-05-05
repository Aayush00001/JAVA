import java.io.*;
class M
{
    void methoad () throws IOException
    {
        throw new IOException("device error");
    }
}
class Testthrow
{
    public static void main(String args[])
    {
        try{
            M m=new M();
            m.methoad();
        }
        catch(Exception e)
        {
            System.out.println("exception handled"+e);
        }
        System.out.println("normal flow..");
    }
}

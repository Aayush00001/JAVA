class InvalidAgeExp extends Exception
{
    InvalidAgeExp(String s)
    {
        super(s);
    }
}
class customException
{
    static void Validate(int age)throws InvalidAgeExp
    {
        if(age<18)
        throw new InvalidAgeExp("not valid");
        else
        System.out.println("welcome to vote");
    }
    public static void main(String args[])
    {
        try{
            Validate(13);
        }
        catch(Exception m)
        {
            System.out.println("Exception occured:"+m);
        }
        System.out.println("rest of the code..");
    }
}

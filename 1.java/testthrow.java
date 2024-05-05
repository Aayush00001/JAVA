class Testthrow 
{
    static void Validate(int age)
    {
        if(age<18)throw new ArithmeticException("not valid");
        else
        System.out.println("welcome to vote");
    }    
    public static void main(String [] args)
    {
        Validate(13);
        System.out.println("rest of the code");
    }
}

//constuctor in inheritance
class person1
{
    person1()
    {
        System.out.println("constuctor of person class");
    }
}
class employee extends person1
{
    employee()
    {
        System.out.println("constuctor of employee class");
    }
    public static void main(String args[])
    {
        employee e1=new employee();
        s.display();
    }
}
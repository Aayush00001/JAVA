//Write application that declares a class named Employee. It should have instance
//variables age, name &amp; salary. These should be of type int, String, float respectively.
//Create the object of Employee class and set and display its instance variable.
class Ass1
{  
    int age;  
    String name;
    float salary;  
    void set()
    {
        age=20;
        salary=50000f;
        name="AAYUSH RADHANPARA";
    }
    void display()
    {
        System.out.println("age is:->"+age);
        System.out.println("salary is:->"+salary);
        System.out.println("name is:->"+name);
    }
}
class Ass2_1
{
    public static void main(String args[])
    {
        Ass1 emp=new Ass1();
        emp.set();
        emp.display();
    }
}    
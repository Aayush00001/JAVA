/*efine a class University having instance variable uname, ucity and tot_stud.Define parameterized constructor to initialize instance var
iable. Define derived class Department having instance variable deptno and deptname. Defineparameterized constructor to initialize insta
nce variable. Also define display() method to display all information. Create two objects and demonstrate.*/
class University
{
    int tot_stud;
    String uname;
    String ucity;

    void getUni()
    {
        uname="abc";
        ucity="rajkot";
        tot_stud=10;
    }
}
class Department extends University
{
    int deptno;
    String deptname;

    void getDept()
    {
        deptno=1;
        deptname="pqr";
    }

    void display()
    {
        System.out.println("uname is:->"+uname);
        System.out.println("ucity is:->"+ucity);
        System.out.println("tot student is:->"+tot_stud);
        System.out.println("deptno:->"+deptno);
        System.out.println("departmate number is:->"+deptname);
    }
}
class Ass3__2
{
    public static void main(String args[])
    {
        Department d1=new Department();
        Department d2=new Department();
        d1.getUni();
        d1.getDept();
        d1.display();

        d2.getUni();
        d2.getDept();
        d2.display();
    } 
}
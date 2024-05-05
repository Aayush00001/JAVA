//parameterizrd consutctor in inheritance
class person
{
	String fname;
	String lname;
	person()
	{
		fname="atmiya";
		lname="university";
		System.out.println("base class");
	}
	person(String fn,String ln)
	{
		fname=fn;
		lname=ln;
	}
	void display()
	{
		System.out.println("nam:"+fname+" "+lname);
	}
}
class Student extends person
{
	int rno;
	int enroll;
	Student()
	{
		rno=1;
		enroll=1079;
	}
	Student(String fn,String ln,int rno,int eno)
	{
		super(fn,ln);
		this.rno=rno;
		enroll=eno;
	}
	void display()
	{
		super.display();
		System.out.println("rollno:"+rno+"\n"+"enroll:"+enroll);
	}
}
class result extends Student
{
    int t1,t2;
    result()
    {
        t1=0;
        t2=0;
    }
    result(String fn,String ln,int rno,int eno,int test1,int test2)
    {
        super(fn,ln,rno,eno);
        t1=test1;
        t2=test2;
    }
    void display()
    {
        super.display();
        System.out.println("total mark:"+(t1+t2));
    }
}
class demo3_inheritance
{
	public static void main(String args[])
	{
		result s=new result("a","b",1,1078,5,15);
		s.display();
	}
}
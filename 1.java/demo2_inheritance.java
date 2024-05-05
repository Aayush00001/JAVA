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
class demo2_inheritance
{
	public static void main(String args[])
	{
		Student s=new Student("a","b",1,1078);
		s.display();
	}
}
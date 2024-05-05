//no args consuctor in inheritance use of super keyword method overridding
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
	void display()
	{
		System.out.println("name:"+fname+" "+lname);
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
	void display()
	{
		super.display();
		System.out.println("rollno:"+rno+"\n"+"enroll:"+enroll);
	}
}
class demo1inheritance
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.display();
	}
}
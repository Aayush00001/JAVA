//Define a class named Student having data member’s name, age, gender (m/f) and
//various overloaded constructors for accepting the details of student and display
//method to display information of student.
class student
{
	int age;
	String name;
	char gender;
	student()
	{
		name="AAYUSH RADHANPARA";
		gender='m';
		age=19;
	}
	student(int a,String n,char g)
	{
		name=n;
		age=a;
		gender=g;
	}
	void display()
	{
		System.out.println("name is:->"+name);
		System.out.println("age is:->"+age);
		System.out.println("gender is:->"+gender);
	}
}
class Ass2_3
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.display();
		student s2=new student(19,"AAYUSH RADHANPARA",'m');
		s2.display();
	}
}
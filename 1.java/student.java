//consturctor overloading in java
class student
{ int id, age;
String name;
Student( ) { id = 0;
name = " ";
age=0
}
Student(int i, String n) 
{ id = i;
name = n;
age=18;
}
Student(int i, String n, int a) 
{ id = i;
name = n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}

public static void main(String args[])
	{
	Student s1 = new Student(1,"XYZ");
	Student s2 = new Student(2,"ABC",25);
	Student s3 = new Student();
	s1.display();
	s2.display();
	s3.display();
	}
}
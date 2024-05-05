import java.util.*;
class Student 
{ 
	int rollno,age; 
	String name; 
	Scanner sc = new Scanner(System.in);
	void getData() 
	{ 
		System.out.println("Enter your Name:"); 
		name = sc.next();  
		System.out.println("Enter your Roll Number:"); 
		rollno = sc.nextInt(); 
		System.out.println("Enter your Age:"); 
		age = sc.nextInt();
	} 
	void putData() 
	{ 
		System.out.println("Name is:"+name); 
		System.out.println("Roll Number is:"+rollno); 
		System.out.println("Age is:"+age);
	} 
	public static void main(String[] args) 
	{ 
		Student obj = new Student();  
		obj.getData(); 
		obj.putData();
		
	}
}
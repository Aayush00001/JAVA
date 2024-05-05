import java.util.*;
class University 
{  
	String uname,ucity; 
	int tot_stud; 

	Scanner sc = new Scanner(System.in);
	void getUni() 
	{ 
		System.out.println("Enter University Name:"); 
		uname = sc.next(); 
		System.out.println("Enter City Name:"); 
		ucity = sc.next(); 
		System.out.println("Enter Total Students:"); 
		tot_stud = sc.nextInt(); 
	}
} 
class Department extends University 
{ 
	String deptname; 
	int deptno; 

	void getDept() 
	{ 
		System.out.println("Enter the Department Name:"); 
		deptname = sc.next(); 
		System.out.println("Enter the deptno:"); 
		deptno = sc.nextInt();  
	}  
	void display() 
	{ 
		System.out.println("University Name is:"+uname);  
		System.out.println("University's city is:"+ucity); 
		System.out.println("University Total Student is:"+tot_stud); 
		System.out.println("Department Name is:"+deptname); 
		System.out.println("Department Number is"+deptno);
	} 
}  
class Ass3_1 
{
	public static void main(String[] args) 
	{ 
		Department obj = new Department(); 
		obj.getUni(); 
		obj.getDept(); 
		obj.display(); 
		Department objj = new Department(); 
		objj.getUni(); 
		objj.getDept(); 
		objj.display();
	} 
}
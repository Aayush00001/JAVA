import java.util.*;  
 
class University 
{ 
	String uname,ucity; 
	int tot_stud; 

	University(String unm,String ucty,int totstud) 
	{ 
		uname=unm; 
		ucity=ucty; 
		tot_stud=totstud;
	} 
}   
class Department extends University 
{ 
	String deptname; 
	int deptno; 

	Department(String unm,String ucty,int totstud,String dnm,int dno) 
	{ 
		super(unm,ucty,totstud);
		deptname=dnm; 
		deptno=dno; 
	}  

	void display() 
	{ 
		System.out.println("University Name is:"+uname);  
		System.out.println("University's city is:"+ucity); 
		System.out.println("University Total Student is:"+tot_stud); 
		System.out.println("Department Name is:"+deptname); 
		System.out.println("Department Number is:"+deptno); 
	}
}
class Ass3_2 
{
	public static void main(String[] args) 
	{ 
	 
		Department obj = new Department("Atmiya","Rajkot",47,"CSIT",007);
		obj.display();
	} 
}
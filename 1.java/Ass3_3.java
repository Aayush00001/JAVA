import java.util.*; 

class AddSub 
{ 
	 int num1,num2;
	void getdata() 
	{ 
	 	Scanner sc = new Scanner(System.in); 
	 	System.out.println("Enter the Number 1:"); 
		num1= sc.nextInt();  
		System.out.println("Enter the Number 2:"); 
		num2= sc.nextInt(); 
	}
	
	void calAdd() 
	{ 
		System.out.println("Addition is: "+(num1+num2)); 
	} 
	void calSub() 
	{ 
		System.out.println("Substraction is: "+(num1-num2)); 
	}
}  

class MulDiv extends AddSub  
{ 
	void calMul() 
	{ 
		System.out.println("Multiplication is: "+(num1*num2)); 
	} 
	void calDiv() 
	{ 
		System.out.println("Division is: "+(num1/num2)); 
	}
}
class Ass3_3 
{ 
	public static void main(String[] args) 
	{ 
		MulDiv obj = new MulDiv();  
		obj.getdata();
		obj.calAdd(); 
		obj.calSub(); 
		obj.calMul(); 
		obj.calDiv();
	} 
} 
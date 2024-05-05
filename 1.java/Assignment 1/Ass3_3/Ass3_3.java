/*3. WAP to perform mathematical operation create a class called AddSub with attributes
num1 and num2 of type int, also define methods calAdd( ) and calSub( ) to calculate
addition and subtraction .Create another class MulDiv that extends AddSub class to
use member a data of super class. MulDiv should have methods calMul( ) &amp; calDiv( )
to calculate multiplication and division. A main method should access the methods
and perform operations.*/
import java.util.*; 
class AddSub 
{ 
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	void getdata() 
	{ 
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
class Asgmt_3_3 
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
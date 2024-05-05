import java.util.*;
class Bill 
{ 
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Unit:"); 
		float bill = sc.nextInt(); 
		if(bill<=100) 
		{
			System.out.println("You have to Pay:$"+5.2*bill);
		} 
		else if(bill<=200) 
		{ 
			System.out.println("You have to Pay:$"+5.9*bill);
		} 
		else if(bill<=400) 
		{ 
			System.out.println("You have to Pay:$"+6.7*bill);
		} 
		else if(bill<=600) 
		{ 
			System.out.println("You have to Pay:$"+7.2*bill);
		} 
		else if(bill>600) 
		{ 
			System.out.println("You have to Pay:$"+7.6*bill);
		} 
		else 
		{ 
			System.out.println("Invalid");
		}
	}
}
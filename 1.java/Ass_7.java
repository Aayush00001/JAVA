import java.util.Scanner;
class Ass_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int ans;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Enter choice");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Multiplication");
		System.out.println("Enter 3 for Division");
		System.out.println("Enter 4 for Module");
		int ch=sc.nextInt();	
		switch(ch)
		{
			case 1:
			ans=a+b;
			System.out.println("addition is..."+ans);
			break;
			
			case 2:
			ans=a*b;
			System.out.println("multioplication is is..."+ans);
			break;
			
			case 3:
			float div=a/b;
			System.out.println("div is..."+div);
			break;
			
			case 4:
			float mod=a+b;
			System.out.println("module  is..."+mod);
			break;
			
			default:
			System.out.println("invalid choice");
			
		}
		
		
	}
}
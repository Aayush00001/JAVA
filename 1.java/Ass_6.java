import java.util.Scanner;
class Ass_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("Enter 1 for Factorial");
		System.out.println("Enter 2 for Odd and Even");
		System.out.println("Enter 3 for Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				int i=n;
				int temp=1;
				while(i != 0)
				{
					temp=i*temp;
					i--;
				}
				System.out.println("factorial="+temp);
			break;
			
			case 2:
				if(n % 2 == 0)
				{
					System.out.println("Even");
				}
				else
				{
					System.out.println("Odd");
				}
			break;
			
			default:
				System.out.println("Exit");
				break;
			
		}
	}
}
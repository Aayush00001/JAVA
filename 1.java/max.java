//write a program to check max number using if,elseif condition
import java.util.Scanner;
class max
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter 3 num:");
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
		if(a>b&&a>c)
			System.out.println("a max");
		else if (b>a&&b>c) 
			System.out.println("b max");
		else
			System.out.println("c max");
	}
}
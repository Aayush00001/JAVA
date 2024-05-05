//w.a.p to acept number from user and check whther number is zero,negative or positive
import java.util.Scanner;
class number
{
	public static void main(string args[])
	{
		Scanner Sc=new Scanner(System.in);
		int a;
		System.out.println("enter a num:-->>");
		a=Sc.nextInt();
		If(a==0)
			System.out.println("zero");
		else If(a>0)
			System.out.println("positive");
		else
			System.out.println("negative");
	}
}
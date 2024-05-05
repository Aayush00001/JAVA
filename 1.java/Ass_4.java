import java.util.Scanner;
class Ass_4
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter roll no");
			int rno=sc.nextInt();
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("enter 5 marks");
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			int m4=sc.nextInt();
			int m5=sc.nextInt();
			int total=(m1+m2+m3+m4+m5);
			System.out.println("your roll no is: "+rno);
			System.out.println("your roll name is: "+name);
			System.out.println("total marks is: "+total);
			double per=(total/5);
			System.out.println("percentage:"+per);
			if(per>=70)
			{
				System.out.println("Distinction");
			}
			else if(per>=60 && per<70)
			{
				System.out.println("First class");
			}
			else if(per>=50 && per<60)
			{
				System.out.println("Second class");
			}
			else if(per>=40 && per<50)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
		}
}
			
			
			
//W.a.p to acept mont name as a command line argument and print number of days of that month number bryand to 1 to 12 print invalid month
class cmdlineargs
{
	public static static void main(string args[])
	{
		int n=Integer.parseInt(args[0]);
		switch(n)
		{
		case 1,3,5,7,8,10,12:
			System.out.println("31 days");
			break;
		case 4,6,9,11
			System.out.println("30 days");
		case 2:
			System.out.println("28/29 DAYS");
		default:
			System.out.println("INVALID MONTH");
		}
	}
}
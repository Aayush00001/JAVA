//commanline arguments
class text_args
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		switch(num)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuseday");
			break;
		case 3:
			System.out.println("wedday");
			break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("iNVALID DAY");
		}
	}
}
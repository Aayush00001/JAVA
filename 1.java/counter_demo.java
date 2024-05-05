//ex of counter without static
class counter_demo
{
	int count=0;
	counter_demo()
	{
		coun++;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		counter_demo c1=new counter_demo();
		counter_demo c2=new counter_demo();
		counter_demo c3=new counter_demo();
	}
}
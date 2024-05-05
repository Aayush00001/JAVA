//w.a.p of mathod ovrloading for character and string
class test_method
{
	void print(String s)
	{
		System.out.println("string is:"+s);
	}
	void print(char c)
	{
		System.out.println("charcter is:"+c);
		System.out.println("Ascii key:"+(int)c);
	}
}
class demo
{
	public static void main(String args[])
	{
		test_method+=new test_method();
		+.print("welcome");
		+.print("h");
	}
}
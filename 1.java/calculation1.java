//w.a.p for by changing data type
class calculation1
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	void sum(float a,float b)
	{
		System.out.println(a+b);
	}
}
class caldemo
{
	public static void main(String args[])
	{
		calculation c=new calculation();
		c.sum(10,20);
		c.sum(20.5,30.5);
		c.sum(10.5f,20.6f)
	}
}
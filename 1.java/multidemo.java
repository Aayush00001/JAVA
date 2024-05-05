//example of mulitilevel inheritance
class x
{
	public void methodx()
	{
		System.out.println("class x method");
	}
}
class y extends x
{
	public void methody()
	{
		System.out.println("class y method");
	}
}
class z extends y
{
	public void methodz()
	{
		System.out.println("class z method");
	}
}
class multidemo
{
	public static void main(String[] args) 
	{
		z obj=new z();
		obj.methodx();
		obj.methody();
	}
}
//ex of vairble argument 
class varargs
{
	void sum(int ...n)
	{
		int sum=0;
		for(int a:n)
		{
			sum=sum+a;
		}
	System.out.println("sum="+sum);
	}
}
class varargsdemo
{
	public static void public static void main(String[] args) {
		varargs obj=new varargs();
		obj.sum();
		obj.sum(10,20);
		obj.sum(10,20,30,40);
		obj.sum(10,20,30,40,5,5);
	}
}
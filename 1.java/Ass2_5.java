//Write a class Calculate having methods to add two integer and two float number and
//two string as following:
//int add(int a , int b)
//float add(float a , float b)
//String add(String s1 , String s2)
//Create an object of Calculate class and use above methods.
class calculate
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	String add(String a,String b)
	{
		return a+b;
	}
}
class Ass2_5
{
	public static void main(String[] args)
	{
		calculate c=new calculate();
		System.out.println("Addition of integers:"+c.add(10,20));
		System.out.println("Addition of floats:"+c.add(25.5f,24.5f));
		System.out.println("Addition of Strings:"+c.add("hello"," ji"));
	}
}
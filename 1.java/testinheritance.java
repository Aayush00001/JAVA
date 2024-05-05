//example of hiersrchical inheritance example
class animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class cat extends animal
{
	void meaw()
	{
		System.out.println("meawing");
	}
}
class testinheritance
{
	public static void main(String args[])
	{
		cat c=new cat();
		c.meaw();
		c.eat();	
	}
}
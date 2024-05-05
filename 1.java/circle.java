//ex of consutrctor overloading
class circle
{
	int r;
	circle()
	{
		r=5;
	}
	circle(int radius)
	{
		r=radius;
	}
	void calarea()
	{
		System.out.println("area is:"+3.14*r*r);
	}
}
class demo_circle
{
	public static void main(String args[])
	{
		circle c1=new circle();
		circle c2=new circle(10);
		c1.calarea();
		c2.calarea();
	}
}
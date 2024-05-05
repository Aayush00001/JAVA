//example of copy consturctor
class circle1
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
	circle(circle c)
	{
		r=c.r;
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
		circle c2=new circle(2);
		circle c4=c1;
		c1.calarea();
		c2.calarea();
		c3.calarea();
		c4.calarea();
		c1.r=15;
		c1.calarea();
		c4.calarea();
	}
}
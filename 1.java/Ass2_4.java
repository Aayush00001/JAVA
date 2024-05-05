//Write a Java program which creates the Triangle class with two attributes base and
//height of type float or double. Takes the two constructors of the Triangle class.
//First constructor takes the default value for base and height and Second Constructor
//takes base and height as a parameter. Create a method calcArea() to calculate the
//area of the Triangle. Define a main method and create objects to the class and print
//the area of the Triangle.
class triangle
{
	float height;
	double base;
	triangle()
	{
		height=10f;
		base=50;
	}
	triangle(float a,double b)
	{
		base=b;
		height=a;
	}
	void calarea()
	{
		System.out.println("area is:->"+(0.5*(base*height)));
	}
}
class Ass2_4
{
	public static void main(String args[])
	{
		triangle s1=new triangle();
		s1.calarea();
		triangle s2=new triangle(200f,20);
		s2.calarea();
	}
}
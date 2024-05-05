//paarmeterized method
class bank1
{
	double p,r;
	int n;
	void main(double pa,double raint ny)
	{
		p=pa;
		r=ra;
		n=ny;
	}
	double SimpleInterest()
	{
		return(p*r*n/100);
	}
}
class bank_demo
{
	public static void main(String args[])
	{
		bank b1=new bank();
		bank b2=new bank();
		b1.setdata(5000,12,5);
		b2.setdata(10000,12,5);
		double si=b1.SimpleInterest();
		System.out.println("simple Interest is"+si);
		System.out.println("simple interest:+b2.simple Interest()");
	}
}
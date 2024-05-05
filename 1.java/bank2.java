//ex of default constuctor
class bank2
{
	double p,r;
	int n;
	bank()
	{
		p=5000;r=12;n=5;
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
		bank b1=newbank();
		bank b2=newbank();
		double si=b1.SimpleInterest();
		System.out.println("Simple Interest is:"+si);
		si=b2.SimpleInterest();
		System.out.println("Simple Interest is:"+si);
	}
}
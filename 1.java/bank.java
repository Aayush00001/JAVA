//simple interest using clasa and object
class bank
{
	double p,r;
	int n;
	double SimpleInt()
	{
		return((p*r*n)/100);
	}
}
class bank_demo
{
	public static void main(String args[])
	{
		bank b1=new bank();
		b1.p=10000;
		b1.r=10;
		b1.n=5;
		double s=h1.SimoleInt();
		System.out.println("simple Interest is"+s);
	}
}
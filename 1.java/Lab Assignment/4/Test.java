class Test 
{   
	int p,r,n;
	Test(int p,int r,int n)
	{
		this.p=p;
		this.r=r;
		this.n=n;
	}
	void cal() 
	{ 
		System.out.println("Simple Intrest is:"+((p*r*n)/100));
	}
	public static void main(String[] args) 
	{ 
		int p = Integer.parseInt(args[0]);  
		int r = Integer.parseInt(args[1]); 
		int n = Integer.parseInt(args[2]);  
		
		Test obj = new Test(p,r,n); 
		obj.cal();
	}
}
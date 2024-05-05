class Demo 
{ 
	int sub(int x,int y) 
	{ 
		return(x-y);
	} 
	double sub(double x,double y) 
	{ 
		return(x-y);
	}  
	public static void main(String[] args) 
	{ 
		Demo obj = new Demo(); 
		int sub_int=obj.sub(10,20); 
		double sub_double=obj.sub(10.50,50.25); 
		System.out.println("Substraction is:"+sub_int); 
		System.out.println("Substraction is:"+sub_double);
	}
}
class Box 
{ 
	double width,height,depth; 
	Box() 
	{ 
		width=5.5; 
		height=5.10; 
		depth=10.50;
	} 
	Box(double w,double h,double d) 
	{ 
		width=w; 
		height=h; 
		depth=d;
	} 	
	double volume() 
	{ 
		return(width*height*depth);
	}
	public static void main(String[] args) 
	{ 
		Box obj = new Box(); 
		Box obj_p = new Box(5.50,6.40,7.90);  
		System.out.println("Volume is:"+obj.volume());  
		System.out.println("Volume is:"+obj_p.volume());
		
	}
}
//w.a.p to acept five number as command linre argument and store into int array.print an int array
class array_ex
{
	public static void main(String args[])
	{
		int[]arr=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=Integer parseInt(args[i]);
		for(int j=0;j<5;j++)
			System.out.println(arr[j]);
	}
}
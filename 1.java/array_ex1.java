//w.a.p to store following matrix into array and print the matrix
class array_ex1
{
	public static void main(String args[])
	{
		int count=1;
		int[][]arr=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=count;
				count++;
			}
		}
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
				System.out.println();
		}
	}
}
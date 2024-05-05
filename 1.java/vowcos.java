//W.a.p to acept a character from command line argument and print whether it is vowel or consent othe than alphabets it will print invalid character
class vowcos
{
	public static void main(String args[])
	{
		char ch=args[0].Charart(0);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("vowel");
			}			
			else
			{
				System.out.println("consonent");
			}
		}
		else
		{
			System.out.println("INVALID CHARACTER");
		}
	}
}
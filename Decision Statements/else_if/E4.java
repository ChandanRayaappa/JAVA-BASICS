class E4 
{
	public static void main(String[] args) 
	{
		int a=126;
		if (a>=65 && a<=90 || a>=97 && a<=122)
		{
			System.out.println(a+" is alphabet");
		}
		else if (a>=48 && a<=57)
		{
			System.out.println(a+" is digit");
		}
		else if(a>=33 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96 || a>=123 && a<=126)
		{
			System.out.println(a+" is a special character");
		}
	}
}
		
class M1 
{
	public static long fact(long n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
		System.out.println("Factorial is: " +fact(5));
	}
}

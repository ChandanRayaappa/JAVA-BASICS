class neon
{
	public static void main(String[] args) 
	{
		int num=9,sum=0;
		int sq=num*num;
		while (sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (sum==num)
			System.out.println(num+" is neon number");
		else
			System.out.println(num+" is not neon number");
	}
}

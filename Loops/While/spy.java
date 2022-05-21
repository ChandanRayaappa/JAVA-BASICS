class spy 
{
	public static void main(String[] args) 
	{
		int num=123,sum=0,prod=1;
		int temp=num;
		while (num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if (sum==prod)
			System.out.println(temp+" is spy number");
		else
			System.out.println(temp+" is  not spy number");
	}
}

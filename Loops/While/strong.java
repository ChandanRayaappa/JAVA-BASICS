class strong 
{
	public static void main(String[] args) 
	{
		int num=145,temp=num,sum=0;
		while (num>0)
		{
			int fact=1;
			int rem=num%10;
			while (rem>0)
			{
				fact=fact*rem--;
			}
			sum=sum=fact;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is strong number");
		else
			System.out.println(temp+" is not strong number");
	}
}

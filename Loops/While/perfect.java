class perfect 
{
	public static void main(String[] args) 
	{
		int num=28,sum=0,temp=num;
		int i=1;
		while (i<=num/2)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		i++;
		}
		if (sum==temp)
			System.out.println(temp+" is perfect number");
		else
			System.out.println(temp+" is not perfect number");
	}
}

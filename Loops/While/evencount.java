class evencount 
{
	public static void main(String[] args) 
	{
		int a=1,count=0;
		while(a<=20)
		{
			if(a%2==0)
			{
				count++;
			}
		a++;
		}
		System.out.println("The total number of even number between 1 to 20 is: "+count);
	}
}

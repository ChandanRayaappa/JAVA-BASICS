class divcount 
{
	public static void main(String[] args) 
	{
		int a=1,count=0;
		while(a<=500)
		{
			if(a%7==0 && a%5==0)
			{
				count++;
			}
		a++;
		}
		System.out.println("Total numbers between 1 to 500 are: "+count);
	}
}

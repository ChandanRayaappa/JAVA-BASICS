class E1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("main begin");
			int a=10;
			System.out.println("a: "+a);
			int b=0;
			System.out.println("b: "+b);
			int res=a/b;
			System.out.println("Result: "+res);
		}
		catch (Exception e)
		{
			System.out.println("Enter positive number");
		}
		System.out.println("Main end");
	}
}

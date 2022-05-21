class T1 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("MAin Thread Begin");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		for (int i=1;i<=5 ;i++ )
		{
			System.out.println("i: "+i);
			Thread.sleep(2000);
		}
		System.out.println("Main Thread end");
	}
}

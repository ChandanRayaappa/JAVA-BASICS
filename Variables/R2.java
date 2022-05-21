class R2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		int a=20;
		{
			System.out.println("Inner Block Begin");
			System.out.println(a);
			System.out.println("Inner block end");
		}
		System.out.println(a);
		System.out.println("Main End");
	}
}

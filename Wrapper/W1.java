class W1 
{
	public static void print(Integer b)
	{
		System.out.println("From Integer");
	}
	public static void print(int b)
	{
		System.out.println("From int");
	}
	public static void main(String[] args) 
	{
		print(10);
		print(Integer.valueOf(10));//Explicit Boxing
	}
}

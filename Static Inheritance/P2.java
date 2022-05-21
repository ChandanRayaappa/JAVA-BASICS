class P1 
{
	static void test()
	{
		System.out.println("From test() method");
	}
}
class P2 extends P1
{
	public static void main(String[] args)
	{
		System.out.println("From main method");
		test();
	}
}
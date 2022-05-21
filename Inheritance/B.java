class  A
{
	static
	{
		System.out.println("SIB of class A");
	}
	static int i=10;
}
class B extends A
{
	static
	{
		System.out.println("SIB of class B");
	}
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

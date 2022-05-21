class  A
{
	static int a=10;
}
class c extends A
{
	static int b=20;
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(c.a);
		System.out.println(c.b);
	}
}

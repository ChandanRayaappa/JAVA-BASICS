class incdecopr1 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=++a + 30;
		int c=b++ + a++ -10;
		int d=a++ + b++ - ++c - ++a;
		System.out.println(a++);
		System.out.println(--b);
		System.out.println(--c);
		System.out.println(++d);
	}
}

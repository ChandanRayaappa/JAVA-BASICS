class incdecopr 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=++a - 10;
		int c=a-- + b++;
		int d=a++ + b-- - ++c + ++a;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c++);
		System.out.println(++d);
	}
}

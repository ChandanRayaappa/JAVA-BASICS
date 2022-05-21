class Add  
{
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		System.out.println(args);
		System.out.println(args.length);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(args[0]);
		System.out.println(args[1]);
		int res=a+b;
		System.out.println(res);
	}
}

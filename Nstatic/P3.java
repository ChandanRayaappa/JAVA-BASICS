class P3  
{
	int a=test();
	int test() 
	{
		System.out.println("Test Begin");
		System.out.println("a: "+a);
		System.out.println("this: "+this);
		System.out.println("Test End");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		P3 obj=new P3();
		System.out.println("Obj: "+obj);
		System.out.println(obj.a);
		System.out.println("-----------");

		P3 obj1=new P3();
		System.out.println("Obj1: "+obj1);
		System.out.println(obj1.a);
		System.out.println("Main End");
	}
}

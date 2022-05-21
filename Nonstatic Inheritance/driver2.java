class Demo1  
{
	
	Demo1()
	{
		System.out.println("FRom Demo1()");
	}
	{
		System.out.println("IIB-1 of class Demo1()");
	}
	Demo1(int i)
	{
		this();
		System.out.println("FRom Demo1(int)");
	} 
	static
	{
		System.out.println("Static 1");
	}
}

class Demo2 extends Demo1 
{
	static
	{
		System.out.println("Static 2");
	}
	Demo2()
	{
		super(10);
		System.out.println("FRom Demo2()");
	}
	{
		System.out.println("IIB-1 of class Demo2()");
	}
	Demo2(int i)
	{
		System.out.println("FRom Demo2(int)");
	}
}

class driver2
{
	public static void main(String[] args)
	{
		new Demo2(10);
		System.out.println("----------");
		new Demo2();
		System.out.println("----------");
		new Demo1(10);
	}
}
/*
Static 1
Static 2
IIB-1 of class Demo1()
FRom Demo1()
IIB-1 of class Demo2()
FRom Demo2(int)
----------
IIB-1 of class Demo1()
FRom Demo1()
FRom Demo1(int)
IIB-1 of class Demo2()
FRom Demo2()
----------
IIB-1 of class Demo1()
FRom Demo1()
FRom Demo1(int)
*/

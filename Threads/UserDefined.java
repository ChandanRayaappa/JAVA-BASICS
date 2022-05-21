class  Employee extends Thread
{
	String name;
	Employee(){}
	Employee(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public void print() throws Exception
	{
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Name: "+name+"---->"+i);
			Thread.sleep(2000);
		}
	}
	public void run()
	{
		try
		{
			print();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

class UserDefined
{
	public static void main(String[] args) 
	{
		Employee E1=new Employee("Smith");
		Employee E2=new Employee("Miller");
		E1.start();
		E2.start();
		
	}
}

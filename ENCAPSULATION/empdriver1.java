class emp 
{
	private int id;
	//To create getter
	int getId()
	{
		return id;
	}
	private String name;
	//To create getter & setter
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	private double sal;
	double getSal()
	{
		return sal;
	}
	emp(){}
	emp(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	//Behaviors
	public void login()
	{
		System.out.println("Logged in Successfully");
	}
	public void logout()
	{
		System.out.println("Logged out successfully");
	}	
}

class empdriver1
{
	public static void main(String[] args)
	{
		emp e1=new emp(121,"RAAHUL",50000);
		System.out.println(e1.getName());
		System.out.println(e1.getSal());
		System.out.println(e1.getId());
		e1.setName("RAHUL");
		System.out.println(e1.getName());
	}
}
 
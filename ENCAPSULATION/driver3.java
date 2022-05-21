class student
{
	String name;
	student(){}
	student(String name)
	{
		this.name=name;
	}
	void bunk()
	{
		System.out.println("No job...!");
	}
}
class college
{
	String name;
	student s1;
	college(){}
	college(String name)
	{
		this.name=name;
	}
	void admission(String name)
	{
		s1=new student(name);
		System.out.println(name+" is admitted to the college"+this.name);
	}
}
class driver3
{
	public static void main(String[] args)
	{
		college c1=new college("QSPIDER");
		System.out.println(c1.name);
		c1.admission("Sheela");
		System.out.println(c1.s1.name);
		c1.s1.bunk();


	}
}

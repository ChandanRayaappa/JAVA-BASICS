class remote
{
	double price;
	void operate()
	{
		System.out.println("Tv is operated from sitting");
	}
}
class Tv
{
	String company;
	remote r1=new remote();
	void watch()
	{
		System.out.println("Watch Movies");
	}
}
class driver2
{
	public static void main(String[] args)
	{
		Tv t1=new Tv();
		t1.r1.price=50;
		System.out.println(t1.r1.price);
		t1.watch();
		t1.company="SONY";
		System.out.println(t1.company);
		t1.r1.operate();
	}
}

class Engine 
{
	double cc;
	void combustion()
	{
		System.out.println("Power is Generated");
	}
}
class Car
{
	double mileage;
	Engine e1=new Engine();
	void drive()
	{
		System.out.println("Long DRive");
	}
}
class Driver1
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.mileage=15;
		System.out.println(c1.mileage);
		c1.drive();
		c1.e1.cc=1200;
		System.out.println(c1.e1.cc);
		c1.e1.combustion();
	}
}

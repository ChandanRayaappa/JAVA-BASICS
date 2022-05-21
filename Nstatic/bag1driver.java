class  bag1driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		bag1 a=new bag1();
		a.name="Dell";
		a.color="Black";
		a.price=500;

		bag1 a1=new bag1();
		a1.name="HP";
		a1.color="Gray";
		a1.price=600;

		bag1 a2=new bag1();
		a2.name="Acer";
		a2.color="Red";
		a2.price=800;
		
		a.details();
		a1.details();
		a2.details();
	}
}

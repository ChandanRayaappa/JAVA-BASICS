class  laptop1driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		laptop1 a=new laptop1();
		a.company="Dell";
		a.price=25000;
		a.ram=4;

		laptop1 a1=new laptop1();
		a1.company="HP";
		a1.price=55000;
		a1.ram=8;

		laptop1 a2=new laptop1();
		a2.company="Acer";
		a2.price=35000;
		a2.ram=6;

		a.details();
		a1.details();
		a2.details();
	}
}

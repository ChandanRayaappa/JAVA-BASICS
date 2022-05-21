class Pen1driver 
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		Pen1 a=new Pen1();
		a.id=1;
		a.color="Black";
		a.price=10;

		Pen1 a1=new Pen1();
		a1.id=2;
		a1.color="Red";
		a1.price=10;

		Pen1 a2=new Pen1();
		a2.id=3;
		a2.color="Green";
		a2.price=10;

		a.details();
		a1.details();
		a2.details();
	}
}

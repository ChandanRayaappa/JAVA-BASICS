class  ac_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		ac a=new ac();
		a.company="LG";
		a.color="White";
		a.price=5000;

		ac a1=new ac();
		a1.company="Sony";
		a1.color="Blue";
		a1.price=8000;
		System.out.println("AC company: "+a.company);
		System.out.println("AC color: "+a.color);
		System.out.println("AC price: "+a.price);
		System.out.println("AC company: "+a1.company);
		System.out.println("AC color: "+a1.color);
		System.out.println("AC price: "+a1.price);
	}
}

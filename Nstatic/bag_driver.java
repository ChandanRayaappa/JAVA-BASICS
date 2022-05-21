class  bag_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		bag a=new bag();
		a.name="Dell";
		a.color="Black";
		a.price=500;

		bag a1=new bag();
		a1.name="HP";
		a1.color="Gray";
		a1.price=600;
		System.out.println("bag name: "+a.name);
		System.out.println("Bag color: "+a.color);
		System.out.println("BAg price: "+a.price);
		System.out.println("bag name: "+a1.name);
		System.out.println("Bag color: "+a1.color);
		System.out.println("BAg price: "+a1.price);
	}
}

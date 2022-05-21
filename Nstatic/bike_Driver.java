class  bike_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		bike a=new bike();
		a.company="Enfield";
		a.price=100000;
		a.type="Gear";

		bike a1=new bike();
		a1.company="Jupiter";
		a1.price=90000;
		a1.type="Gearless";
		System.out.println("Bike company: "+a.company);
		System.out.println("Bike price: "+a.price);
		System.out.println("Bike type: "+a.type);
		System.out.println("Bike company: "+a1.company);
		System.out.println("Bike price: "+a1.price);
		System.out.println("Bike type: "+a1.type);
	}
}

class  Tiger_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		Tiger a=new Tiger();
		a.id=426;
		a.weight=500;
		a.country="India";

		Tiger a1=new Tiger();
		a1.id=952;
		a1.weight=700;
		a1.country="India";
		System.out.println("Tiger ID: "+a.id);
		System.out.println("Tiger Weight: "+a.weight);
		System.out.println("Tiger Country: "+a.country);
		System.out.println("Tiger ID: "+a1.id);
		System.out.println("Tiger Weight: "+a1.weight);
		System.out.println("Tiger Country: "+a1.country);
	}
}

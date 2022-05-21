class  book1driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		book1 a=new book1();
		a.author="Jackson";
		a.price=500;
		a.edition=5;

		book1 a1=new book1();
		a1.author="Wilson";
		a1.price=800;
		a1.edition=7;

		book1 a2=new book1();
		a2.author="Tom";
		a2.price=900;
		a2.edition=4;

		a.details();
		a1.details();
		a2.details();
	}
}
 

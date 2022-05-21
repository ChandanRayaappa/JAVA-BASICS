class  book_Driver
{
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		book a=new book();
		a.author="Jackson";
		a.price=500;
		a.edition=5;

		book a1=new book();
		a1.author="Wilson";
		a1.price=800;
		a1.edition=7;
		System.out.println("Book author: "+a.author);
		System.out.println("Book price: "+a.price);
		System.out.println("Book edition: "+a.edition);
		System.out.println("Book author: "+a1.author);
		System.out.println("Book price: "+a1.price);
		System.out.println("Book edition: "+a1.edition);	
	}
}
 

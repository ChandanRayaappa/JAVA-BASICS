class E3
{
	public static void main(String[] args) 
	{
		int a=75;
		if (a>=40 && a<=50)
		{
			System.out.println(a+" belongs to A categroy");
		}
		else if(a>=51 && a<=60)
		{
			System.out.println(a+" belongs to B categroy");
		}
		else if(a>=61 && a<=70)
		{
			System.out.println(a+" belongs to C categroy");
		}
		else if(a>=71 && a<=80)
		{
			System.out.println(a+" belongs to D categroy");
		}
		else if(a>80)
		{
			System.out.println(a+" belongs to E categroy");
		}
		else
		{
			System.out.println("You Under Weight Better luck next time");
		}
	}
}

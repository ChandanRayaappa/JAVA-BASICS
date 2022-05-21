class P6 
{
	static int i=10;
	int j=20;
	static 
	{
		i=30;
		i=mala();
	}
	{
		j=10;
		j=leela();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		P6 obj1=new P6();
		System.out.println(obj1.mala());
		System.out.println(obj1.sheela());
		System.out.println(obj1.leela());
		System.out.println(obj1.laila());
		System.out.println(obj1);
		System.out.println("Main End");
	}
	public static int mala()
	{
		System.out.println("Mala Begin");
		System.out.println("Static Variable i= "+i);
		System.out.println("Static Variable k= "+k);
		System.out.println("Mala End");
		return 50;
	}
	public int laila()
	{
		System.out.println("Laila Begin");
		System.out.println("This= "+this);
		System.out.println("Static Variable i= "+i);
		System.out.println("Non Static Variable j= "+j);
		System.out.println("Static Variable k= "+k);
		System.out.println("Non Static Variable l= "+l);
		System.out.println("Laila End");
		return 100;
	}
	public static int sheela()
	{
		System.out.println("Sheela Begin");
		System.out.println("Static Variable i= "+i);
		System.out.println("Static Variable k= "+k);
		System.out.println("Sheelaa End");
		return 150;
	}
	public int leela()
	{
		System.out.println("Leela Begin");
		System.out.println("This= "+this);
		System.out.println("Static Variable i= "+i);
		System.out.println("Non Static Variable j= "+j);
		System.out.println("Static Variable k= "+k);
		System.out.println("Non Static Variable l= "+l);
		System.out.println("Leela End");
		return 200;
	}
	static int k=30;
	int l=40;
	static
	{
		k=20;
		k=sheela();
	}
	{
		l=30;
		l=laila();
	}
}
class  Laptop implements Comparable
{
	int lapno;
	String name;
	double price;

	Laptop(){}
	Laptop(int lapno,String name,double price)
	{
		this.lapno=lapno;
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return name+"= "+lapno+" ";
	}
	public int compareTo(Object o)
	{		
		Laptop l1=(Laptop)o;
		if(this.lapno>l1.lapno)
			return 1;
		else if(this.lapno==l1.lapno)
			return 0;
		else
			return -1;
	}
	/*public int compareTo(Object o)
	{
		return this.name.compareTo(((Employee)o).name);
	}*/
}
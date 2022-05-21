class SA 
{
	private int acno;
	//To create getter
	int getAcno()
	{
		return acno;
	}
	private String name;
	//To create getter & setter
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	private double bal;
	double getBal()
	{
		return bal;
	}
	private String ifsc;
	String getIfsc()
	{
		return ifsc;
	}
	void setIfsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	SA(){}
	SA(int acno,String name,double bal,String ifsc)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
	}
	//Behaviors
	public double withdraw(double amount)
	{
		if(bal>amount)
		{
			bal-=amount;
			System.out.println(amount+" is debited from your account");
			return bal;
		}
		else
		{
			System.out.println("Insufficient Balance");
			return bal;
		}
	}
}

class SAdriver1
{
	public static void main(String[] args)
	{
		SA a1=new SA(101,"Sheeela",100020,"sminb433");
		System.out.println(a1.getBal());
		System.out.println(a1.withdraw(15000));
		a1.setName("Sheela");
		System.out.println(a1.getName());
	}
}

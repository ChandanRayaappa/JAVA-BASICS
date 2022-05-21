class acno
{
	int accno;
	acno(){}
	acno(int accno)
	{
		this.accno=accno;
	}
	void acc()
	{
		System.out.println("Successfully ACCOUNT created");
	}
}
class bank
{
	String name;
	acno a1;
	bank(){}
	bank(String name)
	{
		this.name=name;
	}
	void admission(int acno)
	{
		a1=new acno(acno);
		System.out.println(acno+" is admitted to the bank "+this.name);
	}
}
class driver4
{
	public static void main(String[] args)
	{
		bank b1=new bank("SBI");
		System.out.println(b1.name);
		b1.admission(123456);
		System.out.println(b1.a1.accno);
		b1.a1.acc();
	}
}

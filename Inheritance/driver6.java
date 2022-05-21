class account  
{
	int acno;
	String name;
	double bal;
	String ifsc;

	account(){}
	account(int acno,String name,double bal,String ifsc)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
	}
	public void display()
	{
		System.out.println("Account Number is: "+acno);
		System.out.println("Account Holders name is: "+name);
		System.out.println("Account Balance is: "+bal);
		System.out.println("Branch IFSC code is: "+ifsc);
	}	
}

class SA extends account
{
	SA(){}
	SA(int acno,String name,double bal,String ifsc)
	{
		super(acno,name,bal,ifsc);
	}
}

class CA extends account
{
	String gst;
	CA(){}
	CA(int acno,String name,double bal,String ifsc,String gst)
	{
		super(acno,name,bal,ifsc);
		this.gst=gst;
	}
	public void display()
	{
		super.display();
		System.out.println("GST Number is: "+gst);
		System.out.println("=====================");
	}	
}

class LA extends account
{
	double loanamt;
	double emi;
	LA(){}
	LA(int acno,String name,double bal,String ifsc,double loanamt,double emi)
	{
		super(acno,name,bal,ifsc);
		this.loanamt=loanamt;
		this.emi=emi;
	}
	public void display()
	{
		super.display();
		System.out.println("Loan Amount is: "+loanamt);
		System.out.println("Loan EMI: "+emi);
		System.out.println("===================");
	}	
}
 
class driver6
{
	public static void main(String[] args)
	{
	//To create SA
	SA a1=new SA(101,"Rahul",10000,"ICICI001");
	a1.display();
	//To create CA
	CA a2=new CA(102,"Rakesh",15000,"ICICI001","abcd123");
	a2.display();
	//To create Loan
	LA a3=new LA(103,"Ramesh",25000,"ICICI001",10000,5000);
	a3.display();
	}
}

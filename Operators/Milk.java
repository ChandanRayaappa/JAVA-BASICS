class Milk 
{
	public static void main(String[] args) 
	{
		double contn=2500;
		double volume=contn/2;
		double glass_vol=150;
		int nos_of_glass=(int)(volume/glass_vol);
		System.out.println("Container capacity: "+contn);
		System.out.println("One glass vol is: "+glass_vol);
		System.out.println("Number of glass required: "+nos_of_glass);
	}
}

class Frog 
{
	public static void main(String[] args) 
	{
		int total_dist=150;
		int mjnu_one_hop=5;
		int mjnu_to_hops=total_dist/mjnu_one_hop;
		System.out.println("Total distance between A & B: "+total_dist);
		System.out.println("Majnu's per hop: "+mjnu_one_hop);
		System.out.println("Number of hops of Majnu: "+mjnu_to_hops);
	}
}

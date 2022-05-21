class  sepr
{
	public static void main(String[] args) 
	{
		int num=46755545;
		while(num>0)
		{
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}	
	}
}


/*F:\QSP\QACM1\JP\Loops\While>java sepr
5
4
5
5
5
7
6
4
*/

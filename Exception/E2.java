import java.util.Scanner;
import java.util.*;
class E2 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value for numerator");
			int num=s.nextInt();
			System.out.println("Enter the value for denominator");
			int den=s.nextInt();
			int res=num/den;
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please enter only number");
		}
		catch (Exception e)
		{
			System.out.println("Pass only positive number");
		}
	}
}

class S9
{
	public static void main(String[] args) 
	{
		char ch='9';
		if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			switch (ch)
			{
				case('A'):
				case('E'):
				case('I'):
				case('O'):
				case('U'):
				case('a'):
				case('e'):
				case('i'):
				case('o'):
				case('u'):System.out.println(ch+" is vowel");
				break;
				default:System.out.println(ch+" is consonant");
			}
		}
		else 
			System.out.println("Please enter only Alphabet");
	}
}

class BlankSpace
{
	public static void main(String args[])
	{
		String str = "I love java programming . Java is object oriented programming language ";
		char ch = '?';
		
		str=str.replaceAll("\\s","");

		System.out.println("String after replacing all spaces : ");
		System.out.println(str);
	}
}
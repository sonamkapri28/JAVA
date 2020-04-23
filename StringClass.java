class StringClass
{
	public static void main(String args[])
	{
		String str = "Bciit Students";
		System.out.print("Original String : " + str);

		System.out.print("\n\nLength of String : " + str.length());

		System.out.print("\n\nCharacter at a particular index : " + str.charAt(2));

		System.out.print("\n\nSubstring from String : " + str.substring(3,7));

		System.out.print("\n\nIndex of a particular character : " + str.indexOf("d"));

		System.out.print("\n\nLast index of a string : " + str.lastIndexOf("t"));

		System.out.print("\n\nIn Lower Case : " + str.toLowerCase());

		System.out.print("\n\nIn Upper Case : " + str.toUpperCase());

		System.out.print("\n\n Trim out : " +str.trim());

		String s1="HELLO";
		String s2="WORLD";
		
		System.out.print("\n\nString s1 : " + s1);

		System.out.print("\n\nString s2 : " + s2);
		
		System.out.println("\n\nConcatenation of two strings : " + s1.concat(s2));
	}
}
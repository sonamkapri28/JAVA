class VowCon
{
	public static void main(String args[])
	{
		int vcount = 0, count = 0;
		String str = "the house is big . the girl has beautiful doll";

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vcount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				count++;
			}
		}
		System.out.println("Number of vowels : " + vcount);
		System.out.println("Number of consonants : " + count);
	}
}
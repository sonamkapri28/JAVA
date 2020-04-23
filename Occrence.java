class Occrence
{
	static int countOccurence(String str, String word)
	{
		String a[] = str.split(" ");
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		String str = "the house is big . the girl has beautiful doll";
		String word = "the";
		System.out.println("Total no of occurence of the is : " + countOccurence(str,word));
	}
}
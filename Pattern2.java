class Pattern2
{
	public static void main(String args[])
	{
		int arr[][] = new int[6][6];
		int k=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print("  ");
				}
				else
				{
					arr[i][j]=k;
					System.out.print(arr[i][j]+"  ");
					k++;
				}	
			}
			System.out.println(" ");
		}
	}
}
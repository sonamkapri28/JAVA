class Pattern1
{
	public static void main(String args[])
	{
		int arr[][] = new int[4][4];
		int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				arr[i][j]=k;
				System.out.print(arr[i][j]+" ");
				k++;	
			}
			System.out.println("");
		}
	}
}
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int min,max,flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.print("Enter minimum limit : ");
		min=obj.nextInt();
		System.out.print("Enter maximum limit : ");
		max=obj.nextInt();
		for(int i=min;i<=max;i++)
		{
			if(i==0||i==1)
			{
				System.out.println("0 or 1 are out of prime number category");
			}
			else
			{
				for(int j=2;j<i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
					else
					{
						flag=0;
					}
				}
				if(flag==1)
				{}
				else
				{
					System.out.println(i);	
				}
			}
		}
	}
}
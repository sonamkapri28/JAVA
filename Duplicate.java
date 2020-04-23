import java.util.Scanner;
public class Duplicate
{
	
	int arr[]=new int [10];
	int n,i,j,k,s;
	Scanner obj = new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter array size : ");
		n=obj.nextInt();

		System.out.print("Enter array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
	}
	public void remove()
	{
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					s=j;
					for(k=j+1;k<n;k++)
					{
						arr[s]=arr[k];
						s=i;
					}
					n--;j--;
				}
			}
		}
		
	}
	public void display()
	{
		System.out.print("Array after elimination : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String args[])
	{	
		Duplicate ob =new Duplicate();
		ob.input();
		ob.remove();
		ob.display();
	}
}
import java.util.Scanner;

class Sumofno
{
	public static void main(String args[])
	{
		int arr[] = new int [10];
		int n,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.print("Enter array size : ");
		n=obj.nextInt();
		System.out.print("Enter array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of numbers in given array " + sum);
	}
}
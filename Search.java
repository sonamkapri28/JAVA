import java.util.Scanner;

class Search
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int n,i,choice;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.print("Enter array limit : ");
		n=obj.nextInt();
		System.out.print("Enter array : ");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("1.Linear Search \n2.Binary Search");
		System.out.print("Enter the choice : ");
		choice=obj.nextInt();
		Search ob =new Search();
		switch(choice)
		{
			case 1:	int nu;
				System.out.print("Enter the number you want to search : ");
				nu=obj.nextInt();
				ob.linear(a,n,nu);
				break;
			case 2:int num;
				System.out.print("Enter the number you want to search : ");
				num=obj.nextInt();
				ob.binary(a,n,num);
				break;
			default:System.out.println("Invalid choice");
				break;
		}
	}
	void linear(int a[],int n,int num)
	{
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Element is found at position " + (i+1));
				break;
			}
		}
	}
	void binary(int a[],int n,int num)
	{
		int low,mid,high;
		low=0;
		high=n-1;
		mid=(low+high)/2;
		while(low <= high)
		{
			if(num==a[mid])
			break;
			else if(num>a[mid])
			low=mid+1;
			else
			high=mid-1;
		}
		System.out.println("Element is found at position " + (mid+1));	
	}
}
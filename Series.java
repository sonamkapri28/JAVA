import java.util.Scanner;

class Series
{
	 static int factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	 static double sum(int n)
	{
		double sum=0;
		for(int i=1;i<n;i++)
		{
			sum=sum+1.0/factorial(i);
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Sonam");
		System.out.println("Enter the limit of series : ");
		int n=obj.nextInt();
		System.out.println("Sum of series is " + sum(n));
	}
}
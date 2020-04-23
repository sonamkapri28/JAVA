import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{	
		int f1=0,f2=1,next,n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.println("Enter the limit : ");
		n=obj.nextInt();
	
		System.out.println("Fibonacci series : " + f1 + f2 );

		for(int i=0;i<n;i++)
		{
			next=f1+f2;
			f1=f2;
			f2=next;
			System.out.println(next);
		}
	}
}
	
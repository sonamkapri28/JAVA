import java.util.Scanner;

class Armstrong
{
	public static void main(String args[])
	{
		int num,temp,rev,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.print("Enter number : ");
		num=obj.nextInt();
		temp=num;
		while(num>0)
		{
			rev=num%10;
			sum+=rev*rev*rev;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp + "is an Armstrong number ");
		}
		else
		{
			System.out.println(temp + "is not an Armstrong number ");
		}
	}
}
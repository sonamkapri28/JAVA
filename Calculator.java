import java.util.Scanner;

class Calculator
{
	public static void main(String args[])
	{
		int choice,n1,n2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Sonam");
		System.out.println("Enter first number : ");
		n1=obj.nextInt();
		System.out.println("Enter second number : ");
		n2=obj.nextInt();

		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Divide \n5.Mode");
		System.out.println("Enter the choice : ");
		choice=obj.nextInt();

		switch(choice)
		{
			case 1:int sum=n1+n2;
				System.out.println(n1 + "+" + n2 + "=" + sum);
				break;

			
			case 2:int sub=n1-n2;
				System.out.println(n1 + "-" + n2 + "=" + sub);
				break;

			
			case 3:int mul=n1*n2;
				System.out.println(n1 + "*" + n2 + "=" + mul);
				break;

			
			case 4:int div=n1/n2;
				System.out.println(n1 + "/" + n2 + "=" + div);
				break;

			
			case 5:int mod=n1%n2;
				System.out.println(n1 + "%" + n2 + "=" + mod);
				break;

			default:System.out.println("Invalid choice");
				break;
		}
	}
}
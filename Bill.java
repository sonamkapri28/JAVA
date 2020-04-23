import java.util.Scanner;
class Payment
{
	int no_of_product;
	double total_cost;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter total no of products : ");
		no_of_product=sc.nextInt();
		System.out.println("Enter cost of products : ");
		total_cost=sc.nextDouble();
	}
}
	class Online_Payment extends Payment
	{
		int pin_no;
		String mode;
		public void online_pay()
		{
			System.out.println("Enter pin no : ");
			pin_no=sc.nextInt();
			System.out.println("Enter mode : ");
			mode=sc.next();
		}
	}
	class Offline_Payment extends Payment
	{
		int amt;
		String name;
		public void offline_pay()
		{
			System.out.println("Enter amount : ");
			amt=sc.nextInt();
			System.out.println("Enter name : ");
			name=sc.next();
		}
	}
	class Bill
	{
		public static void main(String args[])
		{
			Online_Payment obj1 = new Online_Payment();
			obj1.input();
			obj1.online_pay();

			Offline_Payment obj2 = new Offline_Payment();
			obj2.input();
			obj2.offline_pay();
		}
	}

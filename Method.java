class Customer
{
	int amount=1000;
	synchronized void withdraw(int amt)
	{
		System.out.println("Going to Withdraw");
		if(amount < amt)
		{
			System.out.println("Less balance, Wait for deposite");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			amount-=amt;
			System.out.println("Withdrawl Complete");
		}
	}
	synchronized void deposit(int amt)
	{
		System.out.println("Going to Deposite");
		amount+=amt;
		System.out.println("Deposite Completed !");
		notify();	
	}
}
class Method
{
	public static void main(String args[])
	{
		Customer ob = new Customer();
		Thread t = new Thread()
		{
			public void run()
			{
				ob.withdraw(1500);
			}
		};
		t.start();

		Thread t1 = new Thread()
		{
			public void run()
			{
				ob.deposit(2000);
			}
		};
		t1.start();
	}
}
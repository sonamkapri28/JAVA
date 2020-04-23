class NewThread extends Thread
{
	NewThread()
	{
		super("Demo thread");
		System.out.println("Child thread " + this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child thread " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception in child thread");
		}
		System.out.println("Exiting the child thread");
	}
}
class MainThread
{
	public static void main(String args[])
	{
		new NewThread();
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Exception");
		}
		System.out.println("Exiting main thread");
	}
}
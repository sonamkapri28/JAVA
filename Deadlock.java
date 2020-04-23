public class Deadlock
{
	public static void main(String args[])
	{
		String res1 = "Hello";
		String res2 = "World";

		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized(res1)
				{
					System.out.println("Thread 1 locked resources 1 ");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(res2)
					{
						System.out.println("Thread 1 locked resources 2 ");
					}
				}
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				synchronized(res2)
				{
					System.out.println("Thread 2 locked resources 2 ");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized(res1)
					{
						System.out.println("Thread 2 locked resources 1 ");
					}
				}
			}
		};
		t1.start();
		t2.start();		
	}
}
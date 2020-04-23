class StaticKey
{
	static int a,b;
	static void fun()
	{
		a=10;
		b=10;
		System.out.println("In static method");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	static
	{
		System.out.println("In static block");
		b=a*20;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public static void main(String args[])
	{
		fun();
	}
}
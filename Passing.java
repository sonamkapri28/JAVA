class Passing
{
	int a,b;
	public Passing()
	{
		a=10;
		b=10;
		System.out.println("\nIn Default Constructor ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	public void cbv(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("\nIn Call by Value ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	public void cbr(Passing p)
	{
		p.a+=2;
		p.b-=2;
		System.out.println("\nIn Call by Reference ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	public static void main(String args[])
	{
		Passing ob1 = new Passing();
		ob1.cbv(20,40);
		Passing ob2 = new Passing();
		ob2.cbr(ob1);
	}
}
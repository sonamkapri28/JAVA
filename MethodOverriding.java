class A
{
	int i=20;
	public void display()
	{
		System.out.println("i : " + i);
	}
}
class B extends A
{
	int j=10;
	public void display()
	{
		System.out.println("j : " + j);
	}
}
class MethodOverriding
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.display();
	}
}
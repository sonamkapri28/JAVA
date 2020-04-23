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
class DynamicMethodDispatch
{
	public static void main(String args[])
	{
		A ref;

		A obj1 = new A();
		ref = obj1;
		obj1.display();

		B obj2 = new B();
		ref = obj2;
		obj2.display();
	}
}
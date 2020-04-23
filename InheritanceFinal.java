final class A
{
	void f1()
	{
		System.out.println("In class A normal f1 function ");
	}
	void f2()
	{
		System.out.println("In class A normal f2 function");
	}
}
class B extends A
{
	void f1()
	{
		System.out.println("In class B normal f1 function");	
	}
}
class InheritanceFinal
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.f1();
		obj.f2();
	}
}
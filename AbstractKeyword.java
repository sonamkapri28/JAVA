abstract class A
{
	abstract void f1();
	
	public void f2()
	{
		System.out.println("In non abstract method of abstract class");
	}
}
class B extends A
{
	public void f1()
	{
		System.out.println("In class B");
	}	
}
class C extends A
{
	public void f1()
	{
		System.out.println("In class C");
	}	
}
class AbstractKeyword
{
	public static void main(String args[])
	{
		A ref;

		B b = new B();
		ref = b;
		b.f2();
		b.f1();

		C c = new C();
		ref = c;
		c.f2();
		c.f1();
	}
}
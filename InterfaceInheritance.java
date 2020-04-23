interface i1
{
	public void f1();
}
interface i2
{
	public void f2();
}
interface i3 extends i1,i2
{
	public void f3();
}
class c1 implements i3
{
	public void f1()
	{
		System.out.println("I am in f1 function");
	}
	public void f2()
	{
		System.out.println("I am in f2 function");
	}
	public void f3()
	{
		System.out.println("I am in f3 function");
	}
}
class InterfaceInheritance
{
	public static void main(String args[])
	{
		c1 obj = new c1();
		obj.f1();
		obj.f2();
		obj.f3();
	}
}
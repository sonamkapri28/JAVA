class A
{
	A()
	{
		System.out.println("In A Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("In B Constructor");
	}
}
class C extends B
{
	C()
	{
		System.out.println("In C Constructor");
	}
}
class  D
{
	public static void main(String args[])
	{
		C obj=new C();
	}
}
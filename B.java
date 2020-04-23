class A
{
	int i,j;
	void f1()
	{
		System.out.println("In f1 function");
		i=10;
		j=20;
	}
}
class B extends A
{
	int i;
	void f2()
	{
		i=30;
		System.out.println("In f2 function");
		System.out.println("value of i of super class : " + super.i);
		System.out.println("value of j of super class : " + super.j);
		System.out.println("value of i of subclass : " + i);
	}
	public static void main(String args[])
	{
		B obj = new B();
		obj.f1();
		obj.f2();
	}
}
class A
{
	int i,j;
	void f1()
	{
		System.out.println("I am in f1 function");
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
}
class B extends A
{
	int k;
	void f2()
	{
		System.out.println("I am in f2 function");	
		System.out.println("k : "+k);
	}
}
class C
{
	public static void main(String args[])
	{
		A ref;
		B obj = new B();
		ref = obj;
		ref.i=10;
		ref.j=20;
		ref.f1();
		obj.k=30;
		obj.f2();
	}
}
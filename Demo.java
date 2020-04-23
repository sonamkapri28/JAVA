class A
{
	int k;
	A()
	{
		System.out.println("In A Constructor");
	}
	A(int c)
	{
		k=c;
		System.out.println("Value of k in A constructor " + k);
	}
}
class B extends A
{
	int j;
	B()
	{
		System.out.println("In B Constructor");
	}
	B(int b)
	{
		super(b);
		j=b;
		System.out.println("Value of j in B constructor " + j);
	}
}
class C extends B
{
	int i;
	C()
	{
		System.out.println("In C Constructor");
	}
	C(int a)
	{
		super(a);
		i=a;
		System.out.println("Value of i in C constructor " + i);
	}
}
class  Demo
{
	public static void main(String args[])
	{
		C obj=new C();
		C ob = new C(2);
	}
}
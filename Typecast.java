
class Typecast
{
	public void implicit()
	{
		int i=100;
		long l=i;
		float f=l;
		System.out.println("Sonam");
		System.out.println("Implicit");
		System.out.println("Int value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+f);
	}
	public void explicit()
	{
		double d=100.04;
		long l=(long)d;
		int i=(int)l;
		System.out.println("Explicit");
		System.out.println("Double value "+d);
		System.out.println("Long value "+l);
		System.out.println("Int value "+i);
	}
	public static void main(String args[])
	{
		Typecast obj = new Typecast();
		obj.implicit();
		obj.explicit();
	}
}
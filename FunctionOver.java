class FunctionOver
{
	int l,b,s;
	double r;
	public void Area(int x,int y)
	{
		l=x;
		b=y;
		System.out.println("Area of rectangle "+(x*y));
	}
	public void Area(int x)
	{
		s=x;
		System.out.println("Area of square "+(s*s));
	}
	public void Area(double x)
	{
		r=x;
		System.out.println("Area of circle "+(3.14*r*r));
	}
	public static void main(String args[])
	{
		FunctionOver obj = new FunctionOver();
		obj.Area(2,8);
		obj.Area(8);
		obj.Area(2);
	}
}
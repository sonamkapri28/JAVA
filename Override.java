import java.util.Scanner;
class Figure
{
	int a,b;
	Scanner obj = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter dimension : ");
		a=obj.nextInt();
		b=obj.nextInt();
	}	
}
class Rectangle extends Figure
{
	public void area()
	{
		System.out.println("Area of rectangle : " + (a*b));
	}
}
class Triangle extends Figure
{
	public void area()
	{
		System.out.println("Area of triangle : " + (0.5*a*b));
	}
}
class Override
{
	public static void main(String args[])
	{
		Figure ref;
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		ref=r;
		r.input();
		r.area();

		ref=t;
		t.input();
		t.area(); 
	}
}
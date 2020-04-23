import java.util.Scanner;
class Shape
{
	int l,b;
	Scanner obj=new Scanner(System.in);
	public void cal()
	{
		System.out.print("Enter length and breadth : ");
		l=obj.nextInt();
		b=obj.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle is  "+area);
	}
	public static void main(String args[])
	{
		System.out.println("Sonam");
		Shape ob1,ob2;
		Shape ob = new Shape();
		
		ob.cal();
		ob1=ob;
		ob1.cal();
		ob2=ob;
		ob2.cal();
	}
}
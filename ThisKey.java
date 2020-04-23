import java.util.Scanner;
class ThisKey
{	
	int x,y;
	public void Area(int  x,int b)
	{
		this.x=x;
		this.y=b;
		System.out.println("Area of rectangle "+(x*y));
	}
	public static void main(String args[])
	{
		ThisKey obj = new ThisKey();
		obj.Area(2,3);
	}
}
import java.util.Scanner;
class Area
{
	Scanner obj = new Scanner(System.in);
	Area(double r)
	{
		double sarea=4/3*(r*r*r);
		System.out.println("Volume of sphere : "+sarea);
	}
	Area(int s)
	{
		int carea=s*s*s;
		System.out.println("Volume of cube : "+carea);
	}
	Area(int l,int b,int h)
	{
		int barea=l*b*h;
		System.out.println("Volume of cuboid : "+barea);
	}
	public static void main(String args[])
	{
		Area obj1 = new Area(1.5);
		Area obj2 = new Area(2);
		Area obj3 = new Area(2,3,4);
	}
}
import java.util.Scanner;
class VariableFinal
{
	public static void main(String args[])
	{
		double r;
		final double pi=3.14;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter radius : ");
		r=obj.nextDouble();
		double area=pi*r*r;
		double cir=2*pi*r;
		System.out.println("Area : " + area);
		System.out.print("Circumference : " + cir);
	}
}
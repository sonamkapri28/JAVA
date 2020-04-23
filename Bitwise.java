import java.util.Scanner;
class Bitwise
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a,b;
		System.out.println("Sonam");

		System.out.print("Enter a : ");
		a=obj.nextInt();
		System.out.print("Enter b : ");
		b=obj.nextInt();

		System.out.print("Not Operation ");
		int not = ~a;
		System.out.println(not);

		System.out.print("AND Operation ");
		int and = a&b;
		System.out.println(and);

		System.out.print("OR Operation ");
		int or = a|b;
		System.out.println(or);

		System.out.print("EX-OR Operation ");
		int exor = a^b;
		System.out.println(exor);

		System.out.print("Left Shift Operation ");
		int lshift = a<<2;
		System.out.println(lshift);

		System.out.print("Right Shift Operation ");
		int rshift = a>>2;
		System.out.println(rshift);

		System.out.print("Right Shift fill zero Operation ");
		int rzshift = a>>>2;
		System.out.println(rzshift);

		System.out.print("AND and EQUAL Operation ");
		int eand = a&=b;
		System.out.println(eand);

		System.out.print("OR and EQUAL Operation ");
		int eor = a|=b;
		System.out.println(eor);

		System.out.print("Left Shift and EQUAL Operation ");
		int elshift = a<<=2;
		System.out.println(elshift);

		System.out.print("Right Shift and EQUAL Operation ");
		int ershift = a>>=2;
		System.out.println(ershift);

		System.out.print("Right Shift fill zero and EQUAL Operation ");
		int erzshift = a>>>=2;
		System.out.println(erzshift);
	}
}
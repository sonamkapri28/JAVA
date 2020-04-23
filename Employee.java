import java.util.Scanner;

class Employee
{
	Scanner obj = new Scanner(System.in);
	int id,bsal,hra,da;
	double tax,inc,tsal;
	String name;
	public void input()
	{
		System.out.print("Enter employee id : ");
		id=obj.nextInt();
		System.out.print("Enter employee name : ");
		name=obj.next();
		System.out.print("Enter employee basic salary : ");
		bsal=obj.nextInt();
		System.out.print("Enter employee HRA : ");
		hra=obj.nextInt();
		System.out.print("Enter employee DA : ");
		da=obj.nextInt();
	}
	public void tax_reduction()
	{
		tax=0.1*bsal;
	}
	public void increment()
	{
		if(bsal>=10000 && bsal<=20000)
		{
			inc=0.1*bsal;
		}
		else if(bsal>=21000 && bsal<=40000)
		{
			inc=0.2*bsal;
		}
		else
		{
			inc=0.5*bsal;
		}
	}
	public void cal_sal()
	{
		tsal=bsal+hra+da+inc-tax;
	}
	public void display()
	{
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee basic salary : "+bsal);
		System.out.println("Employee HRA : "+hra);
		System.out.println("Employee DA : "+da);
		System.out.println("Employee increment : "+inc);
		System.out.println("Employee tax reduction : "+tax);
		System.out.println("Employee total salary : "+tsal);
	}
	public static void main(String args[])
	{
		Employee ob[] = new Employee[2];
		for(int i=0;i<2;i++)
		{
			ob[i]=new Employee();
		}
		for(int i=0;i<2;i++)
		{
			ob[i].input();
			ob[i].tax_reduction();
			ob[i].increment();
			ob[i].cal_sal();
			ob[i].display();
		}
	}
}
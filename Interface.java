import java.util.Scanner;

interface Vehicle
{
	void change_gear();
	void speed_up();
	void apply_break();
}
class Bike implements Vehicle
{
	int tyre1,pass1;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter no of tyres in bike :  ");
		tyre1 = sc.nextInt();

		System.out.println("Enter no of passengers in bike :  ");
		pass1 = sc.nextInt();
	}
	public void change_gear()
	{
		System.out.println("In Class Bike Changing gear ");
	}
	public void speed_up()
	{
		System.out.println("In Class Bike Speeding up ");
	}
	public void apply_break()
	{
		System.out.println("In Class Bike Appling break");
	}
	public void display()
	{
		System.out.println("In Class Bike Tyres :  " + tyre1);
		System.out.println("In Class Bike Passengers :  " + pass1);
	}	
}
class Car implements Vehicle
{
	Scanner sc = new Scanner(System.in);
	int tyre2,pass2;
	
	public void input()
	{
	System.out.println("Enter no of tyres in  Car :  ");
	tyre2 = sc.nextInt();

	System.out.println("Enter no of passengers in  Car :  ");
	pass2 = sc.nextInt();
	}
	public void change_gear()
	{
		System.out.println("In Class  Car Changing gear ");
	}
	public void speed_up()
	{
		System.out.println("In Class  Car Speeding up ");
	}
	public void apply_break()
	{
		System.out.println("In Class  Car Appling break");
	}
	public void display()
	{
		System.out.println("In Class  Car Tyres :  " + tyre2);
		System.out.println("In Class  Car Passengers :  " + pass2);
	}	
}
class Interface
{
	public static void main(String args[])
	{
		Bike b = new Bike();

		b.input();
		b.change_gear();
		b.speed_up();
		b.apply_break();
		b.display();

		Car c = new Car();
		
		c.input();
		c.change_gear();
		c.speed_up();
		c.apply_break();
		c.display();
	}
}
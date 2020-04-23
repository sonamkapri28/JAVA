import java.util.Scanner;
class Matrix
{
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	
	int d[][]=new int[2][2];
	Scanner obj = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter first matrix ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Enter second matrix ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
	} 
	void add()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	void mul()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				d[i][j]=0;
				for(int k=0;k<2;k++)
				{
					d[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	}
	
	void display()
	{
		
		System.out.println("Matrix ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(d[i][j] );
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Matrix m =new Matrix();
		Scanner ob=new Scanner(System.in);
		int choice;
		System.out.println("Sonam");
		System.out.println("1.Addition \n2.Multiplication ");
		choice=ob.nextInt();
		if(choice==1)
		{
			m.input();
			m.add();
			m.display();
		}
		else if(choice==2)
		{
			m.input();
			m.mul();
			m.display();
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
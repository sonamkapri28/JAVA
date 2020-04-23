import java.util.Scanner;
class Stack
{
	int stack[]=new int [11];
	int top;
	Scanner obj = new Scanner(System.in);
	public void push()
	{
		System.out.print("Enter 10 elements in stack : ");
		for(int i=0;i<10;i++)
		{
			stack[i]=obj.nextInt();
			top++;
		}
	}
	public void pop()
	{	
		top--;
	        int value=stack[top];
		System.out.println("Popped element is : "+value);
			
	}
	public void traversal()
	{
		System.out.print("Traversal : ");
		for(int i=0;i<top;i++)
		{
			System.out.print(stack[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Stack ob = new Stack();
		ob.push();
		ob.pop();
		ob.pop();
		ob.traversal();
	}
}
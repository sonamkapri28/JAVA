import java.util.LinkedList;

public class MyLinkedList 
{

	public static void main(String args[ ]) 
	{

		LinkedList link = new LinkedList();

		link.add(new Double(2.0));

		link.addLast(new Double(3.0));

		link.addFirst(new Double(1.0));

		Object array[ ] = link.toArray( );

		for(int x=0; x<3; x++) 
		{
			System.out.println(array[x]);
		}

	}

}
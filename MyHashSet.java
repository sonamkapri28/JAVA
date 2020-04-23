import java.util.*;

public class MyHashSet
{
public static void main(String args[])
{
	HashSet hash = new HashSet();

	hash.add("a");
	hash.add(1);
	hash.add("b");
	hash.add(2);

	Iterator iterator = hash.iterator();
	 while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}	
}
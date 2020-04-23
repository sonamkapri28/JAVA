import java.util.ArrayList;

public class MyArrayList
 {

	public static void main(String args[])
	 {

		ArrayList alist = new ArrayList( );

		alist.add(new String("One"));

		alist.add(new String("Two"));

		alist.add(new String("Three"));

		System.out.println(alist.get(0));

		System.out.println(alist.get(1));

		System.out.println(alist.get(2));

	}

}
import java.io.*;

class BRReadlines
{
	public static void main(String args[])
	throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;

		System.out.println("Enter line of text : ");
		System.out.println("Enter 'Stop' to quit ");

		do{
			str = br.readLine();
			System.out.println(str);
		  }while(!str.equals("stop"));
	}
}
import java.net.*;

class InetAddressTest

{ 
	public static void main(String args[]) throws UnknownHostException 
	{

		try{
		InetAddress Address = InetAddress.getLocalHost();

		System.out.println(Address);

		Address = InetAddress.getByName("www.ipu.ac.in");

		System.out.println(Address);

		InetAddress SW[] = InetAddress.getAllByName("www.yahoo.co.in");

		for (int i=0; i<SW.length; i++)

			System.out.println(SW[i]); 
		}
		catch(Exception e){}
	}
}